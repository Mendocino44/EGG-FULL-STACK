/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ?A?. Si la primera letra es una ?A?, se deberá de imprimir un mensaje por pantalla que
diga ?CORRECTO?, en caso contrario, se deberá imprimir ?INCORRECTO?. Nota: investigar
la función Substring y equals() de Java.


 */
package COMUNES;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class _09 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una frase o palabra: ");
        String frase = leer.nextLine();
        //String s=frase.substring(0,1);
        if (frase.substring(0, 1).equalsIgnoreCase("a")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
}
