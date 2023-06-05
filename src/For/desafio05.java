package For;

import java.util.Scanner;

public class desafio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String fraseInformada;
        char[] vogal = {'a','e','i','o','u'};
        char[] consoante = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','x','w','y','z'};
        boolean caracterEspecial = true;
        int contadorVogal = 0;
        int contadorConsoante = 0;
        int contadorEspaco = 0;
        int contadorEspecial = 0;

        System.out.println("Digite uma frase:");
        fraseInformada = scan.nextLine();
        fraseInformada = fraseInformada.toLowerCase();

        char[] frase = fraseInformada.toCharArray();

        for(char letra : frase)
        {
            caracterEspecial = true;

            for(char vogais : vogal)
            {
               if(letra == vogais)
               {
                   contadorVogal++;
                   caracterEspecial = false;
                   break;
               }
            }
            for(char consoantes : consoante)
            {
               if(letra == consoantes)
               {
                   contadorConsoante++;
                   caracterEspecial = false;
                   break;
               }

            }
            if(letra == ' ')
            {
                contadorEspaco++;
            }
            else if(caracterEspecial)
            {
                contadorEspecial++;
            }
        }
        System.out.println("A frase possui: " + contadorVogal + " vogais");
        System.out.println("A frase possui: " + contadorConsoante + " consoantes");
        System.out.println("A frase possui: " + contadorEspaco + " espaços");
        System.out.println("A frase possui: " + contadorEspecial + " caracteres especiais");



    }
}
