package matrix;

import java.util.Scanner;

public class desafio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[][] notas = new double[5][3];
        double [] somaMedia = new double[5];

        for(int i=0; i<5; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.println("Informe a " + (j+1) + "ª nota do " + (i+1) + "º aluno:");
                notas[i][j] = scan.nextDouble();

                somaMedia[i] = somaMedia[i] + notas[i][j];
            }
        }
        for(int i=0; i<5; i++)
        {
            somaMedia[i] = somaMedia[i] / 3;
        }
        for(int i=0; i<5; i++)
        {
            System.out.println("A média do " + (i+1) + "º aluno é: " + somaMedia[i]);
        }
    }
}
