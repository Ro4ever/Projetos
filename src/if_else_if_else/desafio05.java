package if_else_if_else;

import java.util.Scanner;

public class desafio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double peso;
        double altura;
        double imc;

        System.out.println("Qual seu peso?: ");
        peso = scan.nextDouble();

        System.out.println("Qual sua altura?: ");
        altura = scan.nextDouble();

        imc = peso / (altura * altura);

        if(imc < 18.5)
        {
            System.out.println("Você está abaixo do peso.");
        }
        else if(imc < 24.9)
        {
            System.out.println("Você está com peso normal.");
        }
        else if(imc < 29.9)
        {
            System.out.println("Você está com sobrepeso");
        }
        else
        {
            System.out.println("Você está obeso.");
        }
    }
}
