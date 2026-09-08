package org.logicajava.ejercicios;

//LA SUCESIÓN DE FIBONACCI

/*
 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
 */

public class Ejercicio03 {

    public static void main(String[] args) {
        Ejercicio03.fibonacci();
    }

    public static void fibonacci() {

        int contador = 0;
        Long a = 0L;
        Long b = 1L;

        System.out.println(a);
        System.out.println(b);
        while (contador < 48) {
            Long c = a + b;
            System.out.println(c);
            a = b;
            b = c;
            contador++;
        }
    }
}
