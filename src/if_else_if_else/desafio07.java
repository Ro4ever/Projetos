package if_else_if_else;

import java.util.Scanner;

public class desafio07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double horasTrabalhadas;
        double valorHora;
        double salario;
        double salarioEx = 0;
        double valorHoraEx;

        System.out.println("Qual valor hora do colaborador?: ");
        valorHora = scan.nextDouble();

        System.out.println("Quantas horas o colaborador fez?: ");
        horasTrabalhadas = scan.nextDouble();

        if(horasTrabalhadas > 160)
        {
            valorHoraEx = valorHora * 0.5;
            salarioEx = (horasTrabalhadas - 160) * valorHoraEx;
        }

        salario = (horasTrabalhadas * valorHora) + salarioEx;

        System.out.println("Valor do salário do colaborador: " + salario);
    }
}
