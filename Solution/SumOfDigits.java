
import java.util.Scanner;

public class SumOfDigits 
{
    public static void main(String[] args) {
        int n,r,s=0;

        //Scanner py=new Scanner(System.in);
        System.out.println("Entetr a No: ");
        n=new Scanner(System.in).nextInt();

       
         while(n!=0)
         {
            r=n%10;
            s=s+r;
            n=n/10;
         }

         System.out.println("Sum is: "+s);
        


    }
}
