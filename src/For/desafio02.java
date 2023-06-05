package For;

import java.util.Scanner;

public class desafio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String palavra;

        System.out.println("Informe uma palavra:");
        palavra = scan.nextLine();

        char[] palavraVetor = palavra.toCharArray();

        for(char contador: palavraVetor)
        {
            System.out.println(contador);
        }
        System.out.println("A palavra tem " + palavra.length() + " letras");
    }
}
