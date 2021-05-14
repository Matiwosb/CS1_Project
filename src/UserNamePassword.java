import java.util.Scanner;

public class UserNamePassword {
    public static void main(String[] args){
        Scanner scrn = new Scanner(System.in);
        String username;
        String password;

        System.out.print("Please enter your username: ");
        username = scrn.nextLine();
        System.out.print("Please enter your password: ");
        password = scrn.nextLine();

        while (!(username.equals("johndoe") )|| (!(password.equals("secret1234")))){
            System.out.println("Sorry, your username or password is incorrect. Please try again.");
            System.out.print("Please enter your username: ");
            username = scrn.nextLine();
            System.out.print("Please enter your password: ");
            password = scrn.nextLine();
        }
        System.out.println("You entered the system successfully.");
    }
}
