import java.util.Scanner;

public class FruitShop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0.00;


        switch (fruit) {
            case "banana":
                if (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Wednesday") || dayOfWeek.equals("Thursday") || dayOfWeek.equals("Friday")) {
                   price = quantity*2.50;
                    System.out.printf("%.2f",price);
                } else if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")) {
                    price = quantity*2.70;
                    System.out.printf("%.2f",price);
                } else {
                    System.out.println("error");
                }
                break;
            case "apple":
                if (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Wednesday") || dayOfWeek.equals("Thursday") || dayOfWeek.equals("Friday")) {
                    price=quantity*1.20;
                    System.out.printf("%.2f",price);
                } else if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")) {
                    price=quantity*1.25;
                    System.out.printf("%.2f",price);
                } else {
                    System.out.println("error");
                }
                break;
            case "orange":
                if (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Wednesday") || dayOfWeek.equals("Thursday") || dayOfWeek.equals("Friday")) {
                    price=quantity*0.85;
                    System.out.printf("%.2f",price);
                } else if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")) {
                    price=quantity*0.90;
                    System.out.printf("%.2f",price);
                } else {
                    System.out.println("error");
                }
                break;
            case "grapefruit":
                if (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Wednesday") || dayOfWeek.equals("Thursday") || dayOfWeek.equals("Friday")) {
                    price=quantity*1.45;
                    System.out.printf("%.2f",price);
                } else if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")) {
                    price=quantity*1.60;
                    System.out.printf("%.2f",price);
                } else {
                    System.out.println("error");
                }
                break;
            case "kiwi":
                if (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Wednesday") || dayOfWeek.equals("Thursday") || dayOfWeek.equals("Friday")) {
                    price=quantity*2.70;
                    System.out.printf("%.2f",price);
                } else if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")) {
                    price=quantity*3.00;
                    System.out.printf("%.2f",price);
                } else {
                    System.out.println("error");
                }
                break;
            case "pineapple":
                if (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Wednesday") || dayOfWeek.equals("Thursday") || dayOfWeek.equals("Friday")) {
                    price=quantity*5.50;
                    System.out.printf("%.2f",price);
                } else if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")) {
                    price=quantity*5.60;
                    System.out.printf("%.2f",price);
                }else {
                    price=quantity*5.60;
                    System.out.println("error");
                }
                break;
            case "grapes":
                if (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Wednesday") || dayOfWeek.equals("Thursday") || dayOfWeek.equals("Friday")) {
                    price=quantity*3.85;
                    System.out.printf("%.2f",price);
                } else if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")) {
                    price=quantity*4.20;
                    System.out.printf("%.2f",price);
                }else {
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
                break;
        }
    }
}








/*
if(dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")){
            switch (fruit){
                case "banana":
                    price = 2.70;
                case "apple":
                    price = 1.25;
                case "orange":
                    price = 0.90;
                case "grapefruit":
                    price = 1.60;
                case "kiwi":
                    price = 3.00;
                case "pineapple":
                    price = 5.60;
                case "grapes":
                    price = 4.20;
                    double sum = price * quantity;
                    System.out.printf("%.2f", sum);
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        } else if (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Wednesday") ||dayOfWeek.equals("Thursday") || dayOfWeek.equals("Friday")) {
            switch (fruit){
                case "banana":
                    price = 2.50;
                case "apple":
                    price = 1.20;
                case "orange":
                    price = 0.85;
                case "grapefruit":
                    price = 1.45;
                case "kiwi":
                    price = 2.70;
                case "pineapple":
                    price = 5.50;
                case "grapes":
                    price = 3.85;
                    double sum = price * quantity;
                    System.out.printf("%.2f", sum);
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        }
 */