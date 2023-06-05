package if_else_if_else;

import java.util.Scanner;

public class desafio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int idade;

        System.out.println("Qual a sua idade?: ");
        idade = scan.nextInt();

        if(idade < 18)
        {
            System.out.println("Você é uma criança.");
        }
        else if(idade <= 30)
        {
            System.out.println("Você é um jovem.");
        }
        else if(idade <= 59)
        {
            System.out.println("Você é um adulto.");
        }
        else
        {
            System.out.println("Você é um idoso.");
        }
    }
}
