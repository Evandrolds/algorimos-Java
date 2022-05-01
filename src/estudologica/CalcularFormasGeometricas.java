package estudologica;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Evandro
 */
/*
Fazer um programa que leia três valores com ponto flutuante de dupla precisão:
A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
Exemplos:
Entrada:                           Saída:
3.0 4.0 5.2 
                                TRIANGULO: 7.800
                                CIRCULO: 84.949
                                TRAPEZIO: 18.200
                                QUADRADO: 16.000
                                RETANGULO: 12.000

Entrada:                            Saída:
12.7 10.4 15.2 
                                TRIANGULO: 96.520
                                CIRCULO: 725.833
                                TRAPEZIO: 175.560
                                QUADRADO: 108.160
                                RETANGULO: 132.080
 */
public class CalcularFormasGeometricas {

    public static void main(String[] args) {

        Locale.setDefault(Locale.Category.DISPLAY, Locale.CANADA);

        try (Scanner sc = new Scanner(System.in)) {

            Double a, b, c;
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();
            Double triangulo = a * c / 2.0;
            Double circulo = 3.14159 * c * c;
            Double trapesio = (a + b) / 2.0 * c;
            Double quadrado = b * b;
            Double retangulo = a * b;

            System.out.println("TRIANGULO: " + triangulo);
            System.out.println("CIRSULO: " + circulo);
            System.out.println("TRAPESIO: " + trapesio);
            System.out.println("QUADRADO: " + quadrado);
            System.out.println("RETANGULO: " + retangulo);

        }
    }
}
