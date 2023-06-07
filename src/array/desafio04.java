package array;

import java.util.Scanner;
import java.util.Arrays;

public class desafio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] meses = new double[12];
        double media;
        double tempTotal = 0;

        for(int i=0; i<12; i++)
        {
            System.out.println("Informe a temperatura do " + (i+1) + "º mês:");
            meses[i] = scan.nextDouble();
            tempTotal = tempTotal + meses[i];
        }
        media = tempTotal / 12;
        Arrays.sort(meses);

        System.out.println("A menor temperatura registrada durante o ano: " + meses[0]);
        System.out.println("A maior temperatura registrada durante o ano: " + meses[11]);
        System.out.println("A média da temperatura registrada durante o ano: " + media);
    }
}
