package do_while_while;

import java.util.Scanner;

public class desafio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1;
        int num2;
        int resultado = 0;
        int resultado1 = 0;
        int contador = 0;

        System.out.println("Informe o 1º valor:");
        num1 = scan.nextInt();

        System.out.println("Informe o 2º valor:");
        num2 = scan.nextInt();

        resultado1 = num1 * num2;

        do
        {
            System.out.println("Informe o resultado de " + num1 + " * " + num2);
            resultado = scan.nextInt();
            contador++;
        }
        while(resultado1 != resultado);

        System.out.println("Tentativas feitas: " + contador);
    }
}
