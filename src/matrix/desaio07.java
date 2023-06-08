package matrix;

import java.util.Scanner;

public class desaio07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] matrix = new int[3][2];

        for(int i=0; i<3; i++)
        {
            for(int j=0; j<2; j++)
            {
                System.out.println("Informe o valor da matrix:");
                matrix[i][j] = scan.nextInt();
            }
        }
        System.out.println("Matrix original:");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<2; j++)
            {
                System.out.println(matrix[i][j]);
            }
        }
        System.out.println("Matrix transposta:");
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.println(matrix[j][i]);
            }
        }
    }
}
