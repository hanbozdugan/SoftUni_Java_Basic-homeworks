
import java.util.Scanner;
public class CombineListsOfLetters {

	public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);
        String listOfLetts1 = sc.nextLine();
        String listOfLetts2 = sc.nextLine();
        StringBuilder listsCombined = new StringBuilder(listOfLetts1);
        String[] letters2 = listOfLetts2.split(" ");
        sc.close();
        for (int i = 0; i < letters2.length; i++) {
                if (listOfLetts1.contains(letters2[i])) {

                } else {
                        listsCombined.append(" " + letters2[i]);
                }
        }
        System.out.println(listsCombined);
	}

}