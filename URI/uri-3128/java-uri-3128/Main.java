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
 
		Integer firstAge 	= input.nextInt();
		Integer secondAge 	= input.nextInt();
		input.close();

		if((firstAge < 6) || (secondAge < 6))
			System.out.println("NO");

		else if((firstAge >= 18) || (secondAge >= 18) || 
			((firstAge >= 14) && (secondAge >= 14)))

			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
