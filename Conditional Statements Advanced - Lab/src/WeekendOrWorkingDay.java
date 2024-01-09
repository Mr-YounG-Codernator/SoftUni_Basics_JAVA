import java.util.Scanner;

public class WeekendOrWorkingDay {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String enteredDay = scanner.nextLine();


        //Кратка и нова версия на switsh-case
        switch (enteredDay){
            case "Monday","Tuesday","Wednesday","Thursday","Friday":
                System.out.println("Working day");
                break;
            case "Saturday","Sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Error");
                break;
        }
        /*
        switch (enteredDay){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Working day");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Error");
                break;
        }
        */


        /* if else конструкция
        if (enteredDay.equals("Monday") || enteredDay.equals("Tuesday") || enteredDay.equals("Wednesday") || enteredDay.equals("Thursday") || enteredDay.equals("Friday")) {
            System.out.println("Working day");
        } else if (enteredDay.equals("Saturday") || enteredDay.equals("Sunday")) {
            System.out.println("Weekend");
        } else {
            System.out.println("Error");
        }
        */

    }
}                              
