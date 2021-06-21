
import java.util.Random;
import java.util.Scanner;


public class ejercicios {
    static Scanner teclado=new Scanner(System.in);
    //ejercicio 4.1
    public static void salarioprofesorWHILE() {
        //Vafriables
        
       double salario;
       //datos de entrada
       int Sinicial=1500, año=1;
       double increm=0.1;//10%
       //proceso 
       System.out.println("su salario inicial es "+Sinicial);
       salario = Sinicial+(Sinicial*increm);
       while (año<=6) {
            System.out.print("al termino del "+año+"° año ");
            System.out.println("sera: "+salario);
            salario = salario+(salario*increm);
            año++;
       }
    }
    //ejercicio 4.2
    public static void pagoHamburgesasDOWHILE() {
        //Daclarar Variables
        String tipoPago;
        int cantidad;
        double totalPago=0;
        int contador=1;
        //proceso y datos de Entrada
        do {
            if (contador==1) {
                System.out.println("Ingrese la cantidad de hamburgesas simples:");
                cantidad=teclado.nextInt();
                totalPago=totalPago+cantidad*20;
            }
            if (contador==2) {
                System.out.println("Ingrese la cantidad de hamburgesas Dobles:");
                cantidad=teclado.nextInt();
                totalPago=totalPago+cantidad*25;
            }
            if (contador==3) {
                System.out.println("Ingrese la cantidad de hamburgesas Triples:");
                cantidad=teclado.nextInt();
                totalPago=totalPago+cantidad*28;
            }  
            contador++;                  
        } while (contador<=3);
        //datos de salida, entrada
        System.out.println("Ingrese la forma de pago (Con tarjeta=CT, Sin tarjeta=ST):");
        tipoPago=teclado.next();
        if (tipoPago.toUpperCase().equals("CT")) {
            totalPago=totalPago+totalPago*0.05;
        } 
        System.out.println("El monto total a pagar es:"+totalPago);
    }
    //ejercicio 4.3
    public static void contarNumerosPosNegCer() {
        //Variables
        int nNumeros, cantCero=0, cantNeg=0, cantPos=0;
        double numeros;
        //datos de entrada 
        System.out.println("ingrese n cantidad:");
        nNumeros=teclado.nextInt();
        //proceso 
        for (int numero=1; numero <= nNumeros; numero++) {
            System.out.println("ingrese el valor de la posicion "+numero+":");
            numeros=teclado.nextDouble();
            if (numeros<0) {cantNeg++;}
            if (numeros>0) {cantPos=cantPos+1;}
            if (numeros==0) {cantNeg+=1;}
        }
        //datos de Salida
        System.out.println("de total de numeros;\n"+cantCero+"es/son cero(s)"+
        "\n"+cantNeg+"es/son menor(es) de cero"+
        "\n"+cantPos+"es/son mayor(es) de cero"
        );
    }
    //ejercicio 4.4
    public static void numeroFocoColor() {
        //definir Variables
        int NFocos, FVerde=0, FBlanco=0, FRojo=0;
        //Datos de entrada
        System.out.println("Ingrese N cantidad de Focos:");
        NFocos=teclado.nextInt();
        //Proceso
        for (int foco = 1; foco <= NFocos; foco++) {
            System.out.print("Ingrese el color (V=Verde, B=Blanco y R=Rojo) "+
            "del foco numero "+foco+":");
            String color=teclado.next();
            if(color.toUpperCase().equals("V")){ FVerde++; }
            if(color.toUpperCase().equals("B")){ FBlanco++; }
            if(color.toUpperCase().equals("R")){ FRojo++; }
           
        }
        //Datos de salida
        System.out.println("Del total de focos:\n"+FVerde+" son Verde(s)\n"+
        FBlanco+" son Blanco(s)\n"+FRojo+" son Rojo(s)\nEn total son:"+NFocos);
    }
    //ejercicio4.5
    public static void ahorroDiarioAnual() {
        //variables 
        double ahorroDiario;
        //datos de entrada 
        double ahorro1Enero=3;//dia 1
       //un año tiene 365 dias
        for (int dia = 1; dia <= 365; dia++) {
            System.out.println("el ahorro en el");
            ahorroDiario=Math.pow(ahorro1Enero,dia);
            System.out.println("dia "+dia+" es "+ahorroDiario+ " pesos");
            
        }    
    }
    
