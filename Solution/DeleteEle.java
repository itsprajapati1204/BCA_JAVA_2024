import java.util.Scanner;

public class DeleteEle 
{
    public static void main(String[] args) 
    {
        int pos=0;
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[10];
        
        System.out.println("Enter Size of array: ");
        int n=sc.nextInt();

        System.out.println("Enter "+n+" elements: ");
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }

        System.out.println("Enter Element to delete: ");
        int ele=sc.nextInt();
        int found=0;

        for(int i=0;i<n;i++)
        {
            if(ele==ar[i])
            {
                found=1;
                pos=i;
                break;
            }
        }

        if(found==1)
        {
                //Shifting
            for(int j=pos;j<n-1;j++)
            {
                ar[j]=ar[j+1];
            }

            System.out.println("Final Arrys is: ");
            for(int i=0;i<n-1;i++)
            {
                System.out.println(ar[i]);
            }
        }
        else
        System.out.println("Element does not exist...");

    }
}
