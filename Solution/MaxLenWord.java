import java.util.Scanner;

public class MaxLenWord 
{
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name: ");
        String name=sc.nextLine();
 
        String str[]=name.split(" ");
                                                    //int l=str.length;
                                                 //System.out.println("len="+l);
       int max=0,index=0,i;

       for(i=0;i<str.length;i++)
       {
        int len=str[i].length();
        if(len>max)
        {
            max=len;
            index=i;
        }
       }
       System.out.print("\nThe biggest String is "+str[index]+" with length "+max);
   } 
    
}
