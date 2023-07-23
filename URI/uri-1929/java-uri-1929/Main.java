import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
	public static void main(String[] args) throws IOException {
 
	    ArrayList<Integer> arr 	= new ArrayList<Integer>();
	    Scanner input 		= new Scanner(System.in);

	    for(Integer i = 0; i < 4; i++)
		    arr.add(input.nextInt());

	    input.close();

	    Collections.sort(arr);

	    for(Integer a_index = 0; a_index < (arr.size() - 2); a_index++){
		    for(Integer b_index = (a_index + 1); b_index < (arr.size() - 1); b_index++){
			    for(Integer c_index = (b_index + 1); c_index < arr.size(); c_index++){

				    if(check(arr.get(a_index), arr.get(b_index), arr.get(c_index))){
					    return;
				    }
			    }
		    }
	    }
	    System.out.println("N");
    }

	private static Boolean check(Integer a, Integer b, Integer c){

		if((a * a + b * b - 2 * a * b <= c * c)	&&
		(a * a + b * b + 2 * a * b > c * c))

			System.out.println("S");

		else return false;

		return true;
    }
}
