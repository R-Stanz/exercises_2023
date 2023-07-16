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
	    String msg 		= "LIFE IS NOT A PROBLEM TO BE SOLVED";
	    msg.toCharArray();

	    Integer iterations 	= input.nextInt();
	    for(Integer i = 0; i < iterations; i++){
		    System.out.print(msg.charAt(i));
	    }
	    System.out.println();
 
    }
 
}
