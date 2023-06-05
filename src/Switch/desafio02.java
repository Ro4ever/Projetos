package Switch;

import java.util.Scanner;

public class desafio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int escolha;
        double resultado;

        System.out.println("[1] Círculo");
        System.out.println("[2] Quadrado");
        System.out.println("[3] Retângulo");
        System.out.println("[4] Triângulo");
        System.out.println("Selecione a figura geométrica que deseja calcular:");
        escolha = scan.nextInt();

        switch(escolha)
        {
            case 1 ->
            {
               double raio;

                System.out.println("Você selecionou Círculo");
                System.out.println("Qual o valor do raio do círculo?:");
                raio = scan.nextDouble();
                resultado = 3.14 * (raio * raio);
                System.out.println("A área do raio do círculo é: " + resultado);
            }
            case 2 ->
            {
                double lado;

                System.out.println("Você selecionou Quadrado");
                System.out.println("Qual o valor da área do Quadrado?:");
                lado = scan.nextDouble();
                resultado = lado * lado;
                System.out.println("A área do Quadrado é: " + resultado);
            }
            case 3 ->
            {
                int base;
                int altura;

                System.out.println("Você selecionou Retângulo");
                System.out.println("Qual o valor da base?:");
                base = scan.nextInt();
                System.out.println("Qual o valor da altura?:");
                altura = scan.nextInt();
                resultado = base * altura;
                System.out.println("A área do retângulo é: " + resultado);
            }
            case 4 ->
            {
                double base;
                double altura;

                System.out.println("Você selecionou Triângulo");
                System.out.println("Qual o valor da base?:");
                base = scan.nextDouble();
                System.out.println("Qual o valor da altura?:");
                altura = scan.nextDouble();
                resultado =(base * altura) / 2;
                System.out.println("A área do triângulo é: " + resultado);
            }
            default ->
            {
                System.out.println("Valor não suportado no sistema.");
            }


        }
    }
}
