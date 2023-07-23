import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
	public static void main(String[] args) throws IOException {
 
		Scanner input = new Scanner(System.in);

		Integer rounds = input.nextInt();

		for(Integer i = 0; i < rounds; i++){
			Integer numbOfPeople 	= input.nextInt();
			Integer sizeOfStep	= input.nextInt();

			ArrayList<String> circle = new ArrayList<String>();
			for(Integer j = 1; j < numbOfPeople + 1; j++)
				circle.add(j.toString());

			int lastDeath = 0;
			while(circle.size() > 1){

				int nextDeath = (sizeOfStep - 1 + lastDeath) % circle.size();
				circle.remove(nextDeath);
				lastDeath = nextDeath;
			}
			System.out.println("Case " + (i+1) + ": " + circle.remove(0));
		}
		input.close();
	}
}
