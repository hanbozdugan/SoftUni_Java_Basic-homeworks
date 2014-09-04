import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class DaysBetweenTwoDates {

	public static void main(String[] args) throws ParseException {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter an starting date in format dd-MM-yyyy: ");
		String inputStart= reader.nextLine();
		System.out.println("Enter an end date in format dd-MM-yyyy: ");
		String inputEnd = reader.nextLine();
        reader.close();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date1 = simpleDateFormat.parse(inputStart);
        Date date2 = simpleDateFormat.parse(inputEnd);
       
        System.out.println((int)computeDaysBetweenDates(date1, date2));

}

public static double computeDaysBetweenDates(Date d1, Date d2) {
    long diff;
    diff = d2.getTime() - d1.getTime();
    return ((double) diff) / (86400.0 * 1000.0);
	}

}
