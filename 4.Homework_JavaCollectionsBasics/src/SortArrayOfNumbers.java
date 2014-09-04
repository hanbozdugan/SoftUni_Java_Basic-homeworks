import java.util.Arrays;
import java.util.Scanner;
public class SortArrayOfNumbers {

	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);	
    int n=in.nextInt();
    
	int[] arrayInt = new int[n];
	for (int i = 0; i < n; i++) {
     arrayInt[i] = in.nextInt();
     }
    Arrays.sort(arrayInt);
    for (int numbers : arrayInt) {
     System.out.print(numbers + " ");
     in.close();
     }

   }

}
