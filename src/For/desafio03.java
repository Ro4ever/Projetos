package For;

import java.util.Scanner;

public class desafio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double numeroDivisor;
        double quociente = 0;
        double resto = 0;

        System.out.println("Informe um número dividor de 1 a 9:");
        numeroDivisor = scan.nextDouble();

        for(int i=0; i<20; i++)
        {
            if(i == 0)
            {
                System.out.println("Não pode realizar divisão por zero");
                i++;
            }
            else
            {
                quociente = i / numeroDivisor;
                resto = i % numeroDivisor;
            }

            System.out.println(i + " / " + numeroDivisor + " = " + quociente);
            System.out.println("Resto = " + resto);

        }
    }
}
