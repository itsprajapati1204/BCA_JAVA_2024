
import java.util.Scanner;

public class SelectionSort
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        System.out.println("Enter no of elements: ");
        int n=sc.nextInt();
        
        System.out.println("Enter "+n+ "Elements: ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        //Selection Sort
        int pos;
        for(int i=0;i<n-1;i++)          
        {
            pos=i;                              //0=0

            for(int j=i+1;j<n;j++)
            {
                if(a[pos]>a[j])
                    pos=j;
            }

            if(pos!=i)
            {
                    int t=a[i];
                    a[i]=a[pos];
                    a[pos]=t;
            }
        }

        System.out.println("Sorted Elements are: ");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
 }
}
