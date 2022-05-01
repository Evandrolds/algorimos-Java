package estudologica;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Evandro
 */
public class ContarNumerosRepetidos {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            Map<Integer,Integer> numeros = new TreeMap<>();
            int n = Integer.parseInt(sc.next());
            
            for (int i = 0; i < n; i++){
               int num = Integer.parseInt(sc.next());
               if(numeros.containsKey(num)){
                   numeros.replace(num, numeros.get(num)+1);
               }else{
                   numeros.put(num, 1);
               }
                
            }
            for (Map.Entry<Integer, Integer> entry : numeros.entrySet()) {
                System.out.println( entry.getKey()+ "  aparece " + entry.getValue()+ " veze(s)!");
                
            }
        }
    }
}
