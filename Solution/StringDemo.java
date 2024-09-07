
import java.io.IOException;
import java.util.Scanner;

public class StringDemo 
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s=sc.nextLine();
        System.out.println("Output is: "+s);  


       /*  
       InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(read);
        System.out.println("Enter String using Buffer: ");
        String s1=br.readLine();
        System.out.println("Output is: "+s1);
        */
        int l=0,d=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);

            if(Character.isLetter(ch))
            {
                l=l+1;
            }
            if(Character.isDigit(ch))
            {
                d++;
            }
        }
        System.out.println("Total Letters: "+l);
        System.out.println("Total Digits: "+d);










    }    
}
