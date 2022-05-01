package estudos;

import java.util.Scanner;

/**
 *
 * @author Evandro
 */
/*
Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.
Exemplos:
Entrada:                            Saída:
25
100
5.50
                                    NUMBER = 25
                                    SALARY = U$ 550.00
Entrada:                            Saída:
1
200
20.50
                                    NUMBER = 1
                                    SALARY = U$ 4100.00
Entrada:                            Saída:
6
145
15.55
                                    NUMBER = 6
                                    SALARY = U$ 2254.75
 */
public class Calculo_de_Salario {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Digite p numero do funcionario...");
            int number = sc.nextInt();
            System.out.println("Horas trabalhadas? ");
            int horas = sc.nextInt();
            System.out.println("Valor que recebe por horas? ");
            double vHoras = sc.nextDouble();
            double total = vHoras * horas;
            System.out.println(" NUBER = U$ " + number);
            System.out.println(" SALARY = " + total);

        }
    }
}
