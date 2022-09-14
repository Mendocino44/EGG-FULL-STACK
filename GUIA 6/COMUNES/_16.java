/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

Realizar un algoritmo que rellene un vector de tama�o N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrar� donde se encuentra el
numero y si se encuentra repetido


 */
package COMUNES;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class _16 {
     public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese tama�o de vector");
        int N = leer.nextInt();
        int[] vector=new int [N];
        autorellenar(vector);
        System.out.println("Ingrese numero a buscar en el vector");
        int num = leer.nextInt();
        buscarNumero(num, vector);
    }
    
public static void autorellenar(int[] vector) {
    for (int i = 0; i < vector.length; i++) {
        vector[i]= (int) (Math.random()*100);
        System.out.print(vector[i]+" ");
    }

}

public static void buscarNumero(int num, int[] vector) {
    int contador = 0;
    for (int i = 0; i < vector.length; i++) {
        if (num==vector[i]) {
            contador++;
            System.out.println("El numero se encuentra en la posici�n: "+(i+1));
        }
        
    }
    if (contador!=0) {
        if (contador==1) {
           System.out.println("El numero se econtro en 1 sola posici�n");  
        }else{
            System.out.println("El numero esta repetido "+contador+" veces"); 
        }
       
    }else{
        System.out.println("El numero no esta en el vector");
    }     
}
    
}
