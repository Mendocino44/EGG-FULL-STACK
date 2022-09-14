/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

Un cuadrado m�gico 3 x 3 es una matriz 3 x 3 formada por n�meros del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son id�nticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es m�gico o no.
El programa deber� comprobar que los n�meros introducidos son correctos, es decir,
est�n entre el 1 y el 9.


 */
package COMUNES;

/**
 *
 * @author josem
 */
public class _20 {
      public static void main(String[] args) {
          int[][] matriz = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
        mostrarMatriz(matriz);
        compararMatriz(matriz);
    }

    public static void mostrarMatriz(int matriz[][]) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("==================");
    }

    public static void compararMatriz(int matriz[][]) {
        boolean bandera = false;
        int sumaDiag1 = 0, sumaDiag2 = 0;
        int sumaFila = 0, sumaColumna = 0;
        int[] sumaf1 = new int[3];
        int[] sumac1 = new int[3];
        for (int i = 0; i < 3; i++) {
            sumaFila = 0;
            for (int j = 0; j < 3; j++) {
                sumaFila = sumaFila + matriz[i][j];

            }
            System.out.println("La suma de la fila " + (i + 1) + " es " + sumaFila);

            System.out.println("");

            sumaf1[i] = sumaFila;
        }
        for (int j = 0; j < 3; j++) {
            sumaColumna = 0;
            {
                for (int i = 0; i < 3; i++) {
                    sumaColumna = sumaColumna + matriz[i][j];
                }
                System.out.println("La suma de la columna " + (j + 1) + " es " + sumaColumna);
            }

            System.out.println("");

            sumac1[j] = sumaColumna;
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    sumaDiag1 = sumaDiag1 + matriz[i][j];
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i + j == 2) {
                    sumaDiag2 = sumaDiag2 + matriz[i][j];
                }
            }
        }

        System.out.println("La suma de la diagonal principal es: " + sumaDiag1);
        System.out.println("");
        System.out.println("La suma de la diagonal invertida es: " + sumaDiag2);
        System.out.println("");
       for (int i = 0; i < 3; i++) {

            if ((sumac1[i] == sumaf1[i]) && (sumaDiag1 == sumaDiag2) && (sumac1[i] == sumaDiag1)) {
                bandera = true;  
            
            }else{
                 bandera = false;
                 break;
                        
                        
            }
           }
        

        if (bandera == true) {
            System.out.println("La matriz es Magica!!");
                
        } else {
            System.out.println("La matriz no es magica sos un gil saludos!!");
        }
    }
    
    
}
