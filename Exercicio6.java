/* 6. Programa que vaia pedindo números enteiros polo teclado. Ao final, debe mostrar cantos números
introducidos foron menores que 1000, cantos maiores, e a suma total de todos os números. O
programa rematará se o número introducido foi o 2332 ou a suma dá 99. O 2332 non se contará na
suma, pero o 99 si. */

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        int num = 0;
        int suma = 0;

        int maiorDe1000 = 0;
        int menorDe1000 = 0;


        while (num != 2332 || suma == 99) {
            System.out.println("Numero");
            num = escaner.nextInt();

            if (num > 1000) {
                maiorDe1000++;
            }
            
            if (num < 1000) {
                menorDe1000++;
            }
            if (num != 2332) {
                suma += num;
                System.out.println("Suma total: " + suma);
            }
            
            System.out.println("Numeros maiores que 1000: " + maiorDe1000);
            System.out.println("Numeros menores que 1000: " + menorDe1000);

            if (suma == 99) {
                break;
            }
            
        }

        escaner.close();
    }
    
}
