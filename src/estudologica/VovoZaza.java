package estudologica;

import java.util.Scanner;

/**
 *
 * @author Evandro
 */
public class VovoZaza {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
    	double A = leitor.nextDouble();
    	double B = leitor.nextDouble();
    	double soma = ((B-A)*(100/A));
    	
    	
    	System.out.println(""+String.format("%.2f", soma) +"%");
    	//Escreva aqui a sua lógica
    
    }
}
