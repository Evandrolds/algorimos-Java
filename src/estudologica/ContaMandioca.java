package primeiro;

import java.util.Scanner;

/**
 *
 * @author Evandro
 */
public class ContaMandioca {

    public static final int[] porcoes = {300, 1500, 600, 1000, 150};

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int mand = 225;
        int count;
        for (int i = 0; i < porcoes.length; i++) {
            count = leitor.nextInt();

            mand += porcoes[i] * count;

        }
        System.out.println(mand);
    }
}