    public static void ahorroDiarioAnualWHILE() {
        //variables 
        double ahorroDiario;
        //datos de entrada 
        double ahorro1Enero=3;//dia 1
        //un año tiene 365 dias
        int dia=1;
        while (dia <= 365) {
            System.out.println("el ahorro en el");
            ahorroDiario=Math.pow(ahorro1Enero,dia);
            System.out.println("dia "+dia+" es "+ahorroDiario+ " pesos");
            dia++;
        }   
    } 

    public static void ahorroDiarioAnualDOWHILE() {
        //variables 
        double ahorroDiario;
        //datos de entrada 
        double ahorro1Enero=3;//dia 1
        //un año tiene 365 dias
        int dia=1;
        do {
            System.out.println("el ahorro en el");
            ahorroDiario=Math.pow(ahorro1Enero,dia);
            System.out.println("dia "+dia+" es "+ahorroDiario+ " pesos");
            dia++;
        } while (dia<=365);  
    } 
    //ejercicio 4.6-a
    public static void salarioprofesorDOWHILE() {
        //Vafriables
        
       double salario;
       //datos de entrada
       int Sinicial=1500, año=1;
       double increm=0.1;//10%
       //proceso 
       System.out.println("su salario inicial es "+Sinicial);
       salario = Sinicial+(Sinicial*increm);
       do {
            System.out.print("al termino del "+año+"° año ");
            System.out.println("sera: "+salario);
            salario = salario+(salario*increm);
            año++;
       } while (año<=6);
    }
    //ejercicio 4.6-b
    public static void salarioProfesorFOR() {
        //Vafriables 
       double salario;
        //datos de entrada
        int Sinicial=1500;
        double increm=0.1;//10%
        //proceso 
        System.out.println("su salario inicial es "+Sinicial);
        salario = Sinicial+(Sinicial*increm);
        for (int año = 1; año<=6; año++) {
            System.out.print("al termino del "+año+"° año ");
            System.out.println("sera: "+salario);
            salario = salario+(salario*increm);
        }
    }
    
    //ejercicio4.7 - a
    public static void pagoHamburgesasWHILE() {
        //Daclarar Variables
        String tipoPago;
        int cantidad;
        double totalPago=0;
        int contador=1;
        //proceso y datos de Entrada
        while (contador<=3){
            if (contador==1) {
                System.out.println("Ingrese la cantidad de hamburgesas simples:");
                cantidad=teclado.nextInt();
                totalPago=totalPago+cantidad*20;
            }
            if (contador==2) {
                System.out.println("Ingrese la cantidad de hamburgesas Dobles:");
                cantidad=teclado.nextInt();
                totalPago=totalPago+cantidad*25;
            }
            if (contador==3) {
                System.out.println("Ingrese la cantidad de hamburgesas Triples:");
                cantidad=teclado.nextInt();
                totalPago=totalPago+cantidad*28;
            }  
            contador++;                  
        }
        //datos de salida, entrada
        System.out.println("Ingrese la forma de pago (Con tarjeta=CT, Sin tarjeta=ST):");
        tipoPago=teclado.next();
        if (tipoPago.toUpperCase().equals("CT")) {
            totalPago=totalPago+totalPago*0.05;
        } 
        System.out.println("El monto total a pagar es:"+totalPago);
    }

