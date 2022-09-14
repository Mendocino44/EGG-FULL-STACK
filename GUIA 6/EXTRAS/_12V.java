/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EXTRAS;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class _12V {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1=0, num2=0, num3=0, contador=0;
        String Letra="E";
        do{            
            for (int i = 0; i < 10; i++) {
                if (contador==0) {
                   num1=0;
                   num2=0;
                   num3=i;
                    if (num3==3) {
                        System.out.println(num1+"-"+num2+"-E");
                       continue;
                    }
                   System.out.println(num1+"-"+num2+"-"+num3);  
                }
            }   
            contador++;
        }while (contador<=3);
        do{            
            for (int i = 0; i < 10; i++) {
                if (contador==0) {
                   num1=0;
                   num2=0;
                   num3=i;
                    if (num3==3) {
                        
                    }
                   System.out.println(num1+"-"+num2+"-"+num3);  
                }
            }   
            contador++;
        }while (contador<=3);
    }
         
    
}
