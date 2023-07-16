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
 
	    Scanner input 	= new Scanner(System.in);
	    Integer iterations 	= input.nextInt();
	    for(Integer i = 0; i < iterations; i++){
		    String hero 	= input.next().toLowerCase();
		    String force 	= input.next();
		    if(hero.equals("thor"))	System.out.println("Y");
		    else			System.out.println("N");
	    }
	    input.close();
 
    }
 
}
