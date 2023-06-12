package matrix;

import java.util.Scanner;

public class desafio08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[][] matrix = new double[4][4];
        int valorInformado1;
        int valorInformado2 = 0;
        double [] primaria = new double[4];
        double [] secundaria = new double[4];

        for(int i=0; i<4; i++)
        {
            for(int j=0; j<4; j++)
            {
                System.out.println("Informe os valores inteiros:");
                matrix[i][j] = scan.nextDouble();
            }
        }
        for(int i=0; i<4; i++)
        {
            for(int j=0; j<4; j++)
            {
                System.out.print("\t" + matrix[i][j] + "   ");
            }
            System.out.println();
        }
        System.out.println("Informe o um valor para divisão da diagonal primária: ");
        valorInformado1 = scan.nextInt();
        if(valorInformado1 == 0)
        {
            System.out.println("Não pode realizar divisões com zero.");
        }
        else
        {
            System.out.println("Informe o um valor para multiplicação da diagonal secundária: ");
            valorInformado2 = scan.nextInt();

            for(int i=0; i<4; i++)
            {
                for(int j=0; j<4; j++)
                {
                    primaria[i] = matrix[i][j] / valorInformado1;
                    i++;
                }
            }
            for(int i=0; i<4; i++)
            {
                for(int j=0; j<4; j++)
                {
                    secundaria[i] = matrix[i][3 - i] * valorInformado2;
                }
            }
            System.out.println("Valores da divisão primária: ");
            for(int i=0; i<4; i++)
            {
                System.out.print(primaria[i] + " ");
            }
            System.out.println("\nValores da multiplicação secundária: ");
            for(int i=0; i<4; i++)
            {
                System.out.print(secundaria[i] + " ");
            }
        }

    }
}
