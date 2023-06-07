package array;

import java.util.Scanner;

public class desafio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] nota1 = new double[5];
        double[] peso1 = new double[5];

        double[] nota2 = new double[5];
        double[] peso2 = new double[5];

        double[] nota3 = new double[5];
        double[] peso3 = new double[5];

        double[] media = new double[5];

        for(int i=0; i<5; i++)
        {
            System.out.println("Informe a primeira nota do " + (i+1) + "ª aluno:");
            nota1[i] = scan.nextDouble();

            System.out.println("Informe o peso da primeira nota do " + (i+1) + "º aluno:");
            peso1[i] = scan.nextDouble();

            System.out.println("Informe a segunda nota do " + (i+1) + "ª aluno:");
            nota2[i] = scan.nextDouble();

            System.out.println("Informe o peso da segunda nota do " + (i+1) + "º aluno:");
            peso2[i] = scan.nextDouble();

            System.out.println("Informe a terceira nota do " + (i+1) + "ª aluno:");
            nota3[i] = scan.nextDouble();

            System.out.println("Informe o peso da terceira nota do " + (i+1) + "º aluno:");
            peso3[i] = scan.nextDouble();
        }
        for(int i=0; i<5; i++)
        {
            media[i] = (nota1[i] * peso1[i]) + (nota2[i] * peso2[i]) + (nota3[i] * peso3[i]) / (peso1[i] + peso2[i] + peso3[i]);
        }
        for(int i=0; i<5; i++)
        {
            System.out.println("A média do " + (i+1) + "º aluno: " + media[i]);
        }
    }
}
