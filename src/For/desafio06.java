package For;

import java.util.Scanner;

public class desafio06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       int primo = 0;

        for(int i=1; i<=100; i++)
        {
            for(int j=1; j<=i; j++)
            {
                if(i % j == 0)
                {
                    primo++;
                }
            }
            if(primo == 2)
            {
                System.out.println(i);
            }
            primo = 0;
        }
    }
}
