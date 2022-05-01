package estudos2;

import java.util.Scanner;

/**
 *
 * @author Evandro
 */
public class ParOuImpar {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println(" Enter number...");
            float n = sc.nextFloat();
            if(n%2==0){
                System.out.println(" Number Par");
            }else{
                System.out.println(" Number Impar");
            }
        }
    }
}
