/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

Escribir un programa que lea un n�mero entero y devuelva el n�mero de d�gitos que
componen ese n�mero. Por ejemplo, si introducimos el n�mero 12345, el programa
deber� devolver 5. Calcular la cantidad de d�gitos matem�ticamente utilizando el operador
de divisi�n. Nota: recordar que las variables de tipo entero truncan los n�meros o
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
