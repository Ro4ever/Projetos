package matrix;

import java.util.Scanner;

public class desafio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] matrix = new int[4][5];
        int[] somaLinhas = new int[4];
        int somaTotal = 0;

        for(int i=0; i<4; i++)
        {
            for(int j=0; j<5; j++)
            {
                System.out.println("Insira o " + (j+1) + "º valor da " + (i+1) + "º matriz:");
                matrix[i][j] = scan.nextInt();

                somaLinhas[i] = somaLinhas[i] + matrix[i][j];
                somaTotal = somaTotal + matrix[i][j];
            }
        }
        for(int i=0; i<4; i++)
        {
            System.out.println("A soma da " + (i+1) + "ª linha:" + somaLinhas[i]);
        }
        System.out.println("A soma total da matrix: " + somaTotal);
    }
}
