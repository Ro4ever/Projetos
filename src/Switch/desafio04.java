package Switch;

import java.util.Arrays;
import java.util.Scanner;

public class desafio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String letraInformada;

        System.out.println("Informe uma letra: ");
        letraInformada = scan.nextLine();
        letraInformada = letraInformada.toLowerCase();

        switch(letraInformada)
        {
            case "a", "e", "i", "o", "u" ->
            {
                System.out.println("Essa letra é uma vogal.");
            }
            case "b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z" ->
            {
                System.out.println("Essa letra é uma consoante.");
            }
            default ->
            {
                System.out.println("Esse é um caracter especial.");
            }
        }

    }
}
