/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.

 */
package COMUNES;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class _20V {
    public static void main(String[] args) {
          int[][] matriz = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};
        int[][] matrizT = new int[3][3];
        Scanner leer = new Scanner(System.in);

        mostrarMatriz(matriz);
        hacerMatrizT(matriz, matrizT);
        mostrarMatrizT(matriz);
        comparaMatriz(matrizT, matriz);
    }
    
    public static void mostrarMatriz(int matriz[][]) {
        System.out.println("==== Matriz Principal =====");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
    public static void hacerMatrizT(int matriz[][], int matrizT[][]) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matrizT[i][j] = matriz[j][i];
            }
        }
    }
    public static void mostrarMatrizT(int matrizT[][]) {
        System.out.println("==== Matriz Transpuesta ====");
        for (int i = 0; i < matrizT.length; i++) {
            for (int j = 0; j < matrizT.length; j++) {
                System.out.print("[" + matrizT[i][j] + "]");
            }
            System.out.println("");
        }
    }
    public static void comparaMatriz(int matrizT[][], int matriz[][]) {
        boolean bandera = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] + matrizT[i][j] == 0) {
                    bandera = true;
                    break;
                } else {
                    bandera = false;
                    break;
                }
            }
        }
        System.out.println("");
        if (bandera == true) {
            System.out.println("La Matriz es Antisimetrica");
        } else {
            System.out.println("La Matriz no es Antisimetrica");
            
        }
        System.out.println("");
    
    }
}
