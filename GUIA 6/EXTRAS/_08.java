/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EXTRAS;

import java.util.Scanner;

/**
 *
 * Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 * 
 * 
 * @author josem
 */
public class _08 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese numeros enteros");
        boolean bandera=false;
        int num=0;
        int contP=0,contI=0;
        do {
            num=leer.nextInt();
   
            if(num%5==0){
                bandera=true;
                        break;
            }
            if  (num%2==0&&num>0){
                contP++;
            }else if(num%2!=0&&num>0){
                contI++;
            }
            
                       
        } while (num%5!=0);
        System.out.println("La cantidad de numeros leidos es de: "+(contP+contI));
        System.out.println("La cantidad de numeros pares es de: "+contP);
        System.out.println("La cantidad de numeros impares es de: "+contI);
        
    }
}
