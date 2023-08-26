package UsernamePassword;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        String password;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your password");
        password = scanner.nextLine();

        System.out.println("Do you want to change your password? y/n");
        String yesNo = scanner.nextLine();
        if(yesNo.equals("y")){
            System.out.println("Enter your new password: ");
            String newPassword = scanner.nextLine();
            if(newPassword.equals(password)){
                System.out.println("Invalid value. Try again");
            }else{
                System.out.println("Success");
            }
        }
        scanner.close();

    }
}
