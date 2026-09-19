package org.logicajava.ejercicios;

//¿ES UN NÚMERO PRIMO?

/*
 * Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */

public class Ejercicio04 {

    public static void main(String[] args) {
        Ejercicio04.esPrimo();
    }

    public static void esPrimo() {
        int i;
        for (i = 2; i < 100; i++) {
            var esPrimo = true;
            for (var j = 2; j < i; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                }
            }
            if (esPrimo) {
                System.out.println(i +" es primo");
            }
        }
    }
}
