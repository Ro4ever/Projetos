package do_while_while;

import java.util.Scanner;

public class desafio07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nomes = "";
        String nome;
        String continuar;
        double idade;
        double salario;
        double filho;
        double numHab = 0;
        double totalSalario = 0;

        double mediaSalario;
        double mediaFilhos;
        double maiorSalario = 0;
        double mediaIdade;

        do
        {
            System.out.println("Qual seu nome?:");
            nome = scan.next();

            System.out.println("Qual sua idade?:");
            idade = scan.nextDouble();

            System.out.println("Quantos filhos você tem?(Se não tiver digite 0):");
            filho = scan.nextDouble();

            System.out.println("Quanto você ganha por mês?:");
            salario = scan.nextDouble();

            if(salario > maiorSalario)
             {
                maiorSalario = salario;
             }
            if(salario < 1000)
            {
                nomes = nomes.concat(nome + ", ");
            }

            numHab++;
            totalSalario = totalSalario + salario;

            System.out.println("Deseja continuar? CONTINUAR para sim e FINALIZAR para não:");
            continuar = scan.next();
            continuar = continuar.toUpperCase();
        }
        while(continuar.equals("CONTINUAR"));

        mediaSalario = totalSalario / numHab;
        mediaFilhos = filho / numHab;
        mediaIdade = idade / numHab;

        System.out.println("Média de salário da população: " + mediaSalario);
        System.out.println("Média de filhos: " + mediaFilhos);
        System.out.println("Maior salário: " + maiorSalario);
        System.out.println("Média da idade: " + mediaIdade);
        System.out.println("Nome das pessoas que ganham menos que R$1000,00: " + nomes);

    }
}
