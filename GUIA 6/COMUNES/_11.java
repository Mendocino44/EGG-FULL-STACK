/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

Realizar un programa que pida dos n�meros enteros positivos por teclado y muestre por
pantalla el siguiente men�:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opci�n:

El usuario deber� elegir una opci�n y el programa deber� mostrar el resultado por pantalla
y luego volver al men�. El programa deber� ejecutarse hasta que se elija la opci�n 5.
Tener en cuenta que, si el usuario selecciona la opci�n 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmaci�n: �Est� seguro que
desea salir del programa (S/N)? Si el usuario selecciona el car�cter ?S? se sale del
programa, caso contrario se vuelve a mostrar el men�.





 */
package COMUNES;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class _11 {
       public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = leer.nextInt();

        String respuesta = " ";
        do {
            
            System.out.println("Ingrese una opcion, 1= sumar, 2= restar, 3= multiplicar, 4= dividir, 5= salir");
            int num3 = leer.nextInt();

            switch (num3) {
                case 1:
                    System.out.println("La suma de los numeros es igual a :" + (num1 + num2));
                    continue;
                case 2:
                    System.out.println("La resta de los numeros es igual a :" + (num1 - num2));
                    continue;
                case 3:
                    System.out.println("La multiplicacion de los numeros es igual a :" + (num1 * num2));
                    continue;
                case 4:
                    double division=num1/num2;                      
                    System.out.println("La division de los numeros es igual a :" + (division));
                    continue;
                case 5:
                    System.out.println("Desea salir, responder S/N");
                    respuesta = leer.next();
                                       
                     
                   
                    
            }
             
             
        }while (!respuesta.equalsIgnoreCase("s"));
            
            System.out.println("Gracias vuelva prontos.");
        
    }
    
}
