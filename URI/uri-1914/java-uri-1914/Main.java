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
	    for(Integer i = 0; i < iterations; i++){

		    String p1 		= input.next();
		    String p1Choice 	= input.next().toLowerCase();
		    String p2		= input.next();
		    String p2Choice 	= input.next().toLowerCase();
		    Integer p1Number	= input.nextInt();
		    Integer p2Number	= input.nextInt();

		    if((p1Number + p2Number) % 2 == 0){
			    if(p1Choice.equals("par"))
				    System.out.println(p1);
			    else
				    System.out.println(p2);
		    }
		    else{
			    if(p1Choice.equals("impar"))
				    System.out.println(p1);
			    else
				    System.out.println(p2);
		    }
	    }
 
    }
 
}
