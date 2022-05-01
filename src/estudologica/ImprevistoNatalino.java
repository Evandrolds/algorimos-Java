package primeiro;

import java.util.Scanner;

/**
 *
 * @author Evandro
 */
public class ImprevistoNatalino {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numAlunos = leitor.nextInt();
        int numPc = leitor.nextInt();
        int qtsPcsQuebrados = leitor.nextInt();
        int qtsPcsSemComp = leitor.nextInt();
        numPc -= 1;
      
        
        int metade = qtsPcsSemComp/2;
        
        if( numPc < numAlunos){
            System.out.println("Igor bolado!");
        if( numPc < numAlunos && qtsPcsQuebrados > metade){
            System.out.println("Caio, a culpa eh sua!");
        }
        }else{
            System.out.println("Igor feliz");
        }
        
    }
}
