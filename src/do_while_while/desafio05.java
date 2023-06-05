package do_while_while;

import java.util.Scanner;

public class desafio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1;
        int num2;
        int resultado;
        int tentativa;
        int contador = 0;

            System.out.println("Informe o primeiro valor: ");
            num1 = scan.nextInt();

            System.out.println("Informe o segundo valor: ");
            num2 = scan.nextInt();

            resultado = num1 + num2;


        do
        {
            System.out.println("Informe o valor da soma desses dois números: ");
            tentativa = scan.nextInt();

            if(resultado != tentativa)
            {
                System.out.println("Você errou, tente novamente.");
                contador++;
            }
        }
        while(resultado != tentativa);

        System.out.println("Parabéns, você acertou!!");
        System.out.println("Números de tentativas: " + contador);
    }
}
