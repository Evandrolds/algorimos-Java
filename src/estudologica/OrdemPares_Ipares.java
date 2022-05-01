package estudologica;;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

/**
 *
 * @author Evandro
 */
/*
// Ordenando Números Pares e Ímpares

/* Crie um programa onde você receberá valores inteiros não negativos como
entrada.
Ordene estes valores de acordo com o seguinte critério:
- Primeiro os Pares
- Depois os Ímpares
- Você deve exibir os pares em ordem crescente e na sequência os ímpares em
ordem decrescente.
- Entrada
A primeira linha de entrada contém um único inteiro positivo N (1 < N < 10000)
Este é o número de linhas de entrada que vem logo a seguir. As próximas N
linhas terão, cada uma delas, um valor inteiro não negativo.
- Saída
Exiba todos os valores lidos na entrada segundo a ordem apresentada acima.
Cada número deve ser impresso em uma linha, conforme exemplo de saída abaixo.

ENTRADA                      SAÌDA
10                   
                                
4                              4
32                             32
34                             34
543                            98
3456                           654
654                            3456
567                            87
87                             543
6789                           567
98                             6789 
*/

public class OrdemPares_Ipares {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer str = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(str.nextToken());
            List<Integer> listNumber = new ArrayList<>();

            if (n > 0) {
                for (int i = 0; i < n; i++) {
                    str = new StringTokenizer(br.readLine());
                    listNumber.add(Integer.parseInt(str.nextToken()));
                    
                }
                var pares = listNumber.stream().filter(x -> x % 2 == 0).sorted().collect(Collectors.toList());
                var impares = listNumber.stream().filter(x -> x % 2 != 0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
                List<Integer> listar = new ArrayList<>();
                listar.addAll(pares);
                listar.addAll(impares);
                listar.forEach((System.out::println));
        }
    }

}
