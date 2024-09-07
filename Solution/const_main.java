
import java.util.Scanner;

public class const_main 
{
    public static void main(String[] args) 
    {

        //1. called default constructor with default value
        /*  const_Stu s1=new const_Stu();       */


        // called default constructor with USER DEFINED value

        /*const_Stu s1=new const_Stu();
        s1.id=101;
        s1.age=17;
        s1.nos=5;
        s1.name="prateeksha";
        System.out.println(s1.id);
        System.out.println(s1.age);
        System.out.println(s1.nos);
        System.out.println(s1.name);    */


        //2. Called parametrized function
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter id: ");
        int id=sc.nextInt();

        //You can pass user defined values (eg: id) as well as fixed value (eg: age,nos,name)

        const_Stu s1=new const_Stu(id,17,5,"Mudit");
        /*System.out.println(s1.id);
        System.out.println(s1.age);
        System.out.println(s1.nos);
        System.out.println(s1.name);*/


        
        const_Stu s2=new const_Stu(s1);
        System.out.println(s2.id);
        System.out.println(s2.age);
        System.out.println(s2.nos);
        System.out.println(s2.name);

    }
}
