/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.


 */
package COMUNES;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class _15 {
       public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       
       int[] vector=new int[100];
       //vector.length lo usamos para leer el tamaño del vector
       for (int i=0;i<vector.length;i++){
       vector[i]=i;
       }
       
       for(int j=vector.length-1;j>=0;j--){
           System.out.print(" ,"+vector[j] );
       }
    }
    
}
