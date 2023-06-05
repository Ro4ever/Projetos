package do_while_while;

import java.util.Scanner;

public class desafio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sexo;
        int totalPessoas = 0;
        double mediaIdade;
        double mediaSalarioG = 0;
        double maiorSalario = 0;
        double menorSalario = 0;
        String continuar;

        int qtdF = 0;
        int qtdIdadeF = 0;
        double idadeF = 0;
        double mediaIdadeF;
        double mediaSalarioF;
        double salarioF = 0;
        double salario=0;

        int qtdM = 0;
        int qtdIdadeM = 0;
        double idadeM = 0;
        double mediaIdadeM;
        double mediaSalarioM;
        double salarioM = 0;

        do
        {
            System.out.println("Qual seu gênero? [1] para feminino e [2] para masculino:");
            sexo = scan.nextInt();

            if(sexo == 2)
            {
                System.out.println("Qual a sua idade?:");
                idadeM = scan.nextDouble();

                System.out.println("Qual o seu salário?:");
                salario = scan.nextDouble();

                salarioM = salarioM + salario;

                if(salario > maiorSalario)
                {
                    maiorSalario = salario;
                }
                if(totalPessoas == 0)
                {
                    menorSalario = salario;
                }
                else if(salario < maiorSalario)
                {
                    menorSalario = salario;
                }
                qtdM++;
                totalPessoas++;
                qtdIdadeM++;
            }
            else if(sexo == 1)
            {
                System.out.println("Qual a sua idade?:");
                idadeF = scan.nextDouble();

                System.out.println("Qual o seu salário?:");
                salario = scan.nextDouble();

                salarioF = salarioF + salario;

                if(salario > maiorSalario)
                {
                    maiorSalario = salario;
                }
                if(totalPessoas == 0)
                {
                    menorSalario = salario;
                }
                else if(salario < maiorSalario)
                {
                    menorSalario = salario;
                }
                qtdF++;
                totalPessoas++;
                qtdIdadeF++;
            }
            System.out.println("Deseja continuar? CONTINUAR para sim e FINALIZAR para não:");
            continuar = scan.next();
            continuar = continuar.toUpperCase();
        }
        while(continuar.equals("CONTINUAR"));

        mediaIdade = (idadeF + idadeM) / totalPessoas;
        mediaIdadeF = idadeF / qtdF;
        mediaIdadeM = idadeM / qtdM;
        mediaSalarioG = (salarioF + salarioM) / totalPessoas;
        mediaSalarioF = salarioF / qtdF;
        mediaSalarioM = salarioM / qtdM;
        System.out.println("A média de idade geral: " + mediaIdade);
        System.out.println("A média de idade de pessoas do gênero feminino: " + mediaIdadeF);
        System.out.println("A média de idade de pessoas do gênero masculino: " + mediaIdadeM);
        System.out.println("A média salarial geral: " + mediaSalarioG);
        System.out.println("A média salarial Feminino: " + mediaSalarioF);
        System.out.println("A média salarial Masculino: " + mediaSalarioM);
        System.out.println("O maior salário: " + maiorSalario);
        System.out.println("O menor salário: " + menorSalario);
    }
}
