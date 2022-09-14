/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga ?CORRECTO?, en caso contrario, se deberá imprimir ?INCORRECTO?.
Nota: investigar la función Lenght() en Java.

 */
package COMUNES;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class _08 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = leer.nextLine();
        int length = frase.length();

        if (length == 8) {
            System.out.println("Su frase es correcta");
        } else {
            System.out.println("Su frase es incorrecta");
        }
    }

}
