public class Opps_Encapsule_2
{
    private int id;
    private String name;
    private String fn;  
    //private int new_id;

    public Opps_Encapsule_2(int id, String name, String fn) 
    {
        this.id=id;
        this.name=name;
        this.fn=fn;
    }
    
    /*public void setId()
    {
        
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter new Id: ");
            int new_id=sc.nextInt();
            System.out.println("New Id is: "+new_id);
            this.id=new_id;
        
    }*/

    public int getId()
    {
        return this.id;
    }
    public String getName()
    {
        return this.name;
    }

    public void getChatting()
    {
        if(this.id==1005)
        {
            System.out.println("He is chatting with... "+this.fn);
        }
        else
        {
            System.out.println("He is chatting with.... Kyu btau...!!");
        }
    }    
}
