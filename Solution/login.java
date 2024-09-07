
import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        String email = "pragya@gmail.com";
        String pass = "pr123";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Email Id: ");
        String myemail = sc.nextLine();

        if (myemail.equals(email))
         {
            System.out.println("Enter Password: ");
            String mypass = sc.nextLine();
            if(pass.equals(mypass))
            {
                System.out.println("Login Successful..");
            }
            else
            {
                System.out.println("Please Enter Valid Password...");
            }
    
         } 
        else {
            System.out.println("Please Enter Valid Email id..");
        }
    }
}
