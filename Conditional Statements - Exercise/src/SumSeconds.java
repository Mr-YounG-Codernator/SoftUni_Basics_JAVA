import java.util.Scanner;

public class SumSeconds {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int timeFirst = Integer.parseInt(scanner.nextLine());
        int timeSecond = Integer.parseInt(scanner.nextLine());
        int timeThird = Integer.parseInt(scanner.nextLine());

        int totalTime = timeFirst + timeSecond + timeThird;

        int minuteTime = totalTime/60;
        int secondTime = totalTime%60;

        if(secondTime < 10){
            System.out.printf("%d:0%d",minuteTime,secondTime);
        }
        else{
            System.out.printf("%d:%d",minuteTime,secondTime);
        }
    }
}
