package entradas_e_saidas;

import java.util.Scanner;

public class desafio07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double temperatura;
        double fahrenheit;
        double kelvin;

        System.out.println("Digite uma temperatura em celcius para converter:");
        temperatura = scan.nextInt();

        fahrenheit = (temperatura * 9.5) + 32;

        System.out.println("Temperatura de Celcius para Fahrenheit: " + fahrenheit);

        kelvin = temperatura + 273.15;

        System.out.println("Temperatura de Celcius para Kelvin: " + kelvin);
    }
}
