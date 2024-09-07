import java.util.Scanner;

public class MenuCard {
public static void main(String[] args) 
{
    System.out.println("\t\tMenu card");    
    System.out.println("1. Dosa");
    System.out.println("\t\t Flav-1 \t\t  200 Rs/- ");
    System.out.println("\t\t Flav-2 \t\t  150 Rs/- ");
    System.out.println("\n2. Shakes");
    System.out.println("\t\t Flav-1 \t\t  250 Rs/- ");
    System.out.println("\t\t Flav-2 \t\t  200 Rs/- ");

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Your Choice: ");
    int ch=sc.nextInt();
    if(ch==1)
    {
        System.out.println("Enter Flavour: ");
        int f=sc.nextInt();
        System.out.println("Enter Quantity: ");
        int q=sc.nextInt();
        if(f==1)
        {
                int bill=200*q;
                System.out.println("Your Bill is: "+bill);
        }
        if(f==2)
        {
                int bill=150*q;
                System.out.println("Your Bill is: "+bill);
        }
        else{
            System.out.println("Enter correct flavour...");
        }
    } 
    else if(ch==2)
    {
        
    }
    else
    {
        System.out.println("Please Enter Correct Choice either 1 or 2");
    }

    








}
}
