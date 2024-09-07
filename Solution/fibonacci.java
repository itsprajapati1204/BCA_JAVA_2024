
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n1=0,n2=1,n3,i,n;
        System.out.println("Enter no of elements: ");
        n=sc.nextInt();
        System.out.print(n1+"\t"+n2);

  
        for(i=1;i<=n-2;i++)
        {
        n3=n1+n2;
        System.out.print("\t"+n3);
        n1=n2;
        n2=n3;
        }
    }
}
