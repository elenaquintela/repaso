/* 3. Fai un programa que empregue unha función para introducir unha cadea. Introduce no main( ) 2
letras distintas: letra1 e letra2. Fai despois outra función elimina( ) que elimine as sílabas
compostas por esas dúas letras seguidas. Ex: “Na casa do ferreiro” e 's', 'a'. Deberá eliminar “sa”,
quedando a cadea como “Na ca do ferreiro”.
 */

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);

        System.out.println("Introduce unha cadea:");
        String cadea = introducirCadea(escaner);

        System.out.println("Introduce a primeira letra:");
        String letra1 = escaner.nextLine();
        System.out.println("Introduce a segunda letra:");
        String letra2 = escaner.nextLine();

        String cadeaModificada = elimina(cadea, letra1, letra2);

        System.out.println("Cadea sen as sílabas compostas por " + letra1 + " e " + letra2 + ":");
        System.out.println(cadeaModificada);

        escaner.close();
    }

    //! Función para introducir unha cadea
    public static String introducirCadea(Scanner scanner) {
        return scanner.nextLine();
    }

    //! Función para eliminar as sílabas compostas polas dúas letras dadas
    public static String elimina(String cadea, String letra1, String letra2) {
        String[] palabras = cadea.split(" ");
        StringBuilder novaCadea = new StringBuilder();

        for (String palabra : palabras) {
            // Eliminar sílabas compostas polas dúas letras
            String palabraModificada = palabra.replace("" + letra1 + letra2, "");

            // Engadir a nova palabra á cadea m odificada
            novaCadea.append(palabraModificada).append(" ");
        }

        return novaCadea.toString().trim(); // Eliminar espacios ao redor da cadea
    }

    //! Otra opción sin array

    public static String elimina(String cadena, char letra1, char letra2) {
        StringBuilder nuevaCadena = new StringBuilder();
        StringBuilder palabraActual = new StringBuilder();
    
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
    
            // Si el carácter es un espacio o el final de la cadena, procesamos la palabraActual
            if (caracter == ' ' || i == cadena.length() - 1) {
                if (i == cadena.length() - 1) {
                    palabraActual.append(caracter);
                }
    
                // Eliminar sílabas compuestas por las dos letras
                String palabraModificada = palabraActual.toString().replace("" + letra1 + letra2, "");
    
                // Agregar la palabra modificada a la nueva cadena
                nuevaCadena.append(palabraModificada);
    
                // Agregar un espacio si no es el final de la cadena
                if (i < cadena.length() - 1) {
                    nuevaCadena.append(" ");
                }
    
                // Reiniciar palabraActual para la próxima palabra
                palabraActual.setLength(0);
            } else {
                palabraActual.append(caracter);
            }
        }
    
        return nuevaCadena.toString();
    }
    

    
}
