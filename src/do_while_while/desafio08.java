package do_while_while;

import java.text.DecimalFormat;
import java.util.Scanner;

public class desafio08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.00");
        String mediaNotasArredondado = "";
        String continuar;
        String nome;
        String nomes = "";

        int sexo;
        int idade;
        int notaF;
        int notaM;

        int contador = 0;
        int contadorF5 = 0;
        int contadorF7 = 0;
        int contadorM5 = 0;
        int contadorM7 = 0;

        int mediaIdade = 0;
        int somaNotas = 0;
        int mediaNotas;

        do {
            contador++;

            System.out.println("Qual o seu nome?:");
            nome = scan.next();

            System.out.println("Qual a sua idade?:");
            idade = scan.nextInt();
            mediaIdade = mediaIdade + idade;

            System.out.println("Qual seu sexo?(1) para feminino e (2) para masculino:");
            sexo = scan.nextInt();

            if (sexo < 1 || sexo > 2)
            {
                System.out.println("Digite um valor válido.");
            }
            else if (sexo == 1)
            {
                System.out.println("De 0 a 10, qual nota você da para o filme?:");
                notaF = scan.nextInt();
                somaNotas = somaNotas + notaF;

                if (notaF < 0 || notaF > 10)
                {
                    System.out.println("Digite um valor válido.");
                }
                else if (notaF == 10)
                {
                    nomes = nomes.concat(nome + ", ");
                }
                else if (notaF <= 5)
                {
                    contadorF5++;
                }
                else if (notaF >= 7)
                {
                    contadorF7++;
                }
            }
            else if (sexo == 2)
            {
                System.out.println("De 0 a 10, qual nota você da para o filme?:");
                notaM = scan.nextInt();
                somaNotas = somaNotas + notaM;

                if (notaM < 0 || notaM > 10)
                {
                    System.out.println("Digite um valor válido.");
                }
                else if (notaM == 10)
                {
                    nomes = nomes.concat(nome + ", ");
                }
                else if (notaM <= 5)
                {
                    contadorM5++;
                }
                else if (notaM >= 7)
                {
                    contadorM7++;
                }
            }
                System.out.println("Deseja continuar? CONTINUAR para sim e FINALIZAR para não:");
                continuar = scan.next();
                continuar = continuar.toUpperCase();
            }
            while(continuar.equals("CONTINUAR"));

            mediaNotas = somaNotas / contador;
            mediaNotasArredondado = df.format(mediaNotas);

            System.out.println("A média de idade das pessoas que responderam ao questionário: " + mediaIdade);
            System.out.println("Lista de pessoas que deram nota igual a 10: " + nomes);
            System.out.println("A quantidade de homens cujas opiniões sobre o filme foram inferiores a 5: " + contadorM5);
            System.out.println("A quantidade de mulheres cujas opiniões sobre o filme foram inferiores a 5: " + contadorF5);
            System.out.println("A quantidade de homens cujas opiniões sobre o filme foram superiores a 7: " + contadorM7);
            System.out.println("A quantidade de mulheres cujas opiniões sobre o filme foram superiores a 7: " + contadorF7);
            System.out.println("Média das notas informadas: " + mediaNotasArredondado);
    }

}

