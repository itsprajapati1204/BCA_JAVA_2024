
import java.util.Scanner;

public class Recursion_Fibonaci 
{
    public int rec_fib(int n)
    {
        if(n==1)
            return 1;
        if(n==0)
            return 0;
        int z=rec_fib(n-1)+rec_fib(n-2);
        return  z;
    }
public static void main(String[] args) 
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a no: ");
    int n=sc.nextInt();
    Recursion_Fibonaci r=new Recursion_Fibonaci();
    int x=r.rec_fib(n);
    System.out.println(x);
}    
}
