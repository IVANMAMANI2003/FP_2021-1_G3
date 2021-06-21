package pe.edu.upeu.iymm.examen;

import pe.edu.upeu.iymm.utils.LeerTeclado;

public class ResolucionExamen {
    static LeerTeclado objTec=new LeerTeclado();
    //Examen - ejercicio 2
    public void ImpuestoPagaraAutomoviles() {
        //definir variables
        double ToImpPagar=0, ImpUniV=0, ImpToCategoria=0, total=0;
        //Proceso/Datos entra/Datos de salida
        for (int categoria = 1; categoria <= 3; categoria++) {
            int cantidadA=objTec.leer(0, "Ingrese la cantidad de automoviles de categoria "+categoria+":  ");
            double precioA=objTec.leer(0,"Ingrese el precio de automoviles de categoria "+categoria+":  "); 
            if (categoria==1) {ImpUniV=precioA*0.12;}
            if (categoria==2) {ImpUniV=precioA*0.08;}
            if (categoria==3) {ImpUniV=precioA*0.05;}
            //para imprimir por categoria sus impuestos
            ImpToCategoria=ImpUniV*cantidadA;
            ToImpPagar+=ImpToCategoria;
            
            total=total+precioA;
            System.out.println("El impuesto a pagar por cada automovil de categoria "+categoria+" es:  "+ImpUniV);
            System.out.println("El total impuesto de cateroria "+categoria+" es:  "+ImpToCategoria);
            System.out.println("\n");

        }
        total=total+ToImpPagar;
        System.out.println("El total de impuesto por todos los vehiculos es:  "+ToImpPagar);
        System.out.println("El total que pagara por todos los vehiculos es:  "+total);

    }
    //Examen - ejercicio 3
    public void TablaDeMultiplicacionENtero() {
        System.out.println("Tabla de multiplicación");
        //variables
        int n, multiplicador;
        //datos de entrada 
        n = objTec.leer(0,"\ningrese el numero entero positivo a multiplicar: ");
        multiplicador=objTec.leer(0,"\ningrese el limite de tu multiplicador");  
        
        if (n>0) {
            for (int i=1; i<=multiplicador; i++){
                System.out.println(n+"x"+i+" = "+n*i);
            }
        } else {
            System.out.println("el numero que ingresaste es incorrecto" ); 
        }
        System.out.println("gracias!!!");
    }

    //Examen - ejercicio 4
    public  void NumerosPerfectos() {
        long NumComprobar, Div, suma;
        System.out.println("Números perfectos entre 1 y 10000: ");
        NumComprobar=1;
        while(NumComprobar <= 10000){  // NumComprobar es el número que vamos a comprobar
            /*el numero maximo se puede variar  solo depende de 
            que numero a que numero quieres encontrar los numeros perfectos*/
            suma = 0;
            Div = 1;
            while(Div < NumComprobar ){  // Div son los divisores. Se divide desde 1 hasta NumComprobar-1                          
                 if(NumComprobar % Div==0){
                    suma = suma + Div; // si es divisor se suma
                 }
                 Div++;
            }
          if(NumComprobar == suma){   // si el numero es igual a la suma de sus divisores es perfecto              
             System.out.println(NumComprobar);
          }
          NumComprobar++;
        }
    }

    //Examen - ejercicio 5
    public int potencia(int b, int e) {
        if (e==1) {
            return b;
        } if (e==0) {
            return 1;
        } else{
            return b * potencia(b, e-1);
        }

    }
}
