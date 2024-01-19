import java.util.Scanner;

public class SleepyTomCat {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int enteredRestDays = Integer.parseInt(scanner.nextLine());

        int workingDays = 365 - enteredRestDays;
        int realTimeForPlaying = (workingDays * 63) + (enteredRestDays * 127);
        int differenceOfNorm = Math.abs(30000 - realTimeForPlaying);
        int diffHours = differenceOfNorm / 60;
        int diffMinutes = differenceOfNorm % 60;

        if(realTimeForPlaying >= 30000){
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play",diffHours,diffMinutes);
        }else if (realTimeForPlaying < 30000) {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play",diffHours,diffMinutes);
        }

    }
}
