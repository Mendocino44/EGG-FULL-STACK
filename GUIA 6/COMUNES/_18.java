/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).


*/
package COMUNES;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class _18 {
       public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int[][] matriz=new int [4][4];
        int [][] matrizT=new int [4][4];
        autorellenar(matriz);
        System.out.println(" ");
        System.out.println(" ");
        mostrarMatrizB(matriz, matrizT);
       // mostrar(matriz, matrizT);
    }
    
public static void autorellenar(int matriz[][]){
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz.length; j++) {
             matriz[i][j]= (int) (Math.random()*10);
             System.out.print(matriz[i][j]+" ");
        }
        System.out.println(" ");
    }
}   

public static void mostrarMatrizB(int matriz[][], int matrizT[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matrizT[j][i] = matriz[i][j];
                System.out.print("[" +matriz[j][i] + "]");
            }
            System.out.println(" ");
        }
    }
 
    
}
