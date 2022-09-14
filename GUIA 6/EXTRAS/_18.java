/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template


Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario.


 */
package EXTRAS;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class _18 {
       public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        int []vector= new int [n];
        int suma=0;
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el valor de la posicion ["+i+"] del vector");
            vector[i]=leer.nextInt();
            suma+=vector[i];
            
        }
        System.out.println("El total de la suma es de: "+suma); 
    }
    
}
