/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template


Escribir un programa que lea un n�mero entero por teclado y muestre por pantalla el
doble, el triple y la ra�z cuadrada de ese n�mero. Nota: investigar la funci�n Math.sqrt(). 


 */
package COMUNES;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class _05 {
    
        public static void main(String[] args) {
        /*5. Escribir un programa que lea un n�mero entero por teclado y muestre por pantalla el 
doble, el triple y la ra�z cuadrada de ese n�mero. Nota: investigar la funci�n Math.sqrt().*/
     Scanner leer = new Scanner (System.in);
     
         System.out.println("Ingrese un numero entero");
        int numero = leer.nextInt();
        
         System.out.println("Su numero al doble es: "+(numero*2));
        System.out.println("Su numero al triple es: "+(numero*3));
        System.out.println("La raiz cuadrada de su numero es: "+ Math.sqrt(numero));
        
    }

    
}
