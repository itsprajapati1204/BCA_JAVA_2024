class myMain
{
    public static void main(String[] args) 
    {
        Opps_Encapsule s1=new Opps_Encapsule(101, "Anubhav", "Personal chat");
        System.out.println(s1.id);
        System.out.println(s1.name);
        System.out.println(s1.chat);  

        s1.study();
        s1.chatting();
    }

    
}

public class Opps_Encapsule 
{
    public int id;
    public String name;
    private String chat;  

    public Opps_Encapsule(int id, String name, String chat) 
    {
        this.id=id;
        this.name=name;
        this.chat=chat;
    }
    public void study()
    {
        System.out.println("I am studying...");
    }
    private void chatting()
    {
        System.out.println("I am Chatting...");
    }
}
