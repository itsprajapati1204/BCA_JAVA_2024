import java.util.Scanner;
public class Recursive_factorial
{
     int f;
    public int fact(int n)
    {
        if(n==0)                //Base Condition
            return 1;
        else
            f=n*fact(n-1);         // Recursive relation
        return f;
    }
public static void main(String[] args) 
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a No: ");
    int n=sc.nextInt();
Recursive_factorial obj=new Recursive_factorial();
int x=obj.fact(n);
System.out.println("Factorial of "+n+" is: "+x);
}
}
