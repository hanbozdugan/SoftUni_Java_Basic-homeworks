import java.util.Scanner;
public class Generate3LetterWords {
	public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     char[] letters = scan.next().toCharArray();
     scan.close();
     for (int i = 0; i < letters.length; i++) {
      for (int j = 0; j < letters.length; j++) {
       for (int m = 0; m < letters.length; m++) {
        System.out.printf("%c%c%c ", letters[i], letters[j], letters[m]);
        }
      }
    }
  }
}