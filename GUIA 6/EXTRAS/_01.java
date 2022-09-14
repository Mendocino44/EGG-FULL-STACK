/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.

 */
package EXTRAS;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class _01 {
     public static void main(String[] args) {
         Scanner read = new Scanner(System.in);
        int min, hr, d;
        System.out.print("ingrese la cantidad de minutos ");
        min = read.nextInt();
        hr = Math.round(min / 60);
        d = 0;
        while (hr >= 24) {
            hr = hr - 24;
            d++;
        }
        System.out.println("son "+d+" días y "+hr+" horas");
    }
    
    
}
