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
 
        Scanner input       = new Scanner(System.in);
            String caw          = "c";
            Character c         = caw.charAt(0);

            for(Integer scream  = 0; scream < 3; scream++){

                    Integer sum = 0;
                    String line = input.nextLine();

                    while(!c.equals(line.charAt(0))){
                            sum += getVal(line);
                            line = input.nextLine();
                    }
                    System.out.println(sum);
            }
            input.close();
    }

    private static Integer getVal(String line){

            Integer sum                 = 0;
            String eyeBlink             = "*";
            Character charEyeBlink      = eyeBlink.charAt(0);

            for(Integer i = 0; i < 3; i++){         
                    if(charEyeBlink.equals(line.charAt(i))) 
                            sum += 1 << 2-i;
            }
            return sum;
    }
 
}

