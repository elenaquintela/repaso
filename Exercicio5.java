/* 5. Fai un programa que che vaia pedindo o nome e o primeiro apelido de distintos alumnos, (exemplo:
Federico Alvarez) e che diga en que quenda do curso está (A-M ás 16:00, da N-Z ás 18:00) e cantas
letras ten o nome completo (nome e primeiro apelido) e cantas letras ten o seu primeiro apelido.
Para saír o usuario debe pulsar 's'. Comproba que o primeiro apelido empeza por maiúsculas e se non é así corríxeo, de modo que na saída do programa o String estea corrixido. Se o nome coincide
co teu amosa un saúdo apaixonado.
Exemplo: Para Jaime alvarez imprimiría en pantalla:
Jaime Alvarez vai no grupo das 16:00.
O nome completo ten 16 letras e o seu primeiro apelido ten 7 letras. */

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        int num = 0;

        while (num == 0) {
            System.out.println("Nome?");
            String nome = escaner.nextLine();
            System.out.println("Apelido?");
            String apelido = escaner.nextLine();
           
            char primeiraLetraApe = apelido.charAt(0);
            String letraApeString = String.valueOf(primeiraLetraApe);
            
            int letrasNomeCompleto = nome.length() + apelido.length();
            int letrasApe = apelido.length();

         
            apelido = apelido.toUpperCase().charAt(0) + apelido.substring(1, letrasApe);
            System.out.println("Apelido correxido: " + apelido);
           
           
            if(!letraApeString.equalsIgnoreCase("s")) {
                if (primeiraLetraApe >= 'A' && primeiraLetraApe <= 'M') {
                    System.out.println(nome + " " + apelido + " vai no grupo das 16:00.");
                } else {
                    System.out.println(nome + " " + apelido + " vai no grupo das 18:00.");
                }
            } 
          
            System.out.println("O nome completo ten " + letrasNomeCompleto + " letras e o seu primeiro apelido ten " + letrasApe + " letras."); 
        }
        escaner.close();
    }

    
}
