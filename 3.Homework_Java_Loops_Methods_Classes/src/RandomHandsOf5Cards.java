import java.util.Random;
import java.util.Scanner;

public class RandomHandsOf5Cards {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        String[] cards = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
        String[] suit = { "\u2666", "\u2663", "\u2665", "\u2660" };
       
        Random random = new Random();
       
        int randomNum = 0;
       
        for (int k = 0; k < n; k++) {  
                for (int i = 0; i < 5; i++) {
                        randomNum = random.nextInt((12 - 0) + 1) + 0;
                        System.out.print(cards[randomNum]);
                        randomNum = random.nextInt((3 - 0) + 1) + 0;
                        System.out.print(suit[randomNum]+" ");         
                }
                System.out.println();
        }
   }
}
