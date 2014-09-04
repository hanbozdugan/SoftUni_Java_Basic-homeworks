import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.util.Scanner;

public class PointsInsideFigure {

    public static void main(String[] args) {
Rectangle2D firstRectangle = new Rectangle();
firstRectangle.setFrame(12.5, 6, 10, 2.5);
Rectangle2D secondRectangle = new Rectangle();
secondRectangle.setFrame(12.5, 8.5, 5, 5);
Rectangle2D thirdRectangle = new Rectangle();
thirdRectangle.setFrame(20, 8.5, 2.5, 5);
Scanner scanner = new Scanner(System.in);
double x = scanner.nextDouble();
double y = scanner.nextDouble();
scanner.close();
if (firstRectangle.contains(x, y) || secondRectangle.contains(x, y)
|| thirdRectangle.contains(x, y)) {
System.out.println("Inside");
} else {
System.out.println("Outside");
}
    }

}
