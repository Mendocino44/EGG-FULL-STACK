/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package COMUNES;

import java.util.Scanner;

/**
 *
 * @author josem
 * 
 * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
 * 
 */
public class _02 {
     public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        String nombre;
        System.out.println("Ingrese su nombre");
        nombre = leer.next();
        System.out.println("El nombre Ingresado es: " + nombre); 
    }
    
}
