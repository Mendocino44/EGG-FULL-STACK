/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

Dibujar un cuadrado de N elementos por lado utilizando el carácter ?*?. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:

* * * *
*     *
*     *
* * * *



 */
package COMUNES;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class _13 {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese tamaño de cuadrado: ");
        num = leer.nextInt();
        for (int i = 1; i <= num ; i++) {
            
            for (int j = 1; j <= num; j++) {
                if  (i == 1 || i == num || j == num || j == 1){
                    System.out.print(" *");
                    
                }else {
                    System.out.print("  ");
                    
                } 
            }
            System.out.println(" ");
        }
    }

    
}
