package entradas_e_saidas;

import java.util.Scanner;

public class desafio06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double numero;

        System.out.println("Digite um valor real: ");
        numero = scan.nextDouble();

        System.out.println(Math.floor(numero));
    }
}
