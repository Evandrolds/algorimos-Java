package estudologica;

import java.util.Scanner;

/**
 *
 * @author Evandro
 */
public class RaizesDeBaskara {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c, x1, x2, delta;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        delta = Math.pow(b, 2.0) - 4 * a * c;
        
        x1 = (-b + Math.sqrt(delta)) / (2 * a);
        x2 = (-b - Math.sqrt(delta)) / (2 * a);
        if (a == 0.0 || delta < 1) {
            System.out.println(" Impossivel calcular ");
            
            return;
        }
        System.out.println(" X1 " + String.format("%.5f", x1));
        System.out.println(" X2 " + String.format("%.5f", x2));
         
        sc.close();
    }
}
