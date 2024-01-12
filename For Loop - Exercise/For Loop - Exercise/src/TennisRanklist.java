import java.util.Scanner;

public class TennisRanklist {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int tournamentNumber = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());
        int pointsCounter = 0;
        int winCounter = 0;


        for(int i = 1; i <= tournamentNumber ; i++){

            String reachedTournamentPosition = scanner.nextLine();

            if(reachedTournamentPosition.equals("W")){
                winCounter++;
                pointsCounter += 2000;

            } else if (reachedTournamentPosition.equals("F")) {

                pointsCounter += 1200;

            } else if (reachedTournamentPosition.equals("SF")) {

                pointsCounter += 720;

            }

        }

        int totalPoints = pointsCounter + startingPoints;

        double averagePoints = Math.abs(Math.floor(pointsCounter/(tournamentNumber*1.00)));
        double averageWinPercentage = (100.0/tournamentNumber) * winCounter;

        System.out.printf("Final points: %d%n",totalPoints);
        System.out.printf("Average points: %.0f%n",averagePoints);
        System.out.printf("%.2f%%%n",averageWinPercentage);

    }
}
