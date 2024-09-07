public class JumpStatement
{
    public static void main(String[] args) {
        int i=1;
        for(i=1;i<=5;i++)
        {
            if(i==3)
            {
                System.out.println("Demo of Continue");
                continue;
            }
            System.out.println(i);
        }
        System.out.println("out of loop");
    }    
}
