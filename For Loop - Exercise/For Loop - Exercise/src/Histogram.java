import java.util.Scanner;

public class Histogram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int numCountP1 = 0;
        int numCountP2 = 0;
        int numCountP3 = 0;
        int numCountP4= 0;
        int numCountP5 = 0;
        double percentage = 100.0/(n);

        for(int i = 1; i <= n; i++){

            int n1 = Integer.parseInt(scanner.nextLine());

            if(n1 >= 1 && n1 < 200){

                numCountP1++;

            } else if (n1 >= 200 && n1 <= 399) {

                numCountP2++;

            } else if (n1 >= 400 && n1 <= 599) {

                numCountP3++;

            } else if (n1 >= 600 && n1 <= 799) {

                numCountP4++;

            } else if (n1 >= 800) {

                numCountP5++;

            }

        }

        double p1 = percentage * numCountP1;
        double p2 = percentage * numCountP2;
        double p3 = percentage * numCountP3;
        double p4 = percentage * numCountP4;
        double p5 = percentage * numCountP5;

        System.out.printf("%.2f%%%n",p1);
        System.out.printf("%.2f%%%n",p2);
        System.out.printf("%.2f%%%n",p3);
        System.out.printf("%.2f%%%n",p4);
        System.out.printf("%.2f%%%n",p5);

    }
}
