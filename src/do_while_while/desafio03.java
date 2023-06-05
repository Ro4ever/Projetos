package do_while_while;

import java.util.Scanner;

public class desafio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double num1;
        double num2;
        double resultado = 0;
        int escolha;
        String continuar;

        do
        {
            System.out.println("Informe o 1º valor:");
            num1 = scan.nextDouble();

            System.out.println("Informe o 2º valor:");
            num2 = scan.nextDouble();

            System.out.println("Escolha a operaçao que deseja utilizar");
            System.out.println("[1] Adição");
            System.out.println("[2] Subtração");
            System.out.println("[3] Multiplicação");
            System.out.println("[4] Divisão");
            escolha = scan.nextInt();

            switch (escolha)
            {
                case 1 ->
                {
                    resultado = num1 + num2;
                    System.out.println("O resultado é: " + resultado);
                }
                case 2 ->
                {
                    resultado = num1 - num2;
                    System.out.println("O resultado é: " + resultado);
                }
                case 3 ->
                {
                    resultado = num1 * num2;
                    System.out.println("O resultado é: " + resultado);
                }
                case 4 ->
                {
                    if(num2 == 0)
                    {
                        System.out.println("Não pode realizar divisao por zero");
                    }
                    else
                    {
                        resultado = num1 / num2;
                        System.out.println("O resultado é: " + resultado);
                    }
                }
                default -> System.out.println("Número inválido");

            }
            System.out.println("Deseja continuar? CONTINUAR para sim e FINALIZAR para não:");
            continuar = scan.next();
            continuar = continuar.toUpperCase();

        }
        while(continuar.equals("CONTINUAR"));

        System.out.println("Obrigado por utilizar.");
    }
}
