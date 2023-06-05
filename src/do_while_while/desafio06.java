package do_while_while;

import java.text.DecimalFormat;
import java.util.Scanner;

public class desafio06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.00");

        double peso;
        double altura;
        double imc;
        String continuar;

        do
        {
            System.out.println("Qual seu peso?:");
            peso = scan.nextDouble();

            System.out.println("Qual a sua altura?:");
            altura = scan.nextDouble();

            imc = peso / (altura * altura);
            String imc2 = df.format(imc);

            System.out.println("Seu imc é: " + imc2);

            System.out.println("Deseja continuar? CONTINUAR para sim e FINALIZAR para não:");
            continuar = scan.next();
            continuar = continuar.toUpperCase();
        }
        while(continuar.equals("CONTINUAR"));
    }
}
