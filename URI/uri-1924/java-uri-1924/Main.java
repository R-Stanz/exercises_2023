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

	    Integer iterations = input.nextInt();
	    input.nextLine();

	    for(Integer i = 0; i < iterations; i++)
		    input.nextLine();

	    input.close();
	    System.out.println("Ciencia da Computacao");
    }
 
}
