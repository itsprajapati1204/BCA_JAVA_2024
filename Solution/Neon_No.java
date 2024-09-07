
import java.util.Scanner;

public class Neon_No 
{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a No: ");
    int n=sc.nextInt();     //9
    int s=0;

    int x=n*n;          //81
    
    while(x!=0)
    { 
        int r=x%10;
        s=s+r;
        x=x/10;

    }
    if(n==s)
        System.out.println("This is Neon No");
    else
        System.out.println("Not Neon");
}    
}
