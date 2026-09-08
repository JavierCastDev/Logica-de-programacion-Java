package org.logicajava.ejercicios;

//¿QUE ES UN ANAGRAMA?

/*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */

public class Ejercicio02 {

    public static void main(String[] args) {
        Ejercicio02 ej = new Ejercicio02();
        ej.anagrama("CaPi", "PiCa");
    }

    public void anagrama(String palabraUno, String palabraDos) {
        String palabraUnoOrdenada = palabraUno.toUpperCase().chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
        String palabraDosTratada = palabraDos.toUpperCase().chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
        boolean resultado = false;

        if (palabraUnoOrdenada.equals(palabraDosTratada)) {
            resultado = true;
            System.out.println(resultado);
        } else {
            System.out.println(resultado);
        }
    }
}
