package estudos;

import java.util.Scanner;

/**
 *
 * @author Evandro
 */
/*
Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
Exemplos:
Entrada:                                    Saída:
12 1 5.30
16 2 5.10
                                     VALOR A PAGAR: R$ 15.50
Entrada:                                     Saída:
13 2 15.30
161 4 5.20
                                     VALOR A PAGAR: R$ 51.40
Entrada:                                     Saída:
1 1 15.10
2 1 15.10
                                     VALOR A PAGAR: R$ 30.20
*/
public class ValorDaPeca {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int quant;
            double valor;
            double total = 0.0;
            for(int i = 1; i <= 2; i++ ){
                System.out.println("Digite o código da peça " + i);
                int codigo = sc.nextInt();
                System.out.println("Digite a quanidade ");
                quant = sc.nextInt();
                System.out.println("Digite o preço R$ ");
                valor = sc.nextDouble();
                total += valor* quant;
            }
            System.out.println("Valor a pagar R$ " + String.format("%.2f", total));
        }
    }
}
