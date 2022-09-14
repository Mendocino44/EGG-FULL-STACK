/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

Crear un programa que pida una frase y si esa frase es igual a ?eureka? el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java. 


 */
package COMUNES;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class _07 {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = leer.nextLine();
        String eure = "eureka";

        if (frase.equalsIgnoreCase(eure)) {
            System.out.println("Su frase es correcta");
        } else {
            System.out.println("Su frase es distinta de eureka");
        }
    }
    
}
