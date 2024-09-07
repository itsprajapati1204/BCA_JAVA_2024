public class const_Stu
{
    int id;
    int age;
    int nos;
    String name;
    
    //1. default constructor: set default or garbage value in data members.

    /*public const_Stu()
    {
        System.out.println("Default Constructor");
    }*/


    //2. parametrized Constructor
    public const_Stu(int id1,int age1,int nos1,String name1)
    {
        System.out.println("Parametrized constructor");
        this.id=id1;
        this.age=age1;
        this.nos=nos1;
        this.name=name1;

    }

    //3. copy constructor: you can not comment parametrized const while code for copy cont
    // beccause value of object-1 will pass in object-2. so first set value in object-1.


    //copy Constructor
    public const_Stu(const_Stu s1)
    {
        System.out.println("copy constructor");
            this.id=s1.id;
            this.age=s1.age;
            this.nos=s1.nos;
            this.name=s1.name;
    }



    public  void study()
    {
        System.out.println("Study method");
    }
}
