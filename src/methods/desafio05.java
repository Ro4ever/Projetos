package methods;

import java.util.Scanner;

public class desafio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        validacao(valorUsuario());

    }
    public static int valorUsuario()
    {
        Scanner scan = new Scanner(System.in);

        int valorInformado;

        System.out.println("Informe um valor inteiro:");
        valorInformado = scan.nextInt();

        return valorInformado;
    }
    public static void validacao(int valorInformado)
    {
        if(valorInformado > 0)
        {
            System.out.println("Esse valor é positivo.");
        }
        else if(valorInformado < 0)
        {
            System.out.println("Esse valor é negativo.");
        }
        else
        {
            System.out.println("Valor 0.");
        }
    }
}
