package array;

import java.util.Scanner;

public class desafio07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] notas = new double[30];
        int contadorAcimaMedia = 0;
        double mediaNota = 0;

        for(int i=0; i<30; i++)
        {
            System.out.println("Informe a " + (i+1) + "ª nota:");
            notas[i] = scan.nextDouble();
            mediaNota = mediaNota + notas[i];

            if(notas[i] >= 7)
            {
                contadorAcimaMedia++;
            }
        }
        mediaNota = mediaNota / 30;
        System.out.println("A média da turma: " + mediaNota);
        System.out.println("Quantidade de alunos acima da média: " + contadorAcimaMedia);
    }
}
