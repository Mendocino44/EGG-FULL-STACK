/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

Dada una cantidad de grados cent�grados se debe mostrar su equivalente en grados
Fahrenheit. La f�rmula correspondiente es: F = 32 + (9 * C / 5).


 */
package COMUNES;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class _04 {
     public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);  
      double gradosC, gradosF;
         System.out.println("Introduce grados Cent�grados:");
         gradosC = leer.nextDouble();
         gradosF = 32 + (9 * gradosC / 5);
         System.out.println(gradosC +" �C = " + gradosF + " �F");     
       
         
         
     }
    
}
