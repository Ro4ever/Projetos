package entradas_e_saidas;

import java.util.Scanner;

public class desafio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.println("Digite um valor inteiro: ");
        numero = scan.nextInt();

        if((numero % 2) == 0)
        {
            System.out.println(numero + " esse valor é par");
        }
        else
        {
            System.out.println(numero + " esse valor é impar");
        }
    }
}
