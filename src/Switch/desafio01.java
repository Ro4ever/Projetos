package Switch;

import java.util.Scanner;

public class desafio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numeroInformado;

        System.out.println("Digite um valor de 1 a 7:");
        numeroInformado = scan.nextInt();

        switch(numeroInformado)
        {
            case 1:
                System.out.println("Domingo");
                break;

            case 2:
                System.out.println("Segunda-Feira");
                break;

            case 3:
                System.out.println("Terça-Feira");
                break;

            case 4:
                System.out.println("Quarta-Feira");
                break;

            case 5:
                System.out.println("Quinta-Feira");
                break;

            case 6:
                System.out.println("Sexta-Feira");
                break;

            case 7:
                System.out.println("Sábado");
                break;

            default:
                System.out.println("Valor informado não suportado");
                break;

        }
    }
}
