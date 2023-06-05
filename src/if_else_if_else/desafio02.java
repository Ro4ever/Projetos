package if_else_if_else;

import java.util.Scanner;

public class desafio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota1;
        int nota2;
        int nota3;
        int media;

        System.out.println("Digite a primeira nota:");
        nota1 = scan.nextInt();

        System.out.println("Digite a segunda nota:");
        nota2 = scan.nextInt();

        System.out.println("Digite a terceira nota:");
        nota3 = scan.nextInt();

        media = (nota1 + nota2 + nota3) / 3;

        if(media >= 7)
        {
            System.out.println("Você foi aprovado!!.");
        }
        else if(media == 5 || media == 6)
        {
            System.out.println("Você está em recuperação.");
        }
        else
        {
            System.out.println("Você está reprovado.");
        }
    }
}
