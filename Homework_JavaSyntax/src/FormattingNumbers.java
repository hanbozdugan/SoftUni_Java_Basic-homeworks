import java.util.Scanner;

public class FormattingNumbers {

    public static void main(String[] args) {
     System.out.print("a: ");
     Scanner scanner = new Scanner(System.in);
     int a = scanner.nextInt();
     System.out.print("b: ");
     double b = scanner.nextDouble();
     System.out.print("c: ");
     double c = scanner.nextDouble();
     scanner.close();
     String hexAString = Integer.toHexString(a).toUpperCase();
     String binAString = Integer.toBinaryString(a);
     System.out.println();
     System.out.printf("|%-10s|%010d|%10.2f|%-10.3f|", hexAString,
     Integer.parseInt(binAString), b, c);
    }

}

