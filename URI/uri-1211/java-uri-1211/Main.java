import java.io.IOException;
import java.util.Scanner;
import java.util.HashMap;
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
 
		Scanner input 		= new Scanner(System.in);

		while(true){

			Integer iterations;
			try{
				iterations 	= input.nextInt();
			}
			catch(Exception e){
				break;
			}

			if((iterations < 1) || (iterations > 100000))
			       	break;

			HashMap<Double, String> mapNumb 	= new HashMap<Double, String>();

			Integer savedCounter = 0;

			for(Integer i = 0; i < iterations; i++) {
				String 	strNumb = input.next();
				Double 	intNumb = Double.parseDouble(strNumb);

				if(mapNumb.containsKey(intNumb))
					savedCounter += strNumb.length();
				else
					mapNumb.put(intNumb, strNumb);
			}	

			ArrayList<Double> sortedKeys 		= new ArrayList(mapNumb.keySet());
			Collections.sort(sortedKeys);

			Double nextIntNumb = sortedKeys.remove(0);
			Double intNumb; 

			while(!sortedKeys.isEmpty()){
				intNumb 		= nextIntNumb;
				nextIntNumb		= sortedKeys.remove(0);

				String strNumb 		= mapNumb.get(intNumb);
				String nextStrNumb 	= mapNumb.get(nextIntNumb);

				Integer j = 0;

				Character charNumb 	= strNumb.charAt(j);
				Character charNextNumb 	= nextStrNumb.charAt(j);

				while(charNumb.equals(charNextNumb)){
					savedCounter += 1;

					j += 1;
					if(j == strNumb.length()) break;

					charNumb 	= strNumb.charAt(j);
					charNextNumb 	= nextStrNumb.charAt(j);
				}
			}
			System.out.println(savedCounter);
		}
	}
}
