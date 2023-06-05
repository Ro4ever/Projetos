package if_else_if_else;

import java.util.Scanner;

public class desafio06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lado1;
        int lado2;
        int lado3;

        System.out.println("Digite o primeiro valor:");
        lado1 = scan.nextInt();

        System.out.println("Digite o segundo valor:");
        lado2 = scan.nextInt();

        System.out.println("Digite o terceiro valor:");
        lado3 = scan.nextInt();

        if(lado1 == lado2 && lado2 == lado3)
        {
            System.out.println("As medidas formam um triângulo equilátero.");
        }
        else if(lado1 == lado2 || lado2 == lado3 || lado1 == lado3)
        {
            System.out.println("As medidas formam um triângulo isósceles.");
        }
        else
        {
            System.out.println("As medidas formam um triângulo escaleno.");
        }
    }
}
