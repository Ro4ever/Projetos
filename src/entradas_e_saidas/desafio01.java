package entradas_e_saidas;

import java.util.Scanner;

public class desafio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        String idade;

        System.out.println("Qual seu nome?: ");
        nome = scan.nextLine();

        System.out.println("Qual a sua idade?: ");
        idade = scan.nextLine();

        System.out.println("Bem vindo " + nome + " ao Java, e você tem " + idade + " anos de idade.");

    }
}
