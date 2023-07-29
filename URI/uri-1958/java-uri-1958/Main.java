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
 
		String number = input.next();
		input.close();

		String 	scientificNotation = "";
		if(number.charAt(0) == '-')
			scientificNotation += "-";
		else
			scientificNotation += "+";

		Boolean hasFirstDigit 			= false;
		Boolean charsAfterThePoint 		= false;
		Integer distanceToZero 			= 0;
		Integer numberOfDigitsForNotation	= 0;

		for(Integer i = 0; i < number.length(); i++){
		Character c = number.charAt(i);

			if(c.equals('.'))
					charsAfterThePoint = true;

			else if(!c.equals('-')){
				if(hasFirstDigit){
					if(!charsAfterThePoint && distanceToZero >= 0)
						distanceToZero += 1;
					if(numberOfDigitsForNotation < 5 && !c.equals('.'))
						scientificNotation += c.toString();
				}
				else{
					if(!c.equals('0')){
						hasFirstDigit = true;
						scientificNotation += c.toString() + ".";
					}
					if(charsAfterThePoint)
						distanceToZero -= 1;	
				}

				if(numberOfDigitsForNotation < 5 && hasFirstDigit)
					numberOfDigitsForNotation += 1;

				if(charsAfterThePoint && (numberOfDigitsForNotation == 5)){

					if((i < number.length() - 1) && (i - 1 >= 0)){
						Integer nextDigitValue = (int) number.charAt(i+1);

						if(nextDigitValue >= 5 + 48){

							Integer notationLastCharIndex	= scientificNotation.length() - 1;
							Integer notationLastCharValue	= (int) scientificNotation.
												charAt(notationLastCharIndex);
												

							Character newValue		= (char) (notationLastCharValue + 1);
							scientificNotation = 
								scientificNotation.substring(0, notationLastCharIndex)
							       							+ newValue;
						}
					}
					break;
				}
			}
		}
	
		if(numberOfDigitsForNotation == 0){
			distanceToZero = 0;
			numberOfDigitsForNotation += 1;
			scientificNotation += "0.";
		}

		for(Integer i = numberOfDigitsForNotation; i < 5; i++)
			scientificNotation += "0";

		if(distanceToZero >= 0)
			scientificNotation += "E+";
		else{
			scientificNotation += "E-";
			distanceToZero *= -1;
		}
		if(distanceToZero < 10)
			scientificNotation += "0";

		scientificNotation += distanceToZero;

		System.out.println(scientificNotation);
	}
}
