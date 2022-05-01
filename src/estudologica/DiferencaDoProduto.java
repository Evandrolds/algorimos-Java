package estudos;

import java.util.Scanner;

/**
 *
 * @author Evandro
 */
/*
Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
Exemplos:
Entrada:                     Saída:
5
6
7
8
                          DIFERENCA = -26
Entrada:                       Saída:
5
6
-7
8
                           DIFERENCA = 86
 */
public class DiferencaDoProduto {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Double a, b, c, d, diferenca;
            System.out.println("digite os valores de A,B,C e D ");
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();
            d = sc.nextDouble();
            diferenca = (a*b-c*d);
            System.out.println(" DIFERENÇA: " + diferenca);
                    
        }

    }
}
