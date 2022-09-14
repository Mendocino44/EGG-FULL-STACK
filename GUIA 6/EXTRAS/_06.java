/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.

 */
package EXTRAS;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class _06 {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas a comparar:");
        int personas = leer.nextInt();
        int cont=0;
        double suma=0;
        double suma2=0;
        for (int i = 0; i < personas; i++) {
            System.out.println("Ingrese la altura de la persona ["+(i+1)+"]");
            double altura = leer.nextDouble();
            if (1.61 >=altura){
                cont++;
                suma+=altura;
            }
            suma2+=altura;
        }
        System.out.println("El promedio de las personas que miden menos de 1.60 es de: "+suma/cont); 
        System.out.println("El promedio total de la altura de las personas es de: "+suma2/personas);
    }
    
}
