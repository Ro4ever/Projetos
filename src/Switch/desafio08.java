package Switch;

import java.util.Scanner;

public class desafio08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double salario;
        double imposto1 = 0.075;
        double imposto2 = 0.15;
        double imposto3 = 0.225;
        double imposto4 = 0.275;
        int escolher = 0;


        System.out.println("Informe o seu salário bruto:");
        salario = scan.nextDouble();

        if(salario <= 1903.98)
        {
            escolher = escolher;
        }
        else if(salario >= 1903.99 && salario <= 2826.65)
        {
            escolher = escolher + 1;
        }
        else if(salario >= 2826.66 && salario <= 3751.05)
        {
            escolher = escolher + 2;
        }
        else if(salario >= 3751.06 && salario <= 4664.68)
        {
            escolher = escolher + 3;
        }
        else
        {
            escolher = escolher + 4;
        }


        switch(escolher)
        {
            case 0 ->
            {
                System.out.println("Isento do imposto");
            }
            case 1 ->
            {
                salario = salario - (salario * imposto1);
                System.out.println("Seu salário é: " + salario);
            }
            case 2 ->
            {
                salario = salario - (salario * imposto2);
                System.out.println("Seu salário é: " + salario);
            }
            case 3 ->
            {
                salario = salario - (salario * imposto3);
                System.out.println("Seu salário é: " + salario);
            }
            case 4 ->
            {
                salario = salario - (salario * imposto4);
                System.out.println("Seu salário é: " + salario);
            }


        }

    }
}
