import java.util.Scanner;

class AreaTriangulo{
static Scanner teclado=new Scanner(System.in);
public static void main(String [] arg){
  //Definir Variables y otros
  System.out.println("Hola Mundo");
  int b, h, area;
  //datos de entrada
  System.out.println("Ingrese la Base:");
  b=teclado.nextInt();
  System.out.println("Ingrese la altura:");
  h=teclado.nextInt();
  //proceso
  area=(b*h)/2;
  //datos de salida
  System.out.println("Area de un Triangulo:"+area);
}
}