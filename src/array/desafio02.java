package array;

import java.util.Scanner;

public class desafio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] numInformado = new double[5];

        System.out.println("Informe o 1º valor:");
        numInformado[0] = scan.nextDouble();

        System.out.println("Informe o 2º valor:");
        numInformado[1] = scan.nextDouble();

        System.out.println("Informe o 3º valor:");
        numInformado[2] = scan.nextDouble();

        System.out.println("Informe o 4º valor:");
        numInformado[3] = scan.nextDouble();

        System.out.println("Informe o 5º valor:");
        numInformado[4] = scan.nextDouble();
    }
}
