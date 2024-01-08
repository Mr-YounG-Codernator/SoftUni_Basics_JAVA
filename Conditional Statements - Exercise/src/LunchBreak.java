import java.util.Scanner;

public class LunchBreak {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String serialName = scanner.nextLine();
        int durationOfEpisode = Integer.parseInt(scanner.nextLine());
        int durationOfBreak = Integer.parseInt(scanner.nextLine());

        double durationLunch = durationOfBreak/8.0;
        double durationRest = durationOfBreak/4.0;

        double timeLeftForSerial = durationOfBreak-(durationLunch+durationRest);
        double leftTime = Math.ceil(Math.abs(timeLeftForSerial-durationOfEpisode));

        if(timeLeftForSerial>=durationOfEpisode){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",serialName,leftTime);
        }
        else{
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",serialName,leftTime);
        }
    }
}
