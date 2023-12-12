/* 2. Fai un programa SEN ARRAYS que pida 4 doubles, e faga o cálculo do máximo, do mínimo, e da
media empregando varias funcións. O valor do máximo, do mínimo e da media debe ser impreso
desde o main( ), e as funcións facer o cálculo e devolver os valores.
 */

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduce 4 números decimais");
        double num1 = escaner.nextDouble();
        double num2 = escaner.nextDouble();
        double num3 = escaner.nextDouble();
        double num4 = escaner.nextDouble();

        double max = maximo(num1, num2, num3, num4);
        System.out.println("Máximo: " + max);

        double min = minimo(num1, num2, num3, num4);
        System.out.println("Mínimo: " + min);

        double med = media(num1, num2, num3, num4);
        System.out.println("Media: " + med);

        
        escaner.close();
    }
    
    public static double maximo(double i, double j, double k, double l) {
        double max = i;
        if (j > max) {
            max=j;
        }
        if (k > max) {
            max=k;
        }
        if (l > max){
            max=l;  
        }
        return max;
    }

    public static double minimo(double i, double j, double k, double l) {
        double min = i;
        if (j < min) {
            min=j;
        }
        if (k < min) {
            min=k;
        }
        if (l < min){
            min=l;  
        }
        return min;
    }

    public static double media(double i, double j, double k, double l) {
        double media = (i + j + k + l) / 4;
        return media;
    }
}
