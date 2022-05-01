package primeiro;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Evandro
 */
public class Arrays001 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double[] num = new double[6];
        String[] avaliacao = new String[6];

        for (int i = 0; i < num.length; i++) {
            double media = 0.0d;
            double notas = 0.0d;
            
            System.out.println("Name...");
             String name = sc.next();
            avaliacao[i] = name;
            for (int j = 0; j < num.length; j++) {
                System.out.println("Nota...");
                num[i] = sc.nextDouble();
                for (int k = 0; k < num.length; k++) {

                    notas = num[k];
                    media += (notas / 6);

                }

            }
            if(media >= 10){
                media = 10;
              
            }
              if (media >= 6.0) {
                
                System.out.println("Alunos " + avaliacao[i] + " foi aprovado, sua media: " + String.format("%.2f", media));
            } else {

                System.out.println("Alunos " + avaliacao[i] + " foi reprovado, sua media: " + String.format("%.2f", media));
            }
            

        }

        sc.close();

        /*
        int res = 0;
        int[][] num = new int[3][3];
        for (int i = 0; i < num.length; i++) {
            for (int[] num1 : num) {
                int n = sc.nextInt();
                num1[i] = n;
                res += num1[i];
            }

        }
        double media = res / 6;
        System.out.println("Resutado " + num[1][1]);
        System.out.println("Media " + media);
         */
    }
}
