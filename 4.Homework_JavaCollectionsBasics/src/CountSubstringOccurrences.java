import java.util.Scanner;
public class CountSubstringOccurrences {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String sentence = in.nextLine().toLowerCase();
		String word = in.nextLine().toLowerCase();
		int counter = 0;
        in.close();
		for (int i = 0; i <= sentence.length() - word.length(); i++) {
		        if (sentence.substring(0 + i, word.length() + i).contains(word)) {
		                counter++;
		        }
		}
		System.out.println(counter);
	}

}
