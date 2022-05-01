package estudos2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Evandro
 */

/*
Um professor tem 80 alunos e deseja saber quais foram aprovados 
e quais foram reprovados, gerando um relatório.
Algoritmo Alunos
 */
public class AprovaAluno {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {

            double notas;
            String nome;
            int n = sc.nextInt();
            
            String reprovados[] = new String[n];
                   String aprovados[] = new String[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Digite o " + i + "º Nome: ");
                nome = sc.next();
                System.out.println("Digite a nota: ");
                notas = sc.nextDouble();

                if (notas >= 6.0) {
                   
                    aprovados[i] = nome;

                System.out.println(" O Aluno " + reprovados[i] + " foi reprovado!\n");
                } else {
                    
                    reprovados[i] = nome;

                System.out.println(" O Aluno " + aprovados[i] + " foi aprovado!\n");
                }

            }
          
        }
    }
}
