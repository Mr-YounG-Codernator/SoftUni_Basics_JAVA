import java.util.Scanner;

public class ProjectsCreation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String architectName = scanner.nextLine();
        int projectNumbers = Integer.parseInt(scanner.nextLine());
        int totalHours = projectNumbers*3;

        System.out.println("The architect " + architectName + " will need " + totalHours + " hours to complete " + projectNumbers + " project/s.");


    }
}
