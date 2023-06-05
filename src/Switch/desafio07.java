package Switch;

import java.util.Scanner;

public class desafio07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1;
        int num2;
        int selecao;
        int resultado;

        System.out.println("Digite o primeiro valor:");
        num1 = scan.nextInt();

        System.out.println("Digite o segundo valor:");
        num2 = scan.nextInt();

        System.out.println("Selecione a operação");
        System.out.println("[1] Soma");
        System.out.println("[2] Subtração");
        System.out.println("[3] Multiplicação");
        System.out.println("[4] Divisão");
        selecao = scan.nextInt();

        switch(selecao)
        {
            case 1 ->
            {
                System.out.println("Você selecionou Soma");
                resultado = num1 + num2;
                System.out.println("Os valores somados é: " + resultado);
            }
            case 2 ->
            {
                System.out.println("Você selecionou Subtração");
                resultado = num1 - num2;
                System.out.println("Os valores subtraidos é: " + resultado);
            }
            case 3 ->
            {
                System.out.println("Você selecionou Multiplicação");
                resultado = num1 * num2;
                System.out.println("Os valores multiplicados é: " + resultado);
            }
            case 4 ->
            {
                if(num2 == 0)
                {
                    System.out.println("Você não pode realizar divisão por zero");
                }
                else
                {
                    System.out.println("Você selecionou Divisão");
                    resultado = num1 / num2;
                    System.out.println("Os valores divididos é: " + resultado);
                }
            }
            default -> System.out.println("Erro, opção inválida");
        }

    }
}
