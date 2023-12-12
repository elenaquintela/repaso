/* 7. Fai un programa que pida unha cadea de caracteres de ata 20 letras, e chamando a funcións, vaia
facendo o seguinte: cambia a primeira letra de cada palabra a maiúsculas, elimina a letra 'a' da
cadea, e elimina espazos seguidos. Logo de cada paso deberás chamar a unha función imprime ( )
que mostre a cadea. */

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        System.out.print("Introduce unha cadea de ata 20 letras: ");
        String cadea = escaner.nextLine();

        if (cadea.length() <= 20) {
            // Etapa 1: Cambiar a primeira letra de cada palabra a maiúsculas
            cadea = primeiraLetraMaiusculas(cadea);
            imprime(cadea);
    
            // Etapa 2: Eliminar a letra 'a' da cadea
            cadea = eliminarLetraA(cadea);
            imprime(cadea);
    
            // Etapa 3: Eliminar espazos seguidos
            cadea = eliminarEspazosSeguidos(cadea);
            imprime(cadea);
            
        } else {
            System.out.println("A cadea debe ter menos de 20 letras");
        }


        escaner.close();
    }

    // Função para cambiar a primeira letra de cada palabra a maiúsculas
    private static String primeiraLetraMaiusculas(String cadea) {
        String[] palabras = cadea.split(" ");
        StringBuilder resultado = new StringBuilder();

        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                resultado.append(Character.toUpperCase(palabra.charAt(0))).append(palabra.substring(1)).append(" ");
            }
        }

        return resultado.toString().trim();
    }

    // Função para eliminar a letra 'a' da cadea
    private static String eliminarLetraA(String cadea) {
        return cadea.replace("a", "");
    }

    // Função para eliminar espazos seguidos
    private static String eliminarEspazosSeguidos(String cadea) {
        return cadea.replaceAll("  ", " ");
    }

    // Função para imprimir a cadea
    private static void imprime(String cadea) {
        System.out.println("Cadea resultante: " + cadea);
    }

}
