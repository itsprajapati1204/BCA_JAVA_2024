
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwinPrime 
{
    int c=0,f=0;
    public int twprime(int x)
    {
        for(int i=1;i<=x;i++)
        {
            if(x%i==0)
            {
                c++;
            }
        }
        if(c==2)
            f=1;
        return f;
    }
}

class MyMain
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(read);

        System.out.println("Enter value of n: ");
        int n=Integer.parseInt(br.readLine());

        System.out.println("Enter value of m: ");
        int m=Integer.parseInt(br.readLine());

        TwinPrime tw=new TwinPrime();
        int p1=tw.twprime(n);

        int p2=tw.twprime(m);

        if((p1==1 && p2==1) && (m-n==2 || n-m==2))
        {
            System.out.println(n+" and "+m+ ": Number is Twin Prime");
        }
        else
        {
            System.out.println(n+" and "+m+ ": Number is not Twin Prime");
        }

    }
}