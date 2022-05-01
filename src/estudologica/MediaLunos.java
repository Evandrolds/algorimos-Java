
package primeiro;

import java.util.Scanner;

/**
 *
 * @author Evandro
 */
public class MediaLunos {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            
            String[] alunos = new String[]{"Maria","Joao","Pedro","Sandro"};
           double media = calcularMediaAlunos(alunos, sc);
            System.out.printf("Media da turma foi: " + media);
        }
    }
    public static double calcularMediaAlunos(String[] alunos, Scanner sc){
        double soma = 0;
        for (String aluno : alunos) {
            System.out.printf("Nota do aluno: %s ",  aluno);
            double nota = sc.nextDouble();
            soma += nota;
        }
        return soma/alunos.length;
    }
}
