package entradas_e_saidas;

import java.util.Scanner;

public class desafio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero1;
        int numero2;
        int multiplicacao;
        int soma;
        int subtracao;
        int divisao = 0;

        System.out.println("Digite o primeiro valor inteiro: ");
        numero1 = scan.nextInt();

        System.out.println("Digite o segundop valor inteiro: ");
        numero2 = scan.nextInt();

        soma = numero1 + numero2;
        multiplicacao = numero1 * numero2;
        subtracao = numero1 - numero2;

        if(numero2 == 0)
        {
            System.out.println("Não pode realizar divisão por zero");
        }
        else
        {
            divisao = numero1 / numero2;
        }

        System.out.println("A soma dos valores informados é: " + soma);
        System.out.println("A subtração dos valores informados é: " + subtracao);
        System.out.println("A multiplicação dos valores informados é: " + multiplicacao);
        System.out.println("A divisão dos valores informados é: " + divisao);

    }
}
