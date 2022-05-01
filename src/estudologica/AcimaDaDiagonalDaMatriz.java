package estudologica;

import java.util.Scanner;

/**
 *
 * @author Evandro
 */
public class AcimaDaDiagonalDaMatriz {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            
        double soma = 0;
        char O = sc.next().toUpperCase().charAt(0);
        double[][] M = new double[12][12];

        for (int i = 0; i < 12; ++i) {
            for (int j = 0; j < 12; ++j) {
                M[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < 10; ++i) {
            for (int j = 0; j <= 10-i; ++j) {
                    soma += M[i][j];
            }
        }

        if (O == 'M')
            soma /= 66.0;
        System.out.println(String.format("%.1f", soma));
    }
    }
}
