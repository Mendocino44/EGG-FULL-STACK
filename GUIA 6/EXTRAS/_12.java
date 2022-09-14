/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.



 */
package EXTRAS;

/**
 *
 * @author josem
 */
public class _12 {
     public static void main(String[] args) {
        int[] vector = new int[10];
        String[] vectorDos = new String[10];
        for (int i = 0; i < 10; i++) {
            vector[i] = i;
        }

        for (int i = 0; i < 10; i++) {

            if (i == 3) {
                vectorDos[i] = "E";
            } else {
                vectorDos[i] = String.valueOf(vector[i]);
            }

        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {

                    System.out.println(vectorDos[i] + "-" + vectorDos[j] + "-" + vectorDos[k]);
                }
            }

        }

    }
    
    
}
