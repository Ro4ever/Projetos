package methods;

import java.util.Scanner;

public class desafio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        calculoCompra(recebeUsuario());
    }
    public static double recebeUsuario()
    {
        Scanner scan = new Scanner(System.in);

        double valorCompra;

        System.out.println("Qual o valor total da compra? R$:");
        valorCompra = scan.nextDouble();

        return valorCompra;
    }
    public static void calculoCompra(double valorCompra)
    {
        Scanner scan = new Scanner(System.in);

        if(valorCompra <= 100)
        {
            System.out.println("Sua compra ficou em R$: " + valorCompra);
        }
        else if(valorCompra > 100 && valorCompra <= 200)
        {
            valorCompra = valorCompra - (valorCompra * 0.20);
            System.out.println("Sua compra ficou com desconto em R$: " + valorCompra);
        }
        else
        {
            valorCompra = valorCompra - (valorCompra * 0.30);
            System.out.println("Sua compra ficou com desconto em R$: " + valorCompra);
        }
    }
}
