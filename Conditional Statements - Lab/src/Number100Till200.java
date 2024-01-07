import java.util.Scanner;

public class Number100Till200 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int enteredNum = Integer.parseInt(scanner.nextLine());

        if(enteredNum<100){
            System.out.println("Less than 100");
        }
        else if(enteredNum >= 100 && enteredNum<=200){
            System.out.println("Between 100 and 200");
        }
        else{
            System.out.println("Greater than 200");
        }
    }
}
