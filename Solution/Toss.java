public class Toss
{
 public static void main(String[] args) 
 {
    double d=Math.random()*2;
    //System.out.println(d);
    int c=(int)d;
    if(c==1)
        System.out.println("Head");
    else
        System.out.println("Tail");

 }   
}
