package methods;

import java.util.Scanner;

public class desafio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        System.out.println("Qual seu nome?:");
        nome = scan.nextLine();

        System.out.println("Qual a sua idade?:");
        idade = scan.nextInt();

        ImprimeInf(nome,idade);
    }
    public static void ImprimeInf(String nome, int idade)
    {
        System.out.println("Seu nome: " + nome);
        System.out.println("Sua idade: " + idade);
    }
}
