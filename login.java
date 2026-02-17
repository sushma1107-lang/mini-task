import java.util.Scanner;

public class login {
    static boolean checkUserInput(String username, String password) {
        String pw = "1234", name = "admin";

        if (username.equals(name) && password.equals(pw)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String username, password;

        System.out.println("Enter username: ");
        username = scan.next().toLowerCase();
        System.out.println("Enter password: ");
        password = scan.next().toLowerCase();

        if (checkUserInput(username, password)) {
            System.out.print("Successfully logged in");
        } else {
            System.out.print("Wrong username or password");
        }
    }
}