package methods;

import java.util.Scanner;

public class desafio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numInformado = new int[3];

        for(int i=0; i<3; i++)
        {
            numInformado[i] = inserirValor();
        }

        validacao(numInformado);
    }
    public static int inserirValor()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe valores inteiros:");
        return scan.nextInt();
    }
    public static void validacao(int[] numInformado)
    {
        int maiorNumero;

        if(numInformado[0] > numInformado[1] && numInformado[0] > numInformado[2])
        {
            maiorNumero = numInformado[0];
            System.out.println("O maior número informado é: " + maiorNumero);
        }
        else if(numInformado[1] > numInformado[0] && numInformado[1] > numInformado[2])
        {
            maiorNumero = numInformado[1];
            System.out.println("O maior número informado é: " + maiorNumero);
        }
        else if(numInformado[2] > numInformado[0] && numInformado[2] > numInformado[1])
        {
            maiorNumero = numInformado[2];
            System.out.println("O maior número informado é: " + maiorNumero);
        }
    }

}
