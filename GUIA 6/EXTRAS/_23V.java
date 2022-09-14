/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una ?sopa de letras para niños? de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random().


 */
package EXTRAS;

import java.util.Scanner;

/**
 *
 * @author josem
 */
public class _23V {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[][] matriz = new String[20][20];
        String palabra = "";
        int cont = 0;

        do {
            System.out.println("ingrese una palabra de 3 a 5 caracteres");

            palabra = leer.nextLine();
            palabra = palabra.toUpperCase();

            if (palabra.length() > 5 || palabra.length() < 3) {
                System.out.println("la palabra está mal");
            } else {
                cont++;
                matriz = llenarP(matriz, palabra);
            }
        } while (cont != 5);
        llenarN(matriz);
    }

    public static String[][] llenarP(String[][] m, String p) {
        int x = 0;
        int y = 0;
        do {
            y = (int) (Math.random() * 20);
            x = (int) (Math.random() * 15);

        } while (m[y][x] != null && m[y][x + p.length() - 1] != null);
        for (int i = 0; i < p.length(); i++) {
            m[y][x + i] = p.substring(0 + i, 1 + i);
        }
        return m;
    }

    public static void llenarN(String[][] m) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (m[i][j] == null) {
                    m[i][j] = String.valueOf((int) (Math.random() * 10));
                }
                System.out.print("[" + m[i][j] + "]");
            }
            System.out.println("");
        }
    }
}
