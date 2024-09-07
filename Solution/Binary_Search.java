
import java.util.Scanner;

public class Binary_Search 
{   public static void main(String[] args) 
    {
        int a[]=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("No of Elements: ");
        int n=sc.nextInt();

        System.out.println("Enter Elements in Ascending Order: ");
        for(int i=0;i<n;i++)
        {
                a[i]=sc.nextInt();
        }

        System.out.println("Enter Elements to be search: ");
        int s=sc.nextInt();

        int l=0;
        int u=n-1;
        int f=0;
        while(l<=u)
        {
            int m=(l+u)/2;
            if(s==a[m])
            {
                f=1;
                break;
            }
            else
            {
                    if(s>a[m])
                        l=m+1;
                    else
                        u=m-1;
            }
        }
         if(f==1)
         {
            System.out.println("Element Found");
         }
         else
         {
            System.out.println("Element not found");
         }













        
    }    
}
