/* 1. Define un array de 6 enteiros, e mostra un menú para facer o seguinte (para imprimir o array
prememos 'e'):
a) Introducir os valores.
b) Multiplicar todos os valores por 3.
c) Calcular a media dos valores.
!d) Intercambiar os números 2 a 2: o primeiro co segundo, o terceiro co cuarto, e o quinto co sexto.
e) Imprimir o array.
!f) Ir almacenando a partir da posición 3ª o produto dos elementos anteriores: na posición 3ª o
produto dos 2 primeiros valores, na posición 4ª dos 3 primeiros valores, e así sucesivamente. */

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        int[] array = new int[6];

        Scanner escaner = new Scanner(System.in);

        int num = 0;

        while (num == 0) {
            System.out.println("Escolle unha opción:");
            System.out.println("a) Introducir os valores");
            System.out.println("b) Multiplicar todos os valores por 3.");
            System.out.println("c) Calcular a media dos valores.");
            System.out.println(
                    "d) Intercambiar os números 2 a 2: o primeiro co segundo, o terceiro co cuarto, e o quinto co sexto.");
            System.out.println("e) Imprimir o array.");
            System.out.println(
                    "f) Ir almacenando a partir da posición 3ª o produto dos elementos anteriores: na posición 3ª o produto dos 2 primeiros valores, na posición 4ª dos 3 primeiros valores, e así sucesivamente.");
            String opcion = escaner.nextLine();

            switch (opcion) {
                case "a":
                    System.out.println("Introduce:");
                    for (int i = 0; i < array.length; i++) {
                        array[i] = escaner.nextInt();
                    }
                    escaner.nextLine();
                    break;
                case "b":
                    for (int i = 0; i < array.length; i++) {
                        int mult = array[i] * 3;
                        System.out.println(array[i] + " x 3 = " + mult);
                    }
                    continue;
                case "c":
                    double media = 0;
                    for (int i = 0; i < array.length; i++) {
                        media = media + array[i];
                    }
                    media = media / array.length;
                    System.out.println("Media: " + media);
                    continue;
                case "d":
                    for (int i = 0; i < array.length - 1; i += 2) {
                        int temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                    }
                    System.out.println("Novo array:");
                    
                    for (int i : array) {
                        System.out.println(i);
                    }
                    continue;
                case "e":
                    System.out.println("Array:");
                    for (int i : array) {
                        System.out.println(i);
                    }
                    continue;
                case "f":
                    int[] resultado = new int[array.length];
                    resultado[0] = array[0];
                    resultado[1] = array[1];

                    for (int i = 2; i < array.length; i++) {
                        resultado[i] = array[i - 2] * array[i - 1];
                    }

                    System.out.println("Array de productos:");
                    for (int i : resultado) {
                        System.out.println(i);
                    }
                    continue;

                
            }

        }
        escaner.close();
    }
}
