package pe.edu.upeu.dao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.ProductoTO;
import pe.edu.upeu.modelo.VentaDetalleTO;
import pe.edu.upeu.modelo.VentaTO;
import pe.edu.upeu.util.ImprimirArreglos;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

public class VentaDao extends AppCrud{
   LeerArchivo lar;
   LeerTeclado lte=new LeerTeclado();
   UtilsX ut=new UtilsX();
   ProductoTO prodTO;
   VentaTO ventTO;
   VentaDetalleTO vdTO;
   SimpleDateFormat formato=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
   SimpleDateFormat formatoFecha=new SimpleDateFormat("dd-MM-yyyy");    

    public void registroVentaGeneral() {
        VentaTO vTO=crearVenta();
        double precioTotalX=0;
        String continuaV="SI";
        do {
            VentaDetalleTO toVD=carritoVenta(vTO);

            precioTotalX=precioTotalX+toVD.getPrecioTotal();
            
            continuaV=lte.leer("", "Desea comprar algo mas? (SI=S, NO=N):");
        } while (continuaV.charAt(0)=='S');
        vTO.setPrecioTotal(precioTotalX);
        vTO.setNetoTotal(precioTotalX/1.18);
        vTO.setIgv(vTO.getNetoTotal()*0.18);
        lar=new LeerArchivo("Venta.txt");
        editarRegistro(lar, 0, vTO.getIdVenta(), vTO);        
    }

    public VentaTO crearVenta() {
        lar=new LeerArchivo("Venta.txt");
        ventTO=new VentaTO();
        ventTO.setIdVenta(generarId(lar, 0, "V", 1));
        ventTO.setDniCliente(lte.leer("", "Ingrese el DNI del cliente:"));
        ventTO.setFechaVenta(formato.format(new Date()));
        ventTO.setIgv(0.0);
        ventTO.setNetoTotal(0.0);
        ventTO.setPrecioTotal(0.0);
        lar=new LeerArchivo("Venta.txt");
        agregarContenido(lar, ventTO);
        return ventTO;
    }

    public VentaDetalleTO carritoVenta(VentaTO vTO) {
        
        vdTO=new VentaDetalleTO();
        ut.clearConsole();
        System.out.println("*************Agregar Productos a carrito de venta********");
        mostrarProductos();
        vdTO.setIdProducto(lte.leer("", "Ingrese el ID del Producto:"));
        vdTO.setIdVenta(vTO.getIdVenta());
        lar=new LeerArchivo("VentaDetalle.txt");
        vdTO.setIdVentaDetalle(generarId(lar, 0, "DV", 2));
        lar=new LeerArchivo("Producto.txt");
        Object[][] dataP=buscarContenido(lar, 0, vdTO.getIdProducto());
        double porcentUtil=Double.parseDouble(String.valueOf(dataP[0][5]));
        double punit=Double.parseDouble(String.valueOf(dataP[0][4]));
        vdTO.setPorcentUtil(porcentUtil);
        vdTO.setPrecioUnit(punit+punit*porcentUtil);
        vdTO.setCantidad(lte.leer(0.0, "Ingrese una cantidad:"));
        vdTO.setPrecioTotal(vdTO.getCantidad()*vdTO.getPrecioUnit());
        lar=new LeerArchivo("VentaDetalle.txt");
        agregarContenido(lar, vdTO);
        return vdTO;
    }

    public void mostrarProductos() {
        lar=new LeerArchivo("Producto.txt");
        Object[][] dataP=listarContenido(lar);
        for (int i = 0; i < dataP.length; i++) {
            System.out.print(dataP[i][0]+"="+dataP[i][1]+
            "(P.Unit S/.:"+dataP[i][4]+", Stock:"+dataP[i][6]+"); ");
        }
        System.out.println("");
    }

    public void reporteProductosMasVendidos() {
        lar=new LeerArchivo("VentaDetalle.txt");
        Object[][] dataVent=listarContenido(lar);
        Object[][] dataMV=cantidadProducMasVendidos(dataVent);
        masVendidos(dataMV);   
           
    }

    public void masVendidos(Object[][] data) {
        List<VentaDetalleTO> dataX=new ArrayList<VentaDetalleTO>();
        for (Object[] dvTO : data) {
           dataX.add(new VentaDetalleTO(Double.parseDouble(dvTO[2].toString()), dvTO[0].toString(),dvTO[1].toString(),
            Double.parseDouble(dvTO[3].toString())));
        }
        Collections.sort(dataX, VentaDetalleTO.idProductoComparator);  
        for (VentaDetalleTO ventaDetalleTO : dataX) {
            System.out.println(ventaDetalleTO.idProducto+"\t"+ventaDetalleTO.idVenta+"\t"+ventaDetalleTO.cantidad+"\t"+ventaDetalleTO.precioTotal);     
        }              
    }

