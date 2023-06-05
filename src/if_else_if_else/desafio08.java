package if_else_if_else;

import java.util.Scanner;

public class desafio08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nomeFilme;
        int duracao;
        int classificacao;

        System.out.println("Qual o nome do filme?:");
        nomeFilme = scan.nextLine();

        System.out.println("Qual a duração do filme?:");
        duracao = scan.nextInt();

        System.out.println("Qual a classificacão?(Digite 0 para livre):");
        classificacao = scan.nextInt();

        if(duracao < 60 && classificacao == 0)
        {
            System.out.println("Esse filme entra na categoria Infantil.");
        }
        else if(duracao < 120 && classificacao >= 10 && classificacao <=14)
        {
            System.out.println("Esse filme entra na categoria Adolescente.");
        }
        else if(duracao > 120 && classificacao == 16 || classificacao == 18)
        {
            System.out.println("Esse filme entra na categoria Adulto.");
        }
        else if(duracao > 60 && classificacao == 0)
        {
            System.out.println("Esse filme entra na categoria Não recomendado.");
        }
    }
}
