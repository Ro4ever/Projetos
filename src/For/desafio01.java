package For;

import java.util.Scanner;

public class desafio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int valor = 0;
        int somaPar = 0;
        int somaImpar = 0;
        int somaTotal = 0;

        for(int i=0; i<5; i++)
        {
            System.out.println("Digite o " + (i+1) + "º número");
            valor = scan.nextInt();

            if(valor % 2 == 0)
            {
                somaPar = somaPar + valor;
            }
            else
            {
                somaImpar = somaImpar + valor;
            }
            somaTotal = somaImpar + somaPar;
        }
        System.out.println("Soma dos pares: " + somaPar);
        System.out.println("Soma dos ímpares: " + somaImpar);
        System.out.println("Soma de todos os valores: " + somaTotal);


    }
}
