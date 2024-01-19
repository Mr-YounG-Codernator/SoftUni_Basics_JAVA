import java.util.Scanner;

public class FuelTankPart2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String fuelType = scanner.nextLine();
        double fuelQuantity = Double.parseDouble(scanner.nextLine());
        String discountCard = scanner.nextLine();
        double priceBeforeDiscount = 0;
        double priceAfterFirstDiscount = 0;
        double priceAfterDiscount = 0;

        if(fuelType.equals("Gasoline")) {

            priceBeforeDiscount = fuelQuantity * 2.22;

            if (discountCard.equals("Yes")) {

                priceAfterFirstDiscount = priceBeforeDiscount - fuelQuantity * 0.18;

                if (fuelQuantity > 20 && fuelQuantity <= 25) {

                    priceAfterDiscount = priceAfterFirstDiscount * 0.92;

                } else if (fuelQuantity > 25) {

                    priceAfterDiscount = priceAfterFirstDiscount * 0.9;

                }else{

                    priceAfterDiscount = priceAfterFirstDiscount;

                }

            } else if (discountCard.equals("No")) {

                if (fuelQuantity > 20 && fuelQuantity <= 25) {

                    priceAfterDiscount = priceBeforeDiscount * 0.92;

                } else if (fuelQuantity > 25) {

                    priceAfterDiscount = priceBeforeDiscount * 0.9;

                }else {

                    priceAfterDiscount = priceBeforeDiscount;

                }

            }

        } else if (fuelType.equals("Diesel")) {

            priceBeforeDiscount = fuelQuantity * 2.33;

            if (discountCard.equals("Yes")) {

                priceAfterFirstDiscount = priceBeforeDiscount - fuelQuantity * 0.12;

                if (fuelQuantity > 20 && fuelQuantity <= 25) {

                    priceAfterDiscount = priceAfterFirstDiscount * 0.92;

                } else if (fuelQuantity > 25) {

                    priceAfterDiscount = priceAfterFirstDiscount * 0.9;

                }else {

                    priceAfterDiscount = priceAfterFirstDiscount;

                }
            } else if (discountCard.equals("No")) {

                if (fuelQuantity > 20 && fuelQuantity <= 25) {

                    priceAfterDiscount = priceBeforeDiscount * 0.92;

                } else if (fuelQuantity > 25) {

                    priceAfterDiscount = priceBeforeDiscount * 0.9;

                }else {

                    priceAfterDiscount = priceBeforeDiscount;

                }

            }
        } else if (fuelType.equals("Gas")) {

            priceBeforeDiscount = fuelQuantity * 0.93;

            if (discountCard.equals("Yes")) {

                priceAfterFirstDiscount = priceBeforeDiscount - fuelQuantity * 0.08;

                if (fuelQuantity > 20 && fuelQuantity <= 25) {

                    priceAfterDiscount = priceAfterFirstDiscount * 0.92;

                } else if (fuelQuantity > 25) {

                    priceAfterDiscount = priceAfterFirstDiscount * 0.9;

                }else {

                    priceAfterDiscount = priceAfterFirstDiscount;

                }

            } else if (discountCard.equals("No")) {

                if (fuelQuantity > 20 && fuelQuantity <= 25) {

                    priceAfterDiscount = priceBeforeDiscount * 0.92;

                } else if (fuelQuantity > 25) {

                    priceAfterDiscount = priceBeforeDiscount * 0.9;

                }else {

                    priceAfterDiscount = priceBeforeDiscount;

                }

            }


        }

        System.out.printf("%.2f lv.", priceAfterDiscount);

    }
}
