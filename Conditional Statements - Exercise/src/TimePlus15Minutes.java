import java.util.Scanner;

 class TimePlus15Minutes {

    public static void main(String[] args) {

        // МОЕ РЕШЕНИЕ

        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalMinutes = hours * 60 + minutes + 15;
        int totalHours = totalMinutes / 60;
        int restMinutes = totalMinutes % 60;

        if(restMinutes < 10){
            System.out.printf("%d:0%d",totalHours,restMinutes);
        }else if(totalHours>=24){
            System.out.printf("0%d:%d",totalHours%24,restMinutes);
        }
        else{
            System.out.printf("%d:%d",totalHours,restMinutes);
        }

        /* РЕШЕНИЕТО НА ЛЕКТОРА
                Scanner scanner = new Scanner(System.in);

                int hour = Integer.parseInt(scanner.nextLine());
                int min = Integer.parseInt(scanner.nextLine());

                min = min + 15;

                if (min >= 60) {
                    min = min - 60;
                    hour = hour + 1;
                }

                if (hour >= 24) {
                    hour = hour - 24;
                }

                System.out.printf("%d:%02d", hour, min);
          */
    }
}
