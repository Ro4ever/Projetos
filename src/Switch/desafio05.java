package Switch;

import java.util.Scanner;

public class desafio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double numeroInformado;
        int escolherConversao;
        double resultado;

        System.out.println("Informe a medida em metros que deseja converter");
        numeroInformado = scan.nextDouble();

        System.out.println("Selecione a conversão");
        System.out.println("[1] Centímetros");
        System.out.println("[2] Polegadas");
        System.out.println("[3] Pés");
        System.out.println("[4] Quilômetros");
        escolherConversao = scan.nextInt();

        switch(escolherConversao)
        {
            case 1 ->
            {
                resultado = numeroInformado * 100;
                System.out.println("Você selecionou centímetros");
                System.out.println("O valor em metros para centímetros fica: " + resultado + " centímetros");
            }
            case 2 ->
            {
                resultado = numeroInformado * 39.37;
                System.out.println("Você selecionou polegadas");
                System.out.println("O valor em metros para polegadas fica: " + resultado + " polegadas");
            }
            case 3 ->
            {
                resultado = numeroInformado * 3.281;
                System.out.println("Você selecionou pés");
                System.out.println("O valor em metros para pés fica: " + resultado + " pés");
            }
            case 4 ->
            {
                resultado = numeroInformado / 1000;
                System.out.println("Você selecionou quilômetros");
                System.out.println("O valor em metros para quilômetros fica: " + resultado + " quilômetros");
            }
            default -> System.out.println("Valor informado não suportado");
        }
    }
}
