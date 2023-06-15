package methods;

import java.util.Scanner;

public class desafio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        mostraIdade(idade());
    }
    public static int idade()
    {
        Scanner scan = new Scanner(System.in);

        int anoNasc;

        System.out.println("Qual seu ano de nascimento?:");
        anoNasc = scan.nextInt();

        return anoNasc;
    }
    public static void mostraIdade(int anoNasc)
    {
        anoNasc = 2021 - anoNasc;
        System.out.println("Sua idade é: " + anoNasc);
    }
}
