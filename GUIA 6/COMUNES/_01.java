/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package COMUNES;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class _01 {
       public static void main(String[] args) {
      Scanner leer = new Scanner (System.in);
         int num1, num2;
         
        System.out.println("Por favor ingrese el primer numero a sumar");
        num1=leer.nextInt();
         System.out.println("Por favor ingrese el segundo numero a sumar");
        num2=leer.nextInt();
        int suma;
        suma = num1 + num2;
        System.out.println("El valor de la suma de los numeros es de: " + suma);
    }    
}
