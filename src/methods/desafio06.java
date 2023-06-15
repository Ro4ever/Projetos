package methods;

import java.util.Scanner;

public class desafio06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        validacao(valorUsuario());

    }
    public static int valorUsuario()
    {
        Scanner scan = new Scanner(System.in);

        int valorInformado;


        System.out.println("Informe um valor:");
        valorInformado = scan.nextInt();

        return valorInformado;
    }
    public static void validacao(int valorInformado)
    {
        boolean verificar = false;

        if(valorInformado < 0)
        {
            System.out.println("Somente valores positivos.");
        }
        else if(valorInformado == 1)
        {
            System.out.println("Esse valor não é primo.");
        }
        else if(valorInformado % 2 != 0 || valorInformado == 2)
        {
        verificar = true;
        System.out.println("Esse valor é primo.");
        }
        else
        {
            System.out.println("Esse valor não é primo.");
        }
    }
}
