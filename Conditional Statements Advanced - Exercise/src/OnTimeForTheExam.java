import java.util.Scanner;

public class OnTimeForTheExam {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int examHours = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arrivingHours = Integer.parseInt(scanner.nextLine());
        int arrivingMinutes = Integer.parseInt(scanner.nextLine());

        int totalExamMinutes = (examHours * 60) + examMinutes;
        int totalArrivingMinutes = (arrivingHours * 60) + arrivingMinutes;
        int timeGap = Math.abs(totalExamMinutes-totalArrivingMinutes);

        if(totalExamMinutes < totalArrivingMinutes){
            System.out.println("Late");
        } else if (totalExamMinutes-totalArrivingMinutes <=30) {
            System.out.println("On time");
        } else if (totalExamMinutes-totalArrivingMinutes > 30) {
            System.out.println("Early");
        }

        int gapExamHour = timeGap/60;
        int gapExamMinute = timeGap % 60;

        if(totalExamMinutes > totalArrivingMinutes){
            if(timeGap < 60){
                System.out.printf("%d minutes before the start",timeGap);
            }else if(timeGap >= 60){
                if(gapExamMinute == 0){
                    System.out.printf("%d:0%d hours before the start",gapExamHour,gapExamMinute);
                }else if (gapExamMinute < 10){
                    System.out.printf("%d:0%d hours before the start",gapExamHour,gapExamMinute);
                }else if(timeGap >= 10){
                    System.out.printf("%d:%d hours before the start",gapExamHour,gapExamMinute);
                }
            }
        }else if(totalExamMinutes < totalArrivingMinutes){
            if(timeGap < 60){
                System.out.printf("%d minutes after the start",timeGap);
            }else if(timeGap >= 60){
                if(gapExamMinute < 10){
                    System.out.printf("%d:0%d hours after the start",gapExamHour,gapExamMinute);
                }else {
                    System.out.printf("%d:%d hours after the start",gapExamHour,gapExamMinute);
                }
            }
        }

    }
}

