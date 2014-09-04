import java.util.Scanner;

public class DecimalToHexadecimal {

    public static void main(String[] args) {
System.out.print("input: ");
Scanner scanner = new Scanner(System.in);
int decNumber = scanner.nextInt();
scanner.close();
String hexNumberString = Integer.toHexString(decNumber);
System.out.println();
System.out.println(hexNumberString.toUpperCase());

    }

}
