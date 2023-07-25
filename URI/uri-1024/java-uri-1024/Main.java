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

		for(Integer i = 0; i < iterations; i++){

			String shifted = "";

			String phrase 		= input.nextLine();
			Boolean firstHalf 	= true;

			for(Integer j = 0; j < phrase.length(); j++){

				if(j > (phrase.length() - 1)/2)
				       firstHalf = false;	

				Character c 	= phrase.charAt(j);
				Integer cVal	= (int) c;
				
				if(firstHalf){
					if(Character.isLetter(c))
						cVal += 2;
					else{
						if(cVal == 0)
							cVal = 254;
						else
							cVal = cVal - 1;
					}
				}
				else if(Character.isLetter(c))
					cVal += 3;

				shifted += (char) (int) cVal;
			}

			String inverted = "";

			for(int j = shifted.length() - 1; j >= 0; j--)
				inverted += shifted.charAt(j);

			System.out.println(inverted);
		}
		input.close();
	}
}
