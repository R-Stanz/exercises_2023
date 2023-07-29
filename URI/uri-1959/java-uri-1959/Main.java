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
 
	    Long numberOfSides = input.nextLong();
	    Long lengthOfSides = input.nextLong();
	    input.close();

	    System.out.println(numberOfSides * lengthOfSides);
	}
}