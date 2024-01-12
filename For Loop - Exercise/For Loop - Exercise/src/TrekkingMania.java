import java.util.Scanner;

public class TrekkingMania {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int groupNumber = Integer.parseInt(scanner.nextLine());
        int totalpeopleCounter =0;

        int p1Counter = 0;
        int p2Counter = 0;
        int p3Counter = 0;
        int p4Counter = 0;
        int p5Counter = 0;

        double p1;
        double p2;
        double p3;
        double p4;
        double p5;


        for(int i =1; i <= groupNumber; i++){

            int peopleNumInGroups = Integer.parseInt(scanner.nextLine());
            totalpeopleCounter += peopleNumInGroups;

            if(peopleNumInGroups <= 5){

                p1Counter += peopleNumInGroups;

            } else if (peopleNumInGroups > 5 && peopleNumInGroups <= 12) {

                p2Counter += peopleNumInGroups;

            } else if (peopleNumInGroups > 12 && peopleNumInGroups <= 25) {

                p3Counter += peopleNumInGroups;

            }else if (peopleNumInGroups > 25 && peopleNumInGroups <= 40){

                p4Counter += peopleNumInGroups;

            } else if (peopleNumInGroups >= 41) {

                p5Counter += peopleNumInGroups;

            }

        }

        p1 = (p1Counter / (totalpeopleCounter*1.00)) * 100;
        p2 = (p2Counter / (totalpeopleCounter*1.00)) * 100;
        p3 = (p3Counter / (totalpeopleCounter*1.00)) * 100;
        p4 = (p4Counter / (totalpeopleCounter*1.00)) * 100;
        p5 = (p5Counter / (totalpeopleCounter*1.00)) * 100;

        System.out.printf("%.2f%%%n",p1);
        System.out.printf("%.2f%%%n",p2);
        System.out.printf("%.2f%%%n",p3);
        System.out.printf("%.2f%%%n",p4);
        System.out.printf("%.2f%%%n",p5);

    }
}
