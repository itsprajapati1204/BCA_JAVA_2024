
import java.util.Scanner;

class Fun_Type2
{
public void fun2(int x,int y)                          //definition
{
    
    int c=x+y;                                  //processing
    System.out.println("Add is: "+c);
}
}




public class Main_Fun_Type2
{
  public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a: ");
    int a=sc.nextInt();
    System.out.println("Enter b: ");
    int b=sc.nextInt();

    Fun_Type2 ob=new Fun_Type2();
    ob.fun2(a,b);
  }  
}
