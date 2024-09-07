import java.util.Scanner;
public class MaxMin
{
    public static void main (String []args){
        int arr[]=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        
        for (int i = 0; i < 10; i++) 
        {
            arr[i]=sc.nextInt();
        }
//Max/Min
        int min=arr[0];
        int max=arr[0];

        for(int j=0;j<10; j++)
        {
            if(min>arr[j]){
                min = arr[j];
            }
            if(max < arr[j]){
                max = arr[j];
            }
        }

        System.out.println("Min value is: "+min);
        System.out.println("Max value is: "+max);

    }
    
}
