import java.util.Random;
import java.util.Scanner;

public class lucky7 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Random rand  = new Random();

        boolean gaming = true;

        int raha = 5;
        


        while(gaming == true){
            System.out.println("Money: " + raha + "€");

            raha = raha - 1;

            for(int i = 0 ; i <= 2 ; i++){
            int rand1 = rand.nextInt(10);
            
            if(rand1 == 7){
                System.out.println("You Won");
                raha = raha + 2;
            }
            else{
                System.out.println(rand1);

            }
            }
            System.out.println("End money:" + raha + "€");
        break;
        }
    }
    
}
