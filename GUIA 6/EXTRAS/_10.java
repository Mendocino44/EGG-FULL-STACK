/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.

 */
package EXTRAS;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class _10 {
      public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int num1,num2,resultadoP,resultadoM;
        num1=(int)(Math.random()*10)+1;
        num2=(int)(Math.random()*10)+1;
        resultadoM=num1*num2;
        System.out.println(resultadoM);
        //System.out.println("Ingrese su prediccion de la multiplicacion");
        //resultadoP=leer.nextInt();
        do {
           
            System.out.println("Ingrese su prediccion ");
            resultadoP=leer.nextInt();   
             if (resultadoP<resultadoM) {
                System.out.println("Un poco mas arriba");
                
            }
            else  if (resultadoP>resultadoM) {
                System.out.println("Un poco mas abajo");
            }
        } while (resultadoM!=resultadoP);
        
            
        
        System.out.println("Adivinaste");
        System.out.println("Gracias vuelva Prontos!!");
        
        
                
    }
    
    
}
