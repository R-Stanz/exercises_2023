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
 
		String strNumberOfPages	= input.next();
		input.close();
		Long numberOfPages 	= Long.parseLong(strNumberOfPages);

		if(numberOfPages < 10){
			System.out.println(numberOfPages);
			return;
		}

		Integer lastPageNumberOfDigits 	= strNumberOfPages.length();
		Long totalNumberOfDigits	= 0L;
		Long multipleOf10		= 10L;

		for(Integer i = 1; i <= lastPageNumberOfDigits; i++){
			if(i == lastPageNumberOfDigits)
				totalNumberOfDigits += i*numberOfPages;
			else
				totalNumberOfDigits += i*(multipleOf10 - 1);

			if((multipleOf10/10) != 0)
				totalNumberOfDigits -= i*((multipleOf10/10) - 1);

			multipleOf10 *= 10;
			}

		System.out.println(totalNumberOfDigits);
	}
}
