package entradas_e_saidas;

import java.util.Scanner;

public class desafio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        double altura;
        int idade;

        System.out.println("Qual o seu nome?: ");
        nome = scan.nextLine();

        System.out.println("Qual a sua idade?: ");
        idade = scan.nextInt();

        System.out.println("Qual a sua altura?: ");
        altura = scan.nextDouble();

        System.out.println("Seu nome é " + nome + ", sua idade " + idade + " anos, sua altura, " + altura);
    }
}
