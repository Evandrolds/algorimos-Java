package estudos;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Evandro
 */

/*
Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio 2
Considere o valor de π = 3.14159
Exemplos:
Entrada:     2.00                          Saída:
                                          A=12.5664
Entrada:     100.64                        Saída:
                                          A=31819.3103
Entrada:     150.00                        Saída:
                                          A=70685.7750
 */
public class AreaDoCirculo {

    public static double pi = 3.14159;

    public static void main(String[] args) {
            Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {
            Double raio, area;
            System.out.println("Digite o vaio");
            raio = sc.nextDouble();
            area = Math.pow(raio, 2.0) * pi;
            System.out.println("Area do cirsulo: " + String.format("%.4f", area));
        }
    }
}
