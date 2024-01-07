import java.util.Scanner;

public class PasswordGuess {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String password= "s3cr3t!P@ssw0rd";
        String myGuess = scanner.nextLine();

        if(password.equals(myGuess)){
            System.out.println("Welcome");
        }
        else{
            System.out.println("Wrong password!");
        }
    }
}
