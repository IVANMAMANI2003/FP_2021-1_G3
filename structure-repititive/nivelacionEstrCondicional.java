import java.util.Scanner;

public class nivelacionEstrCondicional {
    static Scanner teclado=new Scanner(System.in);
    public static void division() {
        //variables
        int numero, divisor=0;
        double cociente=0.0;
        //datos de entrada
        System.out.println("ingrese el numero que quieres dividir: ");
        numero=teclado.nextInt();
        System.out.println("ingrese el divisor: ");
        divisor=teclado.nextInt();
        //proceso
        if(numero!=0) {
            cociente=numero/divisor;
            System.out.println("el cociente es: "+cociente);
        }
    }

    public static void conAnidadoElse() {
        //variables
        int numero1=0;
        //datos de entrada
        System.out.println("Ingrese el numero: ");
        numero1=teclado.nextInt();
       if(numero1<0){
           System.out.println("Este numero es negativo");
       }else{
           if (numero1==0) {
               System.out.println("el numero es cero");
           } else {
               System.out.println("el numero es positivo");
           }
       }

    }

    public static void costoydescuento() {
        //variables 
        double costo=0, precio, descuento;
        //datos de entrada
        //proceso 
        System.out.println("ingrese el costo del articulo: ");
        costo=teclado.nextDouble();
        if(costo>=200){
            precio=costo-(costo*0.15);
            descuento=costo*0.15;
            System.out.println("el precio del articulo es: "+precio);
            System.out.println("el descuento del articulo es:"+descuento);
        
        }else{
            if (costo>100 && costo<200) {
                precio=costo-(costo*0.12);
                descuento=costo*0.12;
                System.out.println("el precio del articulo es: "+precio);
                System.out.println("el descuento del articulo es:"+descuento);
            } else {
                precio=costo-(costo*0.1);
                descuento=costo*0.1;
                System.out.println("el precio del articulo es: "+precio);
                System.out.println("el descuento del articulo es:"+descuento);
                
            }
        }
    }

    public static void verificadorHora() {
        //variables
        int H=0, M=0, S=0;
        System.out.println("ingrese la hora: ");
        H=teclado.nextInt();
        System.out.println("ingresa los minutos: ");
        M=teclado.nextInt();
        System.out.println("ingresa los segundos: ");
        S=teclado.nextInt();
        if (H>=0 && H<=24 && M>=0 && M<=60 && S>=0 && S<=60 ) {
            System.out.println("la hora es: "+H+":"+M+" con "+S+" segundos");
        } else {
            System.out.println("los datos que has intodicido es incorrecto");
        }
    }

/*   public static void temperatura() {
        //Daclarar Variables
        int temperatura=0, clima=0;
        //datos de entrada
        System.out.println("Ingresa la temperatura");
        temperatura=teclado.nextInt();
        System.out.println("Ingresa el tipo de clima :\n hace sol=1, esta lluviendo=2, esta haciendo frio=3");
        clima=teclado.nextInt();
        if (temperatura>25) {
            System.out.println("la temperatura es muy comodo para que vayas a la playa");

        } else {
            
        }
    }*/
  public static void main(String[] args) {
      //division();
      //conAnidadoElse();
      //costoydescuento();
      //verificadorHora();
  }

}
