/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división. Nota: recordar que las variables de tipo entero truncan los números o
resultados.


 */
package EXTRAS;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class _11 {
      public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un numero entero:");
        int num1=leer.nextInt();
        int cont=0,division;
        do {
           cont++;
           num1/=10;
                   
        } while (num1!=0);
        System.out.println("El numero tiene "+cont+" digitos!");
    }
    
}
