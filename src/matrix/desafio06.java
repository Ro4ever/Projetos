package matrix;

import java.util.Scanner;

public class desafio06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] matrix = new int[4][4];
        int[][] matrix2 = new int[4][4];
        int contador = 0;

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
            }
        }
        for(int i=0; i<4; i++)
        {
            for(int j=0; j<4; j++)
            {
                for(int x=0; x<4; x++)
                {
                    for(int y=0; y<4; y++)
                    {
                        if(matrix[i][j] == matrix2[x][y])
                        {
                            contador++;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println("Quantidades repetidos: " + contador);
    }
}
