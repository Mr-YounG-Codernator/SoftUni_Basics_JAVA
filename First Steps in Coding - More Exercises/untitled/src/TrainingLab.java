import java.util.Scanner;

public class TrainingLab {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        int corridor = 100;

        double widthCM = (h * 100) - corridor;
        double restSpaceH = widthCM % 70;
        double deskSpace = (widthCM-restSpaceH) / 70;

        double lengthCM = w * 100;
        double restSpaceW = lengthCM % 120;
        double columnRestSpace = lengthCM - restSpaceW;
        double columnNumbers = columnRestSpace/120;

        double workSpaceNumbers = (deskSpace * columnNumbers) - 3.00;

        System.out.printf("%.0f",workSpaceNumbers);

    }
}