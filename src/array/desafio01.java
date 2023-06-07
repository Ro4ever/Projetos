package array;

import java.util.Scanner;
import java.util.Arrays;

public class desafio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] numInformado = new double[10];
        double numerosTotal = 0;
        double media;

        for(int i=0; i<10; i++)
        {
            System.out.println("Informe o " + (i+1) + "º valor inteiro:");
            numInformado[i] = scan.nextDouble();
            numerosTotal = numerosTotal + numInformado[i];
        }
        media = numerosTotal / 10;
        Arrays.sort(numInformado);

        System.out.println("A média dos números: " + media);
        System.out.println("Segundo maior número informado: " + numInformado[8]);
        System.out.println("Terceiro menor número informado: " + numInformado[2]);
    }
}
