import java.util.Scanner;

public class EjerciciosNivelacion {
    static Scanner teclado=new Scanner(System.in);
    public static void areatriangulo() {
        //declarar variables
        double b=0, h=0;
        //datos de entrada en el proceso de
        //necesitamos que nos imprimar el valor de las variables
        //formula: b*h/2
        System.out.println("ingrese la base: ");
        b=teclado.nextInt();
        System.out.println("ingrese la altura: ");
        h=teclado.nextInt();

        System.out.println("el area de tu triangulo es de: "+b*h/2);//el + es para concatenar
    }

    public static void cambioTipodinero() {
        //Variables
        double saldo=0;
        double cambio = 3.75;
        //datos de entrada
        System.out.println("ingrese el saldo que tienes: ");
        saldo=teclado.nextDouble();

        System.out.println("tu saldo e dolares es: "+saldo/cambio); 
     
    }
    public static void edadPersona() {
        //Variables
        int añoNac=0, añoActual=0, edad =0;
      
        //datos de Entrada
        System.out.println("ingrese el año de nacimiento: ");
        añoNac=teclado.nextInt();
        System.out.println("ingrese el actual: ");
        añoActual=teclado.nextInt();
        //datos de Salida
        edad=añoActual-añoNac;
        System.out.println("su edad es:"+edad);
       
    }
 
    public static void main(String[] args) {
        //System.out.println("calcular el area de un triangulo");
        System.out.println("la edad de la persona es");
        //areatriangulo();
        //cambioTipodinero();
        edadPersona();
    }
}
