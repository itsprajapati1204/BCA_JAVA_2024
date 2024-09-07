
import java.util.Scanner;

public class Opps_Encapsule_Main 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Id: ");
        int id=sc.nextInt();
        Opps_Encapsule_2 s1=new Opps_Encapsule_2(id, "Anubhav", "Tina");
        System.out.println("Id is: "+s1.getId());    
        //s1.setId();
        //System.out.println("New Id is: "+s1.getId()); 
        System.out.println("Name is: "+s1.getName());
        s1.getChatting();        

    }
}
