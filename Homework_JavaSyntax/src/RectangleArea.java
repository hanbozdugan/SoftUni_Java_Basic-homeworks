import java.util.Scanner;
 
public class RectangleArea {
	public static void main(String[] args) {
 
		System.out.print("Input: ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();
		int area = a * b;
		System.out.println();
		System.out.println(area);
    }
}



