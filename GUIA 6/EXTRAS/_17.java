/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

Crea una aplicaci�n que nos pida un n�mero por teclado y con una funci�n se lo pasamos
por par�metro para que nos indique si es o no un n�mero primo, debe devolver true si es
primo, sino false.
Un n�mero primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es
primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
�Qu� son los n�meros primos?
B�sicamente, un n�mero primo es un n�mero natural que tiene solo dos divisores o
factores: 1 y el mismo n�mero. Es decir, es primo aquel n�mero que se puede dividir por
uno y por el mismo n�mero.
El primer n�mero primo es 2, y hay 25 n�meros primos entre 1 y 100, ellos son: 2, 3, 5, 7, 11,
13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89 y 97.

 */
package EXTRAS;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class _17 {
        public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero a chequear");
        int num = leer.nextInt();
        boolean resp = primo(num);
        System.out.println("El numero es Pimo? " + resp);

    }

    public static boolean primo(int num) {
        boolean c = false;
        int cont = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                cont++;
            }
           

        }
         if (cont == 2) {
                c = true;
            }
        return c;
    }
    
}
