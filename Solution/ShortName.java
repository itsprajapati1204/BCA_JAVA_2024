
import java.util.Scanner;

public class ShortName 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name: ");
        String name=sc.nextLine();

        String str[]=name.split(" ");
                                                    //int l=str.length;
                                                 //System.out.println("len="+l);
        String sn="";
        for(int i=0;i<str.length-1;i++)
        {
           char ch=str[i].charAt(0);
            sn=sn+ch+".";
        }
        sn=sn+str[str.length-1];
        System.out.println(sn);
    }    
}
