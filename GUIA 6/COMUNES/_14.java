/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

Crea una aplicaci�n que a trav�s de una funci�n nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a d�lares, yenes o libras. La
funci�n tendr� como par�metros, la cantidad de euros y la moneda a converir que ser�
una cadena, este no devolver� ning�n valor y mostrar� un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 ?
* 1.28611 $ es un 1 ?
* 129.852 yenes es un 1 ?




 */
package COMUNES;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class _14 {
       public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double euros;
        String opcion = "";
        System.out.println("Ingrese cantidad de euros a convertir");
        euros = leer.nextDouble();
        int opc;
        do {
            System.out.println("Convertir 1-Libras 2-Dolar 3-Yenes");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    opcion = "Libras";
                    break;
                case 2:
                    opcion = "Dolar";
                    break;
                case 3:
                    opcion = "Yenes";
                    break;
                default:
                    System.out.println("Opcion ingresada no es correcta");
            }
        } while (opc >= 4);
        
        conver(euros,opcion);
    } 
    public static void conver(double euros, String opcion) {
         
         if (opcion.equals("Libras")){
             System.out.println("El monto ingresado corresponde a: "+(euros*0.86)+" Libras" );
         }
         if (opcion.equals("Dolar")){
             System.out.println("El monto ingresado corresponde a: "+(euros*1.28611)+" Dolares" );
         }
         if (opcion.equals("Yenes")){
             System.out.println("El monto ingresado corresponde a: "+(euros*129.852)+" Yenes" );
         }
           
    
    }
}