    //ejercicio4.7 - b
    public static void pagoHamburgesasFOR() {
        //Daclarar Variables
        String tipoPago;
        int cantidad;
        double totalPago=0;
        //proceso y datos de Entrada
        for (int contador= 1; contador <=3; contador++) {
        
            if (contador==1) {
                System.out.println("Ingrese la cantidad de hamburgesas simples:");
                cantidad=teclado.nextInt();
                totalPago=totalPago+cantidad*20;
            }
            if (contador==2) {
                System.out.println("Ingrese la cantidad de hamburgesas Dobles:");
                cantidad=teclado.nextInt();
                totalPago=totalPago+cantidad*25;
            }
            if (contador==3) {
                System.out.println("Ingrese la cantidad de hamburgesas Triples:");
                cantidad=teclado.nextInt();
                totalPago=totalPago+cantidad*28;
            }  
                             
        }
        //datos de salida, entrada
        System.out.println("Ingrese la forma de pago (Con tarjeta=CT, Sin tarjeta=ST):");
        tipoPago=teclado.next();
        if (tipoPago.toUpperCase().equals("CT")) {
            totalPago=totalPago+totalPago*0.05;
        } 
        System.out.println("El monto total a pagar es:"+totalPago);
    }
    //ejercicio 4.8
    public static void TotalApagarArticulos() {
        //Daclarar Variables
        double montoPagarArt=0, montoPagarT=0, precio, descuento;
        int cantArt1=0, cantArt2=0, cantArt3=0;
        double CantArticulo;
        //datos de Entrada
        System.out.print("Ingrese N cantidad de articulos: ");
        CantArticulo=teclado.nextInt();
        Random precioAleatorio = new Random();
        //Proceso
        for (int art=1; art<=CantArticulo; art++) {
            System.out.println("");
            precio = precioAleatorio.nextInt(300-1); //el precio maximo es solo un spuesto
            System.out.println("El precio del articulo es: "+precio);
            if (precio>200) {cantArt1++;} 
            if (precio<200) if (precio>100) {cantArt2++;} 
            if (precio<=100) {cantArt3++;}
            
            
            if (precio>200) {
                montoPagarArt=precio-(precio*0.15);
                descuento=precio*0.15;
                System.out.println("El  monto a pagar del articulo es "+montoPagarArt+ " y su descuento es "+descuento);}
                
            if (precio<200) if (precio>100) {
                montoPagarArt=precio-(precio*0.12);
                descuento=precio*0.12;
                System.out.println("El  monto a pagar del articulo es: "+montoPagarArt+ " y su descuento es "+descuento);}
                
            if (precio<=100) {
                montoPagarArt=precio-(precio*0.10);
                descuento=precio*0.10;
                System.out.println("El  monto a pagar del articulo es: "+montoPagarArt+ " y su descuento es "+descuento); }  
        montoPagarT= montoPagarT+montoPagarArt;
        }
        //datos de salida
        System.out.println("\nDel total de articulos:\n"+cantArt1+" es/son de precio mayor a 200 soles"+
        "\n"+cantArt2+" es/son de precio entre 200 y 100 soles"+
        "\n"+cantArt3+" es/son de precio menores o iguaes a 100 soles"
        );
        System.out.println("\nEl precio total de todos los articulos es: "+montoPagarT+" soles");
        
    
    }
    //ejercicio 4.9
    public static void inversionmensual() {
            //variables
            double Dmensual, IfijoAnual, monto=0, capAnual=0;
            int meses, Naños;
            //datos de entrada
            System.out.print("Ingrese el deposito mensual: ");
            Dmensual=teclado.nextDouble();
            System.out.print("ingrese el año limite de su inversion: ");
            Naños=teclado.nextInt();
            IfijoAnual=0.10;
            meses=12;
            for (int año = 1; año <= Naños; año++) {
                capAnual = monto + (capAnual+Dmensual*meses);
                monto = capAnual + (capAnual*IfijoAnual);
                System.out.println("\nEl  capital total del año "+año+ " es: "+capAnual+
                " \ny su monto (capital + interes que recibe) es: "+monto);
            }
        }
    //ejercicio 4.11
    public static int hallarFactorial(int numero) {
        int factorialResult=1;
        if(numero>1){
            for (int i = 2; i <= numero; i++) {
                factorialResult*=i;
            }
        }
        return factorialResult;        
    }
    public static void calcularFuncionExponecial() {
        //Declarar Variables
        int x, lfx;
        double fx=0;
        //Datos de entrada
        System.out.println("Ingrese un numero para calcular la funcion exponencial:");
        x=teclado.nextInt();
        System.out.println("Ingrese el limite de la funcion exponencial:");
        lfx=teclado.nextInt();    
        //Proceso
        if(x!=0){
            for (int i = 0; i < lfx; i++) {
                System.out.println(fx);
                fx=fx+((Math.pow(x, i))/hallarFactorial(i));
            }
        }
        //Datos de salida
        System.out.println("La funcion exponencial de e^x es:"+fx);
    }
    //ejercicio 4.16
    public static void CuboNumpositicos() {
        System.out.println("el cubo de los numeros naturales");
        //variables
        int CuboNum, Num= 0;
        do {
            System.out.print("digite el numero natural: ");
               Num= (int)teclado.nextDouble();
            if (Num>0) {

                CuboNum = (int)Math.pow(Num, 3);
                System.out.println("el cubo del numero "+Num+ " es: "+CuboNum);
            } else {
                System.out.println("el numero que digitaste es negativo");
            }
        } while (Num>0);
        
    }
    //ejercicio 4.17
    public static void TablaDeMultiplicacionENtero() {
        System.out.println("Tabla de multiplicación");
        //variables
        int n, multiplicador;
        //datos de entrada 
        System.out.print("\ningrese el numero entero positivo a multiplicar: ");
        n = teclado.nextInt();
        System.out.print("ingrese el limite de tu multiplicador: ");
        multiplicador=teclado.nextInt();  
        if (n>0) {
            for (int i=1; i<=multiplicador; i++){
                System.out.println(n+"x"+i+" = "+n*i);
            }
        } else {
            System.out.println("el numero que ingresaste es incorrecto" ); 
        }
        System.out.println("gracias!!!");
    }
    //ejercicio 4.19
    public static void ImpuestoPagaraAutomoviles() {
        //definir variables
        double ToImpPagar=0, ImpUniV=0, ImpToCategoria=0;
        //Proceso/Datos entra/Datos de salida
        for (int categoria = 1; categoria <= 3; categoria++) {
            System.out.print("Ingrese la cantidad de automoviles de categoria "+categoria+":  ");
            int cantidadA=teclado.nextInt();
            System.out.print("Ingrese el valor de automoviles de categoria "+categoria+":  ");
            double valorA=teclado.nextInt(); 
            if (categoria==1) {ImpUniV=valorA*0.10;}
            if (categoria==2) {ImpUniV=valorA*0.07;}
            if (categoria==3) {ImpUniV=valorA*0.05;}
            //para imprimir por categoria sus impuestos
            ImpToCategoria=ImpUniV*cantidadA;
            ToImpPagar+=ImpToCategoria;
            System.out.println("El impuesto a pagar por cada automovil de categoria "+categoria+" es:  "+ImpUniV);
            System.out.println("El total impuesto de cateroria "+categoria+" es:  "+ImpToCategoria);
            System.out.println("\n");
        }
        System.out.println("El total de impuesto por todos los vehiculos es:  "+ToImpPagar);
    }
    //ejercicio 4.20
    public static int hallarFactorialparasenox(int numero) {
        int factorialResult=1;
        if(numero>1){
            for (int i = 2; i <= numero; i++) {
                factorialResult*=i;
            }
        }
        return factorialResult;        
    }
    public static void calcularFuncionExponecialparasenox() {
        //Declarar Variables
        int x, lfx;
        double fx=0;
        //Datos de entrada
        System.out.println("Ingrese un numero para calcular la funcion exponencial:");
        x=teclado.nextInt();
        System.out.println("Ingrese el limite de la funcion exponencial:");
        lfx=teclado.nextInt();    
        //Proceso
        if(x!=0){
            for (int i = 0; i < lfx; i++) {
                System.out.println(fx);
                
                fx=fx+((Math.pow(x, i))/hallarFactorial(i));
            }
        }
        //Datos de salida
        System.out.println("La funcion exponencial de e^x es:"+fx);
    }
    public static void hallarSenoX() {
        //Declarar Variables
        int senx, lfunSenx;        
        //Datos de entrada
        System.out.println("Ingrese un numero X:");
        senx=teclado.nextInt();
        System.out.println("Ingrese el limite de la funcion x:");
        lfunSenx=teclado.nextInt();     
        double fresulSenX=0;
        //proceso        
        int contSigno=0;
        if(senx!=0){
            for (int i = 1; i < lfunSenx; i+=2) {                
                
                System.out.println("i="+i);
                if (contSigno%2==0) {
                    System.out.println("signo +");
                    fresulSenX=fresulSenX+((Math.pow(senx, i))/hallarFactorial(i));
                } else {
                    fresulSenX=fresulSenX-((Math.pow(senx, i))/hallarFactorial(i));
                    System.out.println("signo -");
                }
                contSigno++;
            }
        }         
        //Datos de de salida
        System.out.println("Sen x es:"+fresulSenX);
        
    }
    //ejercicio 4.21
    public static void Cantmonedas() {
        //definir Variables
        int montototal = 0;
        int cantidad=0;
        System.out.println("ingrese la cantidad de dinero");
        cantidad=teclado.nextInt();
        String [] tipodineroaleatorio = new String[cantidad];
        String [] tipodinero = { "monedas 10 pesos", "monedas 5 pesos", "monedas 1 peso", "Billetes 10 pesos", "Billetes 20 pesos", "Billetes 50 pesos"};
        //Datos de entrada
        int  monedas10pesos=0, monedas5pesos=0, moneda1peso=0, Billetes10pesos=0, Billetes20pesos=0, Billetes50pesos=0;
        //Proceso
        for (int i = 0; i < cantidad; i++) {
            tipodineroaleatorio [i] = tipodinero[(int) (Math.floor(Math.random() * ((tipodinero.length - 1) - 0 + 1) + 0))];
            System.out.println(""+tipodineroaleatorio [i]+" ");
            if(tipodineroaleatorio[i]=="monedas 10 pesos"){monedas10pesos++; }
            if(tipodineroaleatorio[i]=="monedas 5 pesos"){monedas5pesos++; }
            if(tipodineroaleatorio[i]=="monedas 1 peso"){moneda1peso++; }
            if(tipodineroaleatorio[i]=="Billetes 10 pesos"){Billetes10pesos++; }
            if(tipodineroaleatorio[i]=="Billetes 20 pesos"){Billetes20pesos++; }
            if(tipodineroaleatorio[i]=="Billetes 50 pesos"){Billetes50pesos++; }  
        } 
        System.out.println("del total de la cantidad de monedas y billetes:\n"+moneda1peso+" son monedas de 1 peso\n"+
        monedas5pesos+" son monedas de 5 pesos\n"+
        monedas10pesos+" son monedas de 10 pesos\n"+
        Billetes10pesos+" son billetes de 10 pesos\n"+
        Billetes20pesos+" son billetes de 20 pesos\n"+
        Billetes50pesos+" son billetes de 50 pesos\n"+
        "y la cantidad total de monedas y billetes es :"+cantidad
        );
        montototal=(moneda1peso*1)+(monedas5pesos*5)+(monedas10pesos*10)+(Billetes10pesos*10)+(Billetes20pesos*20)+(Billetes50pesos*50);
        System.out.println("ademas el monto total es:"+montototal+"pesos");
    }
    public static void main(String[] args) {
        //salarioprofesorWHILE();
        //pagoHamburgesasDOWHILE();
        //contarNumerosPosNegCer();
        //numeroFocoColor();
        //ahorroDiarioAnual();
        //ahorroDiarioAnualWHILE();
        //ahorroDiarioAnualDOWHILE();
        //salarioprofesorDOWHILE();
        //salarioProfesorFOR();
        //pagoHamburgesasWHILE();
        //pagoHamburgesasFOR();
        //TotalApagarArticulos();
        //inversionmensual();
        /*System.out.println("Ingrese un numero para calcular su factorial:");
        int numerox=teclado.nextInt();
        System.out.println("Factoria de "+numerox+" es:"+ hallarFactorial(numerox));
        //calcularFuncionExponecial();*/
        //CuboNumpositicos();
        //TablaDeMultiplicacionENtero();
        //ImpuestoPagaraAutomoviles();
        //sueldosemanal();
        /*System.out.println("Ingrese un numero para calcular su factorial:");
        int numerox=teclado.nextInt();
        System.out.println("Factorial de "+numerox+" es:"+ hallarFactorial(numerox));*/
        //calcularFuncionExponecialparasenox();
        //hallarSenoX();
        //Cantmonedas();//ingresar el dinero que hay en el monedero
        
        
    }
}