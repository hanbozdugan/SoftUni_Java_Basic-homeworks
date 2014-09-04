import java.util.Scanner;

public class CountOfBitsOne {

    public static void main(String[] args) {
System.out.print("n: ");
Scanner scanner = new Scanner(System.in);
int n = scanner.nextInt();
scanner.close();
int count = Integer.bitCount(n);
System.out.println();
System.out.printf("count: %d", count);
    }

}
