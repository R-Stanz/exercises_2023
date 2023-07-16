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

	    for(int i = 0; i < iterations; i++){
		    Integer hint = input.nextInt();
		    if(hint % 2 != 0) 	System.out.println("1");
		    else		System.out.println("0");
	    }
 
    }
 
}
