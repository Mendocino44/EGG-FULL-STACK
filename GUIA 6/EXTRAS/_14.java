/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
de hijos para averiguar la media de edad de los hijos de todas las familias.


 */
package EXTRAS;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class _14 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese la cantidad de familias");
        double n=leer.nextInt();
         System.out.println("Ingrese la cantidad de personas");
        double m=leer.nextInt();
        double promedio=m/n;
        System.out.println("El proimedio de cantidad de hijos por familia es de:"+promedio);
        
        
    }
    
}
