package estudologica;

import java.util.Scanner;

/**
 *
 * @author Evandro
 */
/*

Desafio

Você terá o desafio de ler um valor inteiro correspondente à idade de uma pessoa em dias
e informe-a em anos, meses e dias

Obs.: apenas para facilitar o cálculo,
considere todo ano com 365 dias e todo mês com 30 dias.
Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. 

Entrada
O arquivo de entrada contém um valor inteiro.

Saída
Imprima a saída conforme exemplo fornecido.
 
Exemplo de Entrada 	Exemplo de Saída

400
	

                            1 ano(s)
                            1 mes(es)
                            5 dia(s)

800
	

                            2 ano(s)
                            2 mes(es)
                            10 dia(s)

30
	

                            0 ano(s)
                            1 mes(es)
                            0 dia(s)
*/
public class ConverteDiasEmIdade {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
          
           int n = sc.nextInt();
           int quantAnos, quantMeses,quantDias;
           
            
           quantAnos = n/60;
           quantMeses = ((n%365)/30);
           quantDias = ((n%365)%30);
    
            System.out.println("Ano (s) "+ quantAnos ); 
            System.out.println("Mês (es) "+ quantMeses ); 
            System.out.println("Dia (s) "+ quantDias); 
       }
    }
}
