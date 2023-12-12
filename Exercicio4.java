/* Fai un programa que vaia pedindo cadeas de caracteres de como moito 30 caracteres. Fai unha
función contaCs(), que devolva o número de letra ‘c’ da cadea. O programa rematará cando a
cadea non teña ningunha ‘c’ ou sexa “The end”. Para cada unha das cadeas o programa SEN
MENÚ irá facendo o seguinte. Podes empregar funcións da clase String:
1. Mostrar o número de díxitos da cadea.
2. Mostrar o número de caracteres que non son números nen letras: espazos, interrogacións,
comas, puntas, símbolos, etc.
3. Mostrar o número de letras minúsculas e o número de letras maiúsculas. Emprega unha
función de ctype.h para saber se a letra é minúscula ou maiúscula.
4. Cambiar todas as vogais minúsculas a maiúsculas e as vogais maiúsculas a minúsculas.
Emprega unha función de ctype.h para facer o cambio.
Antes de rematar o programa, deberá mostrar cal foi a cadea con máis letras ‘c’ e a máis longa de
todas. Emprega dúas variables String cadMais, e String cadMaisLonga para ir gardando esas
cadeas e móstraas ao final.
 */

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cadena;
        String cadenaMasC = "";
        String cadenaMasLonga = "";

        while (true) {
            System.out.println("Introduce unha cadea (ou 'The end' para rematar):");
            cadena = scanner.nextLine();

            if (cadena.equalsIgnoreCase("The end")) {
                break;
            }

            // 1. Número de díxitos
            System.out.println("1. Número de díxitos: " + contarDigitos(cadena));

            // 2. Número de caracteres que non son números ni letras
            System.out.println("2. Número de caracteres que non son números nin letras: " + contarNoAlfanumericos(cadena));

            // 3. Número de letras minúsculas y mayúsculas
            contarLetras(cadena);

            // 4. Cambiar vogais minúsculas por maiúsculas e viceversa
            String cadenaCambiada = cambiarVocales(cadena);
            System.out.println("4. Cadea coas vogais cambiadas: " + cadenaCambiada);

            // Actualizar as cadeas máis c e máis longa
            if (contarCs(cadena) > contarCs(cadenaMasC)) {
                cadenaMasC = cadena;
            }

            if (cadena.length() > cadenaMasLonga.length()) {
                cadenaMasLonga = cadena;
            }
        }

        // Mostrar as cadeas coas máis letras 'c' e a máis longa
        System.out.println("Cadea con máis letras 'c': " + cadenaMasC);
        System.out.println("Cadea máis longa: " + cadenaMasLonga);

        scanner.close();
    }

    // Función para contar o número de díxitos na cadea
    public static int contarDigitos(String cadena) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (caracter >= '0' && caracter <= '9') {
                contador++;
            }
        }
        return contador;
    }

    // Función para contar o número de caracteres que non son números nen letras
    public static int contarNoAlfanumericos(String cadena) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (!(caracter >= 'A' && caracter <= 'Z') && !(caracter >= 'a' && caracter <= 'z') &&
                !(caracter >= '0' && caracter <= '9')) {
                contador++;
            }
        }
        return contador;
    }

    // Función para contar o número de letras minúsculas e maiúsculas
    public static void contarLetras(String cadena) {
        int minusc = 0;
        int maiusc = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (caracter >= 'a' && caracter <= 'z') {
                minusc++;
            } else if (caracter >= 'A' && caracter <= 'Z') {
                maiusc++;
            }
        }

        System.out.println("3. Número de letras minúsculas: " + minusc);
        System.out.println("   Número de letras maiúsculas: " + maiusc);
    }

    // Función para cambiar vogais minúsculas por maiúsculas e viceversa
    public static String cambiarVocales(String cadena) {
        StringBuilder cadenaCambiada = new StringBuilder();

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (caracter >= 'a' && caracter <= 'z') {
                cadenaCambiada.append((char) (caracter - 'a' + 'A'));
            } else if (caracter >= 'A' && caracter <= 'Z') {
                cadenaCambiada.append((char) (caracter - 'A' + 'a'));
            } else {
                cadenaCambiada.append(caracter);
            }
        }

        return cadenaCambiada.toString();
    }

    // Función para contar o número de letras 'c' na cadea
    public static int contarCs(String cadena) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = Character.toLowerCase(cadena.charAt(i));
            if (caracter == 'c') {
                contador++;
            }
        }
        return contador;
    }
}

