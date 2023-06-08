package matrix;

import java.util.Scanner;

public class desafio06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] matrix = new int[4][4];
        int[][] matrix2 = new int[4][4];
        int contador = 0;
        int[][] iguais = new int[4][4];

        for(int i=0; i<4; i++)
        {
            for(int j=0; j<4; j++)
            {
                System.out.println("Informe os valor da 1ª matrix:");
                matrix[i][j] = scan.nextInt();
            }
        }
        for(int i=0; i<4; i++)
        {
            for(int j=0; j<4; j++)
            {
                System.out.println("Informe os valores da 2ª matrix:");
                matrix2[i][j] = scan.nextInt();

                if(matrix[i][j] == matrix2[i][j])
                {
                    contador++;
                    iguais[i][j] = matrix2[i][j];
                }
            }
        }
        System.out.println("Repetidos: " + contador);
        for(int i=0; i<4; i++)
        {
            for(int j=0; j<4; j++)
            {
                if(iguais[i][j] > 0)
                {
                    System.out.println("Valores repetidos: " + iguais[i][j]);
                }
            }
        }
    }
}
