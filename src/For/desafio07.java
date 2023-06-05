package For;

import java.util.Scanner;

public class desafio07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double []notasMat = new double[4];
        double []pesoMat = new double[4];
        double []notasHis = new double[4];
        double []pesoHis = new double[4];
        double []notasPor = new double[4];
        double []pesoPor = new double[4];
        double []notasGeo = new double[4];
        double []pesoGeo = new double[4];
        double mediaMat = 0;
        double mediaHis;
        double mediaPor;
        double mediaGeo;

        for(int i=0; i<4; i++)
        {
            System.out.println("Informe a " + (i+1) + "ª nota de matemática:");
            notasMat[i] = scan.nextDouble();

            System.out.println("Informe o peso da " + (i+1) + "ª nota de matemática:");
            pesoMat[i] = scan.nextDouble();

            System.out.println("Informe a " + (i+1) + "ª nota de história:");
            notasHis[i] = scan.nextDouble();

            System.out.println("Informe o peso da " + (i+1) + "ª nota de história:");
            pesoHis[i] = scan.nextDouble();

            System.out.println("Informe a " + (i+1) + "ª nota de português:");
            notasPor[i] = scan.nextDouble();

            System.out.println("Informe o peso da " + (i+1) + "ª nota de português:");
            pesoPor[i] = scan.nextDouble();

            System.out.println("Informe a " + (i+1) + "ª nota de geografia:");
            notasGeo[i] = scan.nextDouble();

            System.out.println("Informe o peso da " + (i+1) + "ª nota de geografia:");
            pesoGeo[i] = scan.nextDouble();
        }
        mediaMat = (notasMat[0] * pesoMat[0] + notasMat[1] * pesoMat[1] + notasMat[2] * pesoMat[2] +notasMat[3] * pesoMat[3]) / (pesoMat[0] + pesoMat[1] + pesoMat[2] + pesoMat[3]);
        mediaHis = (notasHis[0] * pesoHis[0] + notasHis[1] * pesoHis[1] + notasHis[2] * pesoHis[2] + notasHis[3] * pesoHis[3]) / (pesoHis[0] + pesoHis[1] + pesoHis[2] + pesoHis[3]);
        mediaPor = (notasPor[0] * notasPor[0] + notasPor[1] * notasPor[1] + notasPor[2] * notasPor[2] + notasPor[3] * notasPor[3]) / (pesoPor[0] + pesoPor[1] + pesoPor[2] + pesoPor[3]);
        mediaGeo = (notasGeo[0] * pesoGeo[0] + notasGeo[1] * pesoGeo[1] + notasGeo[2] * pesoGeo[2] + notasGeo[3] * pesoGeo[3]) / (pesoGeo[0] + pesoGeo[1] + pesoGeo[2] + pesoGeo[3]);

        for(int i=0; i<4; i++)
        {
            System.out.println((i+1) + "ª nota de matemática: " + notasMat[i]);
        }

        System.out.println("Média de matemática: " + mediaMat + "\n");

        for(int i=0; i<4; i++)
        {
            System.out.println((i+1) + "ª nota de história: " + notasHis[i]);
        }

        System.out.println("Média de história: " + mediaHis + "\n");

        for(int i=0; i<4; i++)
        {
            System.out.println((i+1) + "ª nota de português: " + notasPor[i]);
        }

        System.out.println("Média de português: " + mediaPor + "\n");

        for(int i=0; i<4; i++)
        {
            System.out.println((i+1) + "ª nota de geografia: " + notasGeo[i]);
        }

        System.out.println("Média de geografia: " + mediaGeo);
    }
}
