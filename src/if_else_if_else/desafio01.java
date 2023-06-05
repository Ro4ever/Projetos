package if_else_if_else;

import java.util.Scanner;

public class desafio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double nota;

        System.out.println("Digite uma nota de 0 a 10:");
        nota = scan.nextDouble();

        if(nota >= 7)
        {
            System.out.println("Você está aprovado!!!");
        }
        else if(nota == 5 || nota == 6)
        {
            System.out.println("Você está em recuperação.");
        }
        else
        {
            System.out.println("Você está reprovado");
        }
    }
}
