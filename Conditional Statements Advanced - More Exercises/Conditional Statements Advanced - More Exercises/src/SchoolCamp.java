import java.util.Scanner;

public class SchoolCamp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String groupType = scanner.nextLine();
        int studentsCount = Integer.parseInt(scanner.nextLine());
        int overnightStays = Integer.parseInt(scanner.nextLine());
        double price = 0.0;
        String sportType = "";

        if(season.equals("Winter")){

            if(groupType.equals("boys") || groupType.equals("girls")){

                price = studentsCount * 9.60;

                if(groupType.equals("boys")){

                    sportType = "Judo";

                } else if (groupType.equals("girls")) {

                    sportType = "Gymnastics";

                }

            } else if (groupType.equals("mixed")) {

                price = studentsCount * 10;

                sportType = "Ski";

            }

        } else if (season.equals("Spring")) {

            if(groupType.equals("boys") || groupType.equals("girls")){

                price = studentsCount * 7.20;

                if(groupType.equals("boys")){

                    sportType = "Tennis";

                } else if (groupType.equals("girls")) {

                    sportType = "Athletics";

                }

            } else if (groupType.equals("mixed")) {

                price = studentsCount * 9.50;

                sportType = "Cycling";

            }

        } else if (season.equals("Summer")) {

            if(groupType.equals("boys") || groupType.equals("girls")){

                price = studentsCount * 15;

                if(groupType.equals("boys")){

                    sportType = "Football";

                } else if (groupType.equals("girls")) {

                    sportType = "Volleyball";

                }

            } else if (groupType.equals("mixed")) {

                price = studentsCount * 20;

                sportType = "Swimming";

            }

        }

        if(studentsCount >= 50){

            price *= 0.5;

        } else if (studentsCount >= 20 && studentsCount < 50) {

            price *= 0.85;

        } else if (studentsCount >= 10 && studentsCount < 20) {

            price *= 0.95;

        }

        price = price * overnightStays;

        System.out.printf("%s %.2f lv.",sportType, price);

    }
}
