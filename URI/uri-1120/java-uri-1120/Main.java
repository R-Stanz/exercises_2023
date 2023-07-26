import java.io.IOException;
import java.util.Scanner;
import java.math.BigInteger;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
	public static void main(String[] args) throws IOException {
 

		String brokenDigit 	= "1";
		String number 	= "0";

		Scanner input = new Scanner(System.in);

		while((!brokenDigit.equals("0")) || (!number.equals("0"))){

			brokenDigit = input.next();
			number 	= input.next();

			String tmpNumber = number.replaceAll(brokenDigit, "");

			BigInteger intNumber;
			if(tmpNumber.equals(""))	intNumber = new BigInteger("0");
			else 				intNumber = new BigInteger(tmpNumber);

			if((!brokenDigit.equals("0")) && (!number.equals("0")))
				System.out.println(intNumber);
			}
		input.close();
	}
}
