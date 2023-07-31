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

		while(true){
			Integer numberOfRegions	= input.nextInt();
			if(numberOfRegions == 0)
				break;

			Integer stepSize 		= 0;
			Integer regionsSample		= 3;

			while(regionsSample >= 2){

				stepSize			+= 1;
				Integer lastRegion		= 12;
				Integer lastDroppedRegion 	= 1;

				for(regionsSample = numberOfRegions - 1; regionsSample >= 1; regionsSample--){

					Integer droppedRegion = (lastDroppedRegion + stepSize - 1) % regionsSample;

					if(lastRegion == droppedRegion)
						break;
					if(lastRegion > droppedRegion)
						lastRegion -= 1;

					lastDroppedRegion = droppedRegion;
				}
			}
			System.out.println(stepSize);
		}
		input.close();
	}
}
