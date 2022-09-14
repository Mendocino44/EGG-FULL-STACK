/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

Crear un programa que dado un numero determine si es par o impar.

 */
package COMUNES;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class _06 {
    public static void main( String[] args ) {
        int numero;
        Scanner leer = new Scanner(System.in);

        System.out.printf( "Introduzca un número entero: " );
        numero = leer.nextInt();

        if ( numero % 2 == 0 )
        {
            System.out.printf( "TU NÚMERO ES PAR" );
        }
        else
        {
            System.out.printf( "TU NÚMERO ES IMPAR" );
        }
    }
    
}
