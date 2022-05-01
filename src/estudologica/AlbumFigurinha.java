package primeiro;

import java.util.Scanner;

/**
 *
 * @author Evandro
 *
 * Álbum da copa Em ano de Copa do Mundo de Futebol, o álbum de figurinhas
 * oficial é sempre um grande sucesso entre crianças e também entre adultos.
 * Para quem não conhece, o álbum contém espaços numerados de 1 a N para colar
 * as figurinhas; cada figurinha,também numerada de 1 a N, é uma pequena foto de
 * um jogador de uma das seleções que jogará a Copa do Mundo. O objetivo é colar
 * todas as figurinhas nos respectivos espaços no álbum, de modo a completar o
 * álbum (ou seja, não deixar nenhum espaço sem a correspondente figurinha). As
 * figurinhas são vendidas em envelopes fechados, de forma que o comprador não
 * sabe quais figurinhas está comprando, e pode ocorrer de comprar uma figurinha
 * que ele já tenha colado no álbum. Para ajudar os usuários, a empresa
 * responsável pela venda do álbum e das figurinhas quer criar um aplicativo que
 * permita gerenciar facilmente as figurinhas que faltam para completar o álbum
 * e está solicitando a sua ajuda. Dados o número total de espaços e figurinhas
 * do álbum, e uma lista das figurinhas já compradas (que pode conter figurinhas
 * repetidas), sua tarefa é determinar quantas figurinhas faltam para completar
 * o álbum. Entrada A primeira linha contém um inteiro N indicando o número
 * total de figurinhas e espaços no álbum. A segunda linha contém um inteiro M
 * indicando o número de figurinhas já compradas. Cada uma das M linhas
 * seguintes contém um número inteiro X indicando uma figurinha já comprada.
 * Saída Seu programa deve produzir uma única linha contendo um inteiro, o
 * número de figurinhas que falta para completar o álbum. Restrições •	1 ≤ N ≤
 * 100 •	1 ≤ M ≤ 300 •	1 ≤ X ≤ N Exemplos Entrada Saída 10 3 7 5 7 8 3
 *
 */
public class AlbumFigurinha {

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        System.out.println("Digite o espaço no album..");
        System.out.println("Digite o numero de figurinhas..");
        int numeroFigurinhasCompradas = sc.nextInt();
        int[] AlbumFigurinha = new int[numeroFigurinhasCompradas];
        int fig = 0;
        int repetidas = 0;
        int countFig = 0;

        for (int i = 0; i < numeroFigurinhasCompradas; i++) {
            String in = sc.next();
            if (in != null) {
                AlbumFigurinha[i] = Integer.parseInt(in);
            }
        }
        for (int i = 0; i < numeroFigurinhasCompradas; i++) {
            
            fig = AlbumFigurinha[i];
           
            for (int j = 0; j < numeroFigurinhasCompradas; j++) {
                if (AlbumFigurinha[j] == fig) {
                    repetidas++;
                   
                }
            }
            if (repetidas >= 2) {
                for (int j = 0; j < numeroFigurinhasCompradas; j++) {
                    if (fig == AlbumFigurinha[j]) {
                        AlbumFigurinha[j] = -1;
                        break;

                    }
                }
            }

        }
        for (int i = 0; i < numeroFigurinhasCompradas; i++) {
            if (AlbumFigurinha[i] != -1) {
                countFig++;
            }
        }
        
        int total = numeroFigurinhasCompradas - countFig;
        System.out.println("Faltam " + total);
       
    }
   }
}
