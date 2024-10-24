import java.util.Random;
import java.util.Scanner;

public class lucky7 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Random rand  = new Random();

        boolean gaming = true;
        


        while(gaming == true){
            for(int i = 0 ; i <= 2 ; i++){
            int rand1 = rand.nextInt(10);
            
            if(rand1 == 7){
                System.out.println("You Won");
            }
            else{
                System.out.println(rand1);
            }
            
            }
        break;
        }
    }
    
}
