import java.util.Scanner;

public class FuelTank {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String fuelType = scanner.nextLine();
        double littersInTank = Double.parseDouble(scanner.nextLine());



        if(fuelType.equals("Gasoline") || fuelType.equals("Gas") || fuelType.equals("Diesel")){

            if(littersInTank >= 25){


                System.out.printf("You have enough %s.",fuelType.toLowerCase());

            }else {

                System.out.printf("Fill your tank with %s!",fuelType.toLowerCase());

            }

        }else {

            System.out.println("Invalid fuel!");

        }

    }
}