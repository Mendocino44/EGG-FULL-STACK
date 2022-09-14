/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).


 */
package EXTRAS;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class _20 {
    public static void main(String[] args) {
        int[] vector = new int[10];
        llenarVector(vector);
        imprimirVector(vector);
      
    }
public static void llenarVector(int[]vector){
    for (int i = 0; i < vector.length; i++) {
        vector[i]=(int) (Math.random()*20);
    }
}
public static void imprimirVector(int[]vector){
    for (int i = 0; i < vector.length; i++) {
        System.out.print("["+vector[i]+"] ");
    }

        
    }
    

    }