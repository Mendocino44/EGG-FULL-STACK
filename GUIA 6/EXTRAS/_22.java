/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
muestre la suma de sus elementos.


 */
package EXTRAS;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class _22 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa la dimension del vector");
        int[][] vector = new int[leer.nextInt()][leer.nextInt()];
        int n = 0;

        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[0].length; j++) {

                System.out.println("Ingresa el numero de la posicion " + i + "" + j);
                vector[i][j] = leer.nextInt();
                n += vector[i][j];

            }
            
        }
        System.out.println("La suma de toda la matriz es: " + n);
    }

    
}
