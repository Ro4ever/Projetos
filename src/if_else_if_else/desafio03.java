package if_else_if_else;

import java.util.Scanner;

public class desafio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.println("Digite um valor de 1 a 7");
        numero = scan.nextInt();

        if(numero < 1 || numero > 7)
        {
            System.out.println("Valor inválido.");
        }
        else if(numero == 1)
        {
            System.out.println("Domingo");
        }
        else if(numero == 2)
        {
            System.out.println("Segunda-Feira");
        }
        else if(numero == 3)
        {
            System.out.println("Terça-Feira");
        }
        else if(numero == 4)
        {
            System.out.println("Quarta-Feira");
        }
        else if(numero == 5)
        {
            System.out.println("Quinta-Feira");
        }
        else if(numero == 6)
        {
            System.out.println("Sexta-Feira");
        }
        else
        {
            System.out.println("Sábado");
        }

    }
}
