import java.util.Random;
import java.util.Scanner;

public class lucky7 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Random rand  = new Random();

        boolean gaming = true;
        int round = 0;

        System.out.print("Total bet money: ");
        int raha = in.nextInt();

        while(gaming == true){
            
            if(raha == 0){
                System.out.println("No more money");
                break;
            }

            if(round > 0){
                System.out.println("Do you want to play again(y/n)");

                String kysymys = in.nextLine();
                if (kysymys.equals("e")){
                    break;
                }

            }

            raha = raha - 1;

            for(int i = 0 ; i <= 2 ; i++){
            int rand1 = rand.nextInt(10);
            
            if(rand1 == 7){
                System.out.println("You Won");
                raha = raha + 2;
            } else{
                System.out.println(rand1);
            }

            }
            System.out.println("Money: " + raha);
            round = round + 1;

    
        }
    }
    
}
