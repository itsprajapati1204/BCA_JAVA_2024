import java.util.Scanner;

public class HappyNumber 
{
    public static void main(String[] args) 
    {
      Scanner sc=new Scanner(System.in) ;
      System.out.println("Enter a no: ");
      int n=sc.nextInt();
      
      while(n>9)
      {
            int x=n;
            int s=0;
            while(x!=0)
            {
                int r=x%10;
                s=s+(r*r);
                x=x/10;
            }
            System.out.println("s is: "+s);
            n=s;
      }
      if(n==1)
      System.out.println("Happy No:");
      else
      System.out.println("Not happy");
    }    
}
