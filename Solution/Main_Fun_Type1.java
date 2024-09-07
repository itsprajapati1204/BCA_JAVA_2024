
import java.util.Scanner;

class Fun_Type1
{
public void fun1()                          //definition
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a: ");
    int a=sc.nextInt();
    System.out.println("Enter b: ");
    int b=sc.nextInt();
    int c=a+b;                                  //processing
    System.out.println("Add is: "+c);
}
}




public class Main_Fun_Type1
{
  public static void main(String[] args)
   {
    Fun_Type1 obj=new Fun_Type1();
    obj.fun1();
  }  
}
