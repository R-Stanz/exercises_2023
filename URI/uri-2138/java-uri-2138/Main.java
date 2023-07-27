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

		Character[] digits = new Character[10];

		for(Integer i = 0; i < 10; i++)
			digits[i] = Character.forDigit(i, 10);
 
		Scanner input = new Scanner(System.in);

		while(input.hasNextLine()){
			String number = input.nextLine();

			if(number.equals(""))
				break;

			Integer[] digitsCount = new Integer[10];

			for(Integer i = 0; i < 10; i++)
				digitsCount[i] = 0;

			for(Character c : number.toCharArray()){
				for(Character digit : digits){
					if(digit.equals(c)){
						Integer index = Character.getNumericValue(c);
						digitsCount[index] += 1;
						break;
					}
				}
			}

			Integer biggestCount = digitsCount[0];
			Integer biggestCountDigit = 0;
			for(Integer digit = 0; digit < 10; digit++){
				Integer count = digitsCount[digit];

				if(biggestCount <= count){
					biggestCount = count;
					biggestCountDigit = digit;
				}
			}
			System.out.println(biggestCountDigit);
		}
		input.close();
	}
}
