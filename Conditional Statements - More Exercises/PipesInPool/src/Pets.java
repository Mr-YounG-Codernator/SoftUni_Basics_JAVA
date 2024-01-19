import java.util.Scanner;

public class Pets {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int leftFood = Integer.parseInt(scanner.nextLine());
        double foodForDog = Double.parseDouble(scanner.nextLine());
        double foodForCat = Double.parseDouble(scanner.nextLine());
        double foodForTurtle = Double.parseDouble(scanner.nextLine());

        double turtleFood = (foodForTurtle / 1000.0) * days;
        double dogFood = foodForDog * days;
        double catFood = foodForCat * days;

        double totalFood = turtleFood + dogFood + catFood;

        double difference = Math.abs(leftFood - totalFood);

        if(leftFood >= totalFood){
            System.out.println(Math.round(Math.floor(difference)) + " kilos of food left.");
        }else if(leftFood < totalFood){
            System.out.println(Math.round(Math.ceil(difference)) + " more kilos of food are needed.");
        }

    }
}
