import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
	public static void main(String[] args) throws IOException {

		Scanner input = new Scanner(System.in);
		Integer numbOfTimes = input.nextInt();
		Integer minHits = input.nextInt();
		Integer choice	= 1;

		for(Integer person = 2; person <= numbOfTimes; person++){
			Integer NumbOfHits = input.nextInt();
			if(minHits > NumbOfHits){
			       minHits = NumbOfHits;
			       choice = person;
			}
		}
		System.out.println(choice);
	}
 
}
