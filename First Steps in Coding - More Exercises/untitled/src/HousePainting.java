import java.util.Scanner;

public class HousePainting {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double squareWalls = ((x * x) * 2) - (1.20 * 2.00);
        double rectangleWalls = (2 * (x * y)) - 2*(1.5 * 1.5);

        double totalGreenPaintNeeded = (squareWalls + rectangleWalls) / 3.4;

        double rectangleRoofs = 2 * (x * y);
        double triangleRoof = 2 *((x * h) / 2);

        double totalRedPaintNeeded = (rectangleRoofs + triangleRoof) / 4.3;

        System.out.printf("%.2f\n",totalGreenPaintNeeded);
        System.out.printf("%.2f",totalRedPaintNeeded);

    }
}
