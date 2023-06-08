package matrix;

import java.util.Scanner;

public class desafio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[][] faturamento = new double[6][3];
        double[] totalMes = new double[6];

        for(int i=0; i<6; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.println("Informe o " + (j+1) + "º faturamento do " + (i+1) + "º mês:");
                faturamento[i][j] = scan.nextDouble();
                totalMes[i] = totalMes[i] + faturamento[i][j];
            }
        }
        for(int i=0; i<6; i++)
        {
            System.out.println("O faturamento do " + (i+1) + "º mês foi: " + totalMes[i]);
        }
    }
}
