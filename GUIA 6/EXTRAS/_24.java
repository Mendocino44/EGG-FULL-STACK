/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

Realizar un programa que complete un vector con los N primeros n�meros de la sucesi�n
de Fibonacci. Recordar que la sucesi�n de Fibonacci es la sucesi�n de los siguientes
n�meros:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los n�meros se calcula sumando los dos anteriores a �l. Por ejemplo:
La sucesi�n del n�mero 2 se calcula sumando (1+1)
An�logamente, la sucesi�n del n�mero 3 es (1+2),
Y la del 5 es (2+3),
Y as� sucesivamente...
La sucesi�n de Fibonacci se puede formalizar de acuerdo a la siguiente f�rmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el t�rmino ?n? debemos escribir una funci�n que reciba
como par�metro el valor de ?n? y que calcule la serie hasta llegar a ese valor.
Para conocer m�s acerca de la serie de Fibonacci consultar el siguiente link:
https://quantdare.com/numeros-de-fibonacci/



 */
package EXTRAS;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class _24 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la cant de n�meros de fibonacci");
        int n = leer.nextInt();
        int[] fib = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 1 || i == 0) {
                fib[i] = 1;
            } else {fib[i]=fib[i-1]+fib[i-2];
            }
            System.out.print("["+fib[i]+"] ");
        }

    }
    
}
