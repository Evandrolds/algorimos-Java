package estudologica;;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Evandro
 */
public class Dividir_X_Y {

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        
        double X, Y;
        for (int i = 0; i < N; i++) {
            X = leitor.nextDouble();
            Y = leitor.nextDouble();
        

            if (Y == 0.0) {

                System.out.println("divisao impossivel");
                
            } else {

                System.out.printf("%.1f\n",(double) (X / Y));
            }
        }
        leitor.close();
    }
}
