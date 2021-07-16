package pe.edu.upeu.arreglos;

public class Transformada {
    public void transformada1(int dimension, int valorElem) {
        String[][] matriz=new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[0].length; c++) {     
                if (c<dimension-f) {
                    matriz[f][c]=""+(valorElem+(f+c)*(f+c+1)/2 + f); 
                }else{
                    matriz[f][c]="";
                }                
            }
        }
        imprimirMatriz(matriz);
    }

    public void imprimirMatriz(Object[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }
    }  


    public void transformada2(int dimension, int valorElem) {
        String[][] matriz=new String[dimension][dimension];
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[0].length; c++) {     
                if (c<dimension-f) {
                    matriz[f][c]=""+(valorElem+(c+f)*(c+f+1)/2 + c); 
                }else{
                    matriz[f][c]="";
                }                
            }
        }
        imprimirMatriz(matriz);
    }


    public void imprimirMatrizCadena(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(matriz[i][j]!=null && !matriz[i][j].equals("")){
                    System.out.print(matriz[i][j]+"\t");
                }else{
                    System.out.print("\t");
                }                
            }
            System.out.println("");
        }
    }  
    public void transformada05(int dimen, int valInit) {
        String[][] matriz=new String[dimen][dimen];// i =filas, j=columnas
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= i; j++) {
                matriz[i][(dimen-1)-j]=""+valInit;
                valInit++;
            }
        }
        imprimirMatrizCadena(matriz);
    }

    public void transformada16(int dimen, int valInit) {
        String[][] matriz=new String[dimen][dimen];// i =filas, j=columnas
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= i; j++) {
                matriz[(dimen-1)-j][i]=""+valInit;
                valInit++;
            }
        }
        imprimirMatrizCadena(matriz);
    }

    public void transformada14(int dimen, int valInit) {
        String[][] matriz=new String[dimen][dimen];// i =filas, j=columnas
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= i; j++) {
                matriz[j][i]=""+valInit;
                valInit++;
            }
        }
        imprimirMatrizCadena(matriz);
    }

    public void transformada06(int dimen, int valInit) {
        String[][] matriz=new String[dimen][dimen];// i =filas, j=columnas
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= i; j++) {
                matriz[i][j]=""+valInit;
                valInit++;
            }
        }
        imprimirMatrizCadena(matriz);
    }

    public void transformada18(int dimen, int valInit) {
        String[][] matriz=new String[dimen][dimen];// i =filas, j=columnas
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i <= j; i++) {
                matriz[i][(dimen-1)-j]=""+valInit;
                valInit++;
            }
        }
        imprimirMatrizCadena(matriz);
    }

    public void transformada07(int dimen, int valInit) {
        String[][] matriz=new String[dimen][dimen];// i =filas, j=columnas
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i <= (dimen-1)-j; i++) {
                matriz[j][i]=""+valInit;
                valInit++;
            }
        }
        imprimirMatrizCadena(matriz);
    }


    public void transformada17(int dimen, int valInit) {
        String[][] matriz=new String[dimen][dimen];// i =filas, j=columnas
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j <= (dimen-1)-i; j++) {
                matriz[j][(dimen-1)-i]=""+valInit;
                valInit++;
            }
        }
        imprimirMatrizCadena(matriz);
    }


    public void transformada12(int dimen, int valInit) {
        String[][] matriz=new String[dimen][dimen];// i =filas, j=columnas
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j <= (dimen-1)-i; j++) {
                matriz[i][(dimen-1)-j]=""+valInit;
                valInit++;
            }
        }
        imprimirMatrizCadena(matriz);
    }




    public void transformada13(int dimen, int valInit) {
        String[][] matriz=new String[dimen][dimen];// i =filas, j=columnas
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i <= (dimen-1)-j; i++) {
                matriz[i][j]=""+valInit;
                valInit++;
            }
        }
        imprimirMatrizCadena(matriz);
    }


    public void transformada21(int dimen, int valInit) {
        String[][] matriz=new String[dimen][dimen];// i =filas, j=columnas
        for (int j = 0; j < matriz[0].length; j++) {
            if(j%2==0){
                for (int i = 0; i < matriz.length; i++) {
                    matriz[i][j]=""+valInit;
                    valInit++;
                }
            }else{
                for (int i =  matriz.length-1; i >=0; i--) {
                    matriz[i][j]=""+valInit;
                    valInit++;
                }
            }
        }
        imprimirMatrizCadena(matriz);
    }

    public void transformada24(int dimen, int valInit) {
        String[][] matriz=new String[dimen][dimen];// i =filas, j=columnas
        for (int j = matriz[0].length-1; j>=0 ; j--) {
            if(j%2==0){
                for (int i =  matriz.length-1; i >=0; i--) {
                    matriz[i][j]=""+valInit;
                    valInit++;
                }                
            }else{
                for (int i = 0; i < matriz.length; i++) {
                    matriz[i][j]=""+valInit;
                    valInit++;
                }
            }
        }
        imprimirMatrizCadena(matriz);
    }    

    public void transformada25(int dimen, int valInit) {
        String[][] matriz=new String[dimen][dimen];// i =filas, j=columnas
        for (int j = 0; j < matriz[0].length; j++) {
            if(j%2==0){
                for (int i = 0; i < matriz.length; i++) {
                    matriz[j][i]=""+valInit;
                    valInit++;
                }
            }else{
                for (int i =  matriz.length-1; i >=0; i--) {
                    matriz[j][i]=""+valInit;
                    valInit++;
                }
            }
        }
        imprimirMatrizCadena(matriz);
    }

    public void transformada22(int dimen, int valInit) {
        String[][] matriz=new String[dimen][dimen];// i =filas, j=columnas
        for  (int i = 0; i < matriz.length; i++) {
            if(i%2==0) {
                for (int j =  matriz.length-1; j >=0; j--) {
                    matriz[j][i]=""+valInit;
                    valInit++;
                }
            }else{
                for (int j = 0; j < matriz[0].length; j++) {
                    matriz[j][i]=""+valInit;
                    valInit++;
                }
            }
        }
        imprimirMatrizCadena(matriz);
    }


    public void transformada26(int dimen, int valInit) {
        String[][] matriz=new String[dimen][dimen];// i =filas, j=columnas
        for  (int i = 0; i < matriz.length; i++) {
            if(i%2==0) {
                for (int j =  matriz.length-1; j >=0; j--) {
                    matriz[i][j]=""+valInit;
                    valInit++;
                }
            }else{
                for (int j = 0; j < matriz[0].length; j++) {
                    matriz[i][j]=""+valInit;
                    valInit++;
                }
            }
        }
        imprimirMatrizCadena(matriz);
    }

    public void transformada27(int dimen, int valInit) {
        String[][] matriz=new String[dimen][dimen];// i =filas, j=columnas
        for (int j = matriz[0].length-1; j>=0 ; j--) {
            if(j%2==0){
                for (int i =  matriz.length-1; i >=0; i--) {
                    matriz[j][i]=""+valInit;
                    valInit++;
                }                
            }else{
                for (int i = 0; i < matriz.length; i++) {
                    matriz[j][i]=""+valInit;
                    valInit++;
                }
            }
        }
        imprimirMatrizCadena(matriz);
    }    

    public static void main(String[] args) {
        Transformada tObj=new Transformada();
        //tObj.transformada1(5, 0);
        //tObj.transformada2(5,0);
        System.out.println("");
        //tObj.transformada05(5, 0);
        //tObj.transformada13(5, 0);
        //tObj.transformada21(5, 0);
        //tObj.transformada24(5, 0);


        //tObj.transformada16(5, 0);
        //tObj.transformada14(5, 0);
        //tObj.transformada06(5, 0);
        //tObj.transformada18(5, 0);
        //tObj.transformada07(5, 0);
        //tObj.transformada17(5, 0);
        //tObj.transformada12(5, 0);
        //tObj.transformada25(5, 0);
        //tObj.transformada22(5, 0);
        //tObj.transformada26(5, 0);
        //tObj.transformada27(5, 0);
    
    }
}