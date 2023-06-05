package do_while_while;

import java.util.Scanner;

public class desafio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numeroInformado;
        int contador = 0;

        do
        {
            System.out.println("Informe um valor inteiro:");
            numeroInformado = scan.nextInt();

            if(numeroInformado <= 0)
            {
                System.out.println("Informe o valor válido.");
            }
            contador++;
        }
        while(numeroInformado % 2 == 1);

        System.out.println("Tentativas feitas : " + contador);



    }
}
