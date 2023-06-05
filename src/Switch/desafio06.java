package Switch;

import java.util.Scanner;

public class desafio06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numeroInformado;

        System.out.println("[1] Pedro");
        System.out.println("[2] Gian");
        System.out.println("[3] Thiago");
        System.out.println("[4] Roberto");
        System.out.println("[5] Fábio");
        numeroInformado = scan.nextInt();

        switch(numeroInformado)
        {
            case 1 -> System.out.println("Você votou em Pedro, partido PT");
            case 2 -> System.out.println("Você votou em Gian, partido PSDB");
            case 3 -> System.out.println("Você votou em Thiago, partido PCdoB");
            case 4 -> System.out.println("Você votou em Roberto, partido PL");
            case 5 -> System.out.println("Você votou em Fábio, patido PSOL");
            default -> System.out.println("Erro, valor inválido");
        }
    }
}
