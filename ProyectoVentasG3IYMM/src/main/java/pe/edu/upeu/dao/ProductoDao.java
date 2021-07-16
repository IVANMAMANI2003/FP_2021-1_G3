package pe.edu.upeu.dao;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.CategoriaTO;
import pe.edu.upeu.modelo.ProductoTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

public class ProductoDao extends AppCrud {
    LeerArchivo lar;
    CategoriaTO catTO;
    ProductoTO proTO;
    LeerTeclado lte=new LeerTeclado();
    UtilsX ut=new UtilsX();

    public void RegistrarProducto() {
        proTO= new ProductoTO();
        mostrarCategorias();
        proTO.setIdCeteg(lte.leer("", "Elige el Id de una categoria: "));
        proTO.setNombre(lte.leer("", "ingrese nombre del producto: "));
        lar = new LeerArchivo("Producto.txt");
        proTO.setIdproducto(generarId(lar, 0, "P", 1));
        proTO.setUnidaMed(lte.leer("", "ingrese la unidad de medida: "));
        proTO.setPrecioUnit(lte.leer(0.0, "ingrese el precio unitario: "));
        proTO.setPorcentUtil(lte.leer(0.0, "ingrese el porcentaje de utilidad: "));
        proTO.setStok(lte.leer(0, "ingrese el stok: "));
        lar = new LeerArchivo("Producto.txt");
        agregarContenido(lar, proTO);
    }


    public void mostrarCategorias() {
        lar = new LeerArchivo("Categoria.txt");
        Object[][] datax=listarContenido(lar);
        for (int i = 0; i < datax.length; i++) {
            
        System.out.print(datax[i][0]+"="+datax[i][1]+", ");
        }
        System.out.println("");
    }
    

    public void reportarProducto() {
        lar = new LeerArchivo("Producto.txt");
        imprimirLista(listarContenido(lar));

    }

    public void reportarProductoT() {
        lar = new LeerArchivo("Producto.txt");
        Object[][] data=listarContenido(lar);
        ut.pintarLine('H', 31);
        ut.pintarTextHeadBody('H', 2, "ID,Nombre,IdCateg,U.Medida,P.Unit,Porc,Stock");
        System.out.println("");
        ut.pintarLine('H', 31);

        String dataB="";
        for (int i = 0; i < data.length; i++) {
            dataB=data[i][0]+","+data[i][1]+","+data[i][2]+","+data[i][3]+","+data[i][4]+","+data[i][5]+","+data[i][6];
        
        ut.pintarTextHeadBody('B', 2, dataB);
        }
    }
}
