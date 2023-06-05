package For;

import java.util.Scanner;

public class desafio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1;
        int num2;
        int soma = 0;
        int totalMedia = 0;
        int media = 0;

        System.out.println("Informe o primeiro valor inteiro:");
        num1 = scan.nextInt();

        System.out.println("Informe o segundo valor inteiro:");
        num2 = scan.nextInt();

        for(int i=num1 + 1; i<num2; i++)
        {
            soma = soma + i;
            totalMedia++;
        }
            media = soma / totalMedia;

        System.out.println("A soma dos valores entre " + num1 + " e " + num2 + " é: " + soma);
        System.out.println("A média dos valores entre " + num1 + " e " + num2 + " é: " + media);

    }
}
