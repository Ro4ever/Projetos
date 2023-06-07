package array;

import java.util.Scanner;

public class desafio06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] numInformado = new double[10];

        for(int i=0; i<10; i++)
        {
            System.out.println("Informe o " + (i+1) + "º valor:");
            numInformado[i] = scan.nextDouble();
        }
        for(int i=9; i>-1; i--)
        {
            System.out.println(numInformado[i]);
        }
    }
}
