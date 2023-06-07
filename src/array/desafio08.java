package array;

import java.util.Scanner;
import java.util.Arrays;

public class desafio08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numInformado = new int[5];

        for(int i=0; i<5; i++)
        {
            System.out.println("Informe o " + (i+1) + "º valor inteiro:");
            numInformado[i] = scan.nextInt();
        }
        Arrays.sort(numInformado);
        for(int i=0; i<5; i++)
        {
            System.out.println(numInformado[i]);
        }
    }
}
