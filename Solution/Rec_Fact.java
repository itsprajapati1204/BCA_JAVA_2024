
import java.util.Scanner;

public class Rec_Fact 
{ int f;
    public int fact(int n)
    {
        if(n==0)
            return 1;
        else
        {
            f=n*fact(n-1);
        }
        return f;

    }
public static void main(String[] args) 
{
    Rec_Fact obj=new Rec_Fact();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a no: ");
    int n=sc.nextInt();
    int x=obj.fact(n);
    System.out.println("Factorial is: "+x);
}    
}
