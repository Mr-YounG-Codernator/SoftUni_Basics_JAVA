import java.util.Scanner;

public class SpeedInfo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double enteredSpeed = Double.parseDouble(scanner.nextLine());

        if(enteredSpeed <= 10){
            System.out.println("slow");
        }
        else if(enteredSpeed > 10 && enteredSpeed <= 50){
            System.out.println("average");
        }
        else if(enteredSpeed > 50 && enteredSpeed <= 150){
            System.out.println("fast");
        }
        else if(enteredSpeed > 150 && enteredSpeed <= 1000){
            System.out.println("ultra fast");
        }
        else {
            System.out.println("extremely fast");
        }
    }
}
