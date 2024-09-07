
import java.util.Scanner;

public class ArrayDemo
{
    public static void main(String[] args)
    {
        /*int arr[];
        //int[] ar;  

        arr=new arr[5];
        int ar[]=new int[5];

        int ar1[]={1,2,3,6,7,6,7,8};*/


        int a[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
            for(int i=0;i<=4;i++)
            {
                a[i]=sc.nextInt();
            }

            for(int i=0;i<=4;i++)
            {
              System.out.println(a[i]);
            }

    }    
}
