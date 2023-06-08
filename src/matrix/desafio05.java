package matrix;

import java.util.Scanner;

public class desafio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] matrix1 = new int[5][5];
        int[][] matrix2 = new int[5][5];

        for(int i=0; i<5; i++)
        {
            for(int j=0; j<5; j++)
            {
                System.out.println("Informe o " + (j+1) + "ª valor da " + (i+1) + "ª matrix:");
                matrix1[i][j] = scan.nextInt();

                matrix2[i][j] = matrix1[i][j] + matrix1[i][j];
            }
        }
        for(int i=0; i<5; i++)
        {
            for(int j=0; j<5; j++)
            {
                System.out.println((j+1) + "º valor da " + (i+1) + "ª matrix 1: " + matrix1[i][j]);
                System.out.println((j+1) + "º valor da " + (i+1) + "ª matrix 2: " + matrix2[i][j]);
            }
        }
    }
}
