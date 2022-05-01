package estudos;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Evandro
 */
/*
Fazer um algoritmo que leia 35 notas, armazene em um vetor e imprima a 
maior nota e a posição do vetor onde ela está armazenada
 */
public class MaiorNota_e_Posicao {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {
            double[] vet = new double[4];
            double nota = 0.0;
            int cont = 0;
            for (int i = 0; i < 4; i++) {
                double notas = sc.nextDouble();
                vet[i] = notas;
                for (int j = 0; j < vet.length; j++) {
                    if (nota < vet[j]) {
                        cont++;
                        nota = vet[j];
                        
                    }
                }
            }
            System.out.println("A maior nota foi " + nota + " na posicão " + cont);
        }
    }
}
