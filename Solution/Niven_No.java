
import java.util.Scanner;

public class Niven_No 
{
    public static void main(String[] args) {
        int s=0;
        
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a No: ");
            int n=sc.nextInt();
            int p=n;
 while(n!=0)
 {
    int r=n%10;
    s=s+r;
    n=n/10;
 }
  if(p%s==0)
    System.out.println("Niven NO");
 else
 System.out.println("Not Niven");
        
    }    
}
