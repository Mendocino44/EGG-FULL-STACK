/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuaci�n, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar s�lo una variable auxiliar.


 */
package EXTRAS;

/**
 *
 * @author josem
 */
public class _02 {
     public static void main(String[] args) {
        int A=1,B=2,C=3,D=4,aux;
        
        System.out.println("A="+A);
        System.out.println("B="+B);
        System.out.println("C="+C);
        System.out.println("D="+D);
        
        aux=B;
        B=C;
        C=aux; 
        aux=D;
        D=C;
        C=A;
        A=aux;
        
        System.out.println("A="+A);
        System.out.println("B="+B);
        System.out.println("C="+C);
        System.out.println("D="+D);
    }

}
