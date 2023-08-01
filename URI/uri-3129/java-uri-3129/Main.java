import java.io.IOException;
import java.util.Scanner;
import java.util.HashSet;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
	public static void main(String[] args) throws IOException {
 
		Scanner input = new Scanner(System.in);

		Integer numberOfCards = input.nextInt();
 
		HashSet<Integer> uniqueCards = new HashSet<Integer>();

		Integer repeatedCards = 0;

		for(Integer i = 0; i < numberOfCards; i++){
			Integer newCard = input.nextInt();
			
			Boolean isUnique = uniqueCards.add(newCard);
			if(!isUnique)
				repeatedCards += 1;
		}
		input.close();
		System.out.println(uniqueCards.size());
		System.out.println(repeatedCards);
	}
}
