package entradas_e_saidas;

import java.util.Scanner;

public class desafio08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;

        System.out.println("Digite uma palavra para contar as letras:");
        nome = scan.nextLine();

        System.out.println("A palavra possui: " + nome.length() + " letras");
    }
}