    public Object[][] cantidadProducMasVendidos(Object[][] data) {
        List<VentaDetalleTO> dataX=new ArrayList<VentaDetalleTO>();
        for (Object[] dvTO : data) {
           dataX.add(new VentaDetalleTO(dvTO[2].toString(), dvTO[0].toString(),dvTO[1].toString(),
            Double.parseDouble(dvTO[3].toString()),Double.parseDouble(dvTO[4].toString()),
            Double.parseDouble(dvTO[5].toString()), Double.parseDouble(dvTO[6].toString())));
        }
        Collections.sort(dataX, VentaDetalleTO.idProductoComparator);
        //ImprimirArreglos ia=new ImprimirArreglos();
        int cantidadProdDif=0;
        String tempId="";
        for (VentaDetalleTO ventaDetalleTO : dataX) {
            if(!tempId.equals(ventaDetalleTO.idProducto)){
                cantidadProdDif++;
            }   
            tempId=ventaDetalleTO.idProducto;      
        }

        tempId=dataX.get(0).idProducto;
        Object[][] dataReal=new Object[cantidadProdDif][4];
        int indexFilaX=0;
        for (VentaDetalleTO ventaDetalleTO : dataX) {
            if(tempId.equals(ventaDetalleTO.idProducto)){
                System.out.println("Productos distintos:"+ventaDetalleTO.idProducto);
                dataReal[indexFilaX][0]=ventaDetalleTO.idProducto;
                dataReal[indexFilaX][1]=devolverNombreProducto(ventaDetalleTO.idProducto);
                dataReal[indexFilaX][2]=Double.parseDouble(String.valueOf(dataReal[indexFilaX][2]==null?"0":dataReal[indexFilaX][2]))+ventaDetalleTO.getCantidad();
                dataReal[indexFilaX][3]=Double.parseDouble(String.valueOf(dataReal[indexFilaX][3]==null?"0":dataReal[indexFilaX][3]))+ventaDetalleTO.getPrecioTotal();
            }else{
                indexFilaX++;
                System.out.println("Ingrementa fila:"+indexFilaX);
                dataReal[indexFilaX][0]=ventaDetalleTO.idProducto;
                dataReal[indexFilaX][1]=devolverNombreProducto(ventaDetalleTO.idProducto);
                dataReal[indexFilaX][2]=ventaDetalleTO.getCantidad();
                dataReal[indexFilaX][3]=ventaDetalleTO.getPrecioTotal();
            }
            tempId=ventaDetalleTO.idProducto;    
            
        }   

        return dataReal;
    }

    public String devolverNombreProducto(String idProducto) {
        lar=new LeerArchivo("Producto.txt");
        Object[][] dataP=buscarContenido(lar, 0, idProducto);
        return String.valueOf(dataP[0][1]);
    }



    public void reporteVentasPorFechas(){
        System.out.println("**************FReporte de ventas por fechas***************");
        String fechaInit=lte.leer("", "Ingrese Fecha de inicio (DD-MM-YYYY): ");
        String fechaFin=lte.leer("", "Ingrese Fecha de finalizacion (DD-MM-YYYY): ");
        ut.clearConsole();
        lar=new LeerArchivo("Venta.txt");
        Object[][] dataV=listarContenido(lar);
        int cantRegVent=0;
        try {
            for (int i = 0; i < dataV.length; i++) {
                String[] fechaVent=dataV[i][2].toString().split(" ");
                if ( (fechaVent[0].toString().equals(fechaInit) || formatoFecha.parse(fechaVent[0])
                .after(formatoFecha.parse(fechaInit))  ) && 
                (formatoFecha.parse(fechaVent[0])).before(formatoFecha.parse(fechaFin))){
                    cantRegVent++;
                }
            
            }

            Object[][] dataReal=new Object[cantRegVent][dataV[0].length];
            int indexFilaX=0;
            double netoTotalX=0, igvX=0, preciototalX=0;
            for (int i = 0; i < dataV.length; i++) {
                String[] fechaVent=dataV[i][2].toString().split(" ");
                if ( (fechaVent[0].toString().equals(fechaInit) || formatoFecha.parse(fechaVent[0])
                .after(formatoFecha.parse(fechaInit))  ) && 
                (formatoFecha.parse(fechaVent[0])).before(formatoFecha.parse(fechaFin))){
                    for (int j = 0; j < dataV[0].length; j++) {
                        dataReal[indexFilaX][j]=dataV[i][j];
                        if (j==3) {netoTotalX+= Double.parseDouble(String.valueOf(dataV[i][j])); }
                        if (j==4) {igvX+= Double.parseDouble(String.valueOf(dataV[i][j])); }
                        if (j==5) {preciototalX+= Double.parseDouble(String.valueOf(dataV[i][j])); }

                    }
                    indexFilaX++;
                }
            }
            ut.clearConsole();
            System.out.println("*****************Reporte de ventas*****************");
            System.out.println("***********Entre "+fechaInit+" a "+fechaFin+"*****************");
            ut.pintarLine('H', 39);
            ut.pintarTextHeadBody('B', 3, "ID,DNI Cli,F.Venta,Neto S/.,IGV,P.Total");
            ut.pintarLine('H', 39);
            for (Object[] objects : dataReal) {
                String datacont=objects[0]+","+objects[1]+","+
                objects[2]+","+objects[3]+","+objects[4]+","+objects[5];
                ut.pintarTextHeadBody('B', 3, datacont);
            }
            ut.pintarLine('H', 39);
            System.out.println("Neto Total:S/."+ (Math.round(netoTotalX*100.0)/100.0)+" | "+"IGV: S/."+(Math.round(igvX*100.0)/100.0)+" | "+
            "Monto total: S/."+(Math.round(preciototalX*100.0)/100.0));
            ut.pintarLine('H', 39);
        } catch (Exception e) {
            //TODO: handle exception
        }

    }
}