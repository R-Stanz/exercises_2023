// Not accepted, Time Limit Exceeded (3s)
// Time droped in 1/3 on the send version whith just using a single print.

import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class EncryptWithCasting {
 
	public static void main(String[] args) throws IOException {
 
		Scanner input = new Scanner(System.in);

		Integer iterations = input.nextInt();
		input.nextLine();

		for(Integer i = 0; i < iterations; i++){

			String answer = "";

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

				answer += (char) (int) cVal;
			}

			for(int j = answer.length() - 1; j >= 0; j--)
				System.out.print(answer.charAt(j));
			System.out.println();
		}
		input.close();
	}
}
