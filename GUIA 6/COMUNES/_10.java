/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

Escriba un programa en el cual se ingrese un valor l�mite positivo, y a continuaci�n solicite
n�meros al usuario hasta que la suma de los n�meros introducidos supere el l�mite inicial. 

 */
package COMUNES;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class _10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero valor limite positivo ");
        int numero = leer.nextInt();
        int suma = 0;
        do {
            System.out.println("Ingrese un nuevo numero a sumar");
            int nuevo = leer.nextInt();
            suma = nuevo + suma;

        } while (suma <= numero);
        System.out.println("El resultado de la suma es: " + suma);
    }
}
