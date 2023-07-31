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

		Integer jumpHeight 	= input.nextInt();
		Integer numberOfPipes 	= input.nextInt();

		Integer lastPipeHeight = 0;
		Boolean win = true;

		for(Integer i = 0; i < numberOfPipes; i++){
			Integer nextPipeHeight = input.nextInt();
			if(i == 0)
				lastPipeHeight = nextPipeHeight;

			if((nextPipeHeight - lastPipeHeight > jumpHeight) ||
			   (lastPipeHeight - nextPipeHeight > jumpHeight))

				win = false;

			lastPipeHeight = nextPipeHeight;
		}
		input.close();
		if(win)
			System.out.println("YOU WIN");
		else
			System.out.println("GAME OVER");
	}
}
