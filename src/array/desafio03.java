package array;

import java.util.Scanner;

public class desafio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] primeiroVetor = new double[5];
        double[] segundoVetor = new double[5];
        double[] terceiroVetor = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o " + (i + 1) + "º número do primeiro vetor:");
            primeiroVetor[i] = scan.nextDouble();

            System.out.println("Informe o " + (i+1) + "º número do segundo vetor:");
            segundoVetor[i] = scan.nextDouble();

            terceiroVetor[i] = primeiroVetor[i] + segundoVetor[i];
        }
        for(int i = 0; i < 5; i++)
        {
            System.out.println(primeiroVetor[i] + " + " + segundoVetor[i] + " = " + terceiroVetor[i]);
        }
    }
}
