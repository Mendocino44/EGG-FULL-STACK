/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un m�ximo de 5 caracteres de largo, el primer car�cter tiene que ser
X y el �ltimo tiene que ser una O.
Las secuencias le�das que respeten el formato se consideran correctas, la secuencia
especial ?&&&&&? marca el final de los env�os (llam�mosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deber� investigar c�mo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().


 */
package COMUNES;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class _12 {
   public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int contCorrectos = 0;
        int contIncorrectos = 0;
        String frase;
        do {

            System.out.println("Ingrese una frase RS232 (INICIO X / FIN O)");
            frase = leer.next();
            if (frase.equals("&&&&&")) {
                break;
            }
            int lon = frase.length();
            if (lon <= 5 && lon >= 2) {
                if ("X".equalsIgnoreCase(frase.substring(0, 1)) && "O".equalsIgnoreCase(frase.substring(lon - 1, lon))) {
                    contCorrectos++;
                } else {
                    contIncorrectos++;
                }
            } else {
                contIncorrectos++;
            }
            System.out.println("Los correctos son: " + contCorrectos);
            System.out.println("Los Incorrectos son: " + contIncorrectos);
        } while (!frase.equals("&&&&&"));
        System.out.println("La cantidad de frases correctas es de: " + contCorrectos);
        System.out.println("La cantidad de frases incorrectas es de: " + contIncorrectos);
        System.out.println("Gracias vuelva Pronto!");
    }
    
}
