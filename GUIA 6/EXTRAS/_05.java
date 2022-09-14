/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

Una obra social tiene tres clases de socios:
o Los socios tipo ?A? abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ?B? abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ?C?, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.



 */
package EXTRAS;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class _05 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String clase;
        double costo;
        System.out.println("Elija una Clase, A, B o C");
        clase = leer.nextLine();

        switch (clase) {
            case "A":
                System.out.println("Escriba un Monto");
                costo = leer.nextDouble();
                costo = costo / 2;
                System.out.println("El Monto con Descuento es: " + costo);
                break;
            case "B":
                System.out.println("Escriba un Monto");
                costo = leer.nextDouble();
                costo = costo * 0.65;
                System.out.println("El Monto con Descuento es: " + costo);
                break;
            case "C":
                System.out.println("Tiene que pagar el monto total");
                break;
            default:
                System.out.println("Escriba una Clase Valida");
        }
    }
    
}
