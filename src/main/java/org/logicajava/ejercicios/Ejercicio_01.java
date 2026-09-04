package org.logicajava.ejercicios;

//El Famoso Fizz Buzz

/*
 * Escribe un programa que muestre por consola (con un print) los
 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
 * cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 */
public class Ejercicio_01 {
    public static void main(String[] args) {

        String condicion = "";
        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                condicion = "fizzbuzz";
            } else if (i % 5 == 0) {
                condicion = "buzz";
            } else if (i % 3 == 0) {
                condicion = "fizz";
            } else {
                condicion = "";
            }
            System.out.println("Numero = " + i + " " + condicion);
        }
    }
}
