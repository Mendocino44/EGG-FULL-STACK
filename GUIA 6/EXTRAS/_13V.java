/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

Crear un programa que dibuje una escalera de n�meros, donde cada l�nea de n�meros
comience en uno y termine en el n�mero de la l�nea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el n�mero 3:
1
12
123



 */
package EXTRAS;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class _13V {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el valor de n");
        int n=leer.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j =0; j <= i; j++) {
             System.out.print(j+1);
            }
              
            System.out.println(" ");
            
        }
    }
    
}

