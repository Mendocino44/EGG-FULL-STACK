/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

Simular la divisi�n usando solamente restas. Dados dos n�meros enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando s�lo restas. M�todo:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el n�mero de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 ? 13 = 37 una resta realizada
37 ? 13 = 24 dos restas realizadas
24 ? 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
�A�n no lo entendiste? Recomendamos googlear divisi�n con restas sucesivas.


 */
package EXTRAS;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class _09 {
    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
        System.out.println("Por favor ingrese el dividendo");
        int num1=leer.nextInt();
        System.out.println("Por favor ingrese el divisor");
        int num2=leer.nextInt();
        int residuo=0, cociente=0;
        while   (num1<num2){
            System.out.println("Ingrese un dividendo correcto");
            num1=leer.nextInt();
            System.out.println("Ingrese un divisor correcto");
            num2=leer.nextInt();
        }
        do {
            residuo=num1-num2;
            num1=residuo;
            cociente++;
            
        } while (num1>num2);
        System.out.println("El resultado es residuo: "+num1+" el cociente es: "+cociente);
        
        
                
    }
    
    
}
