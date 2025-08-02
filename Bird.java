public class Bird 
{
  String name;
  String color;
  boolean flying;

    public Bird(String n,String c, boolean f)
    {
      name=n;
      color=c;
      flying=f;
    }
    void Display()
       {
        System.out.println("The Name of the bird  "+name);
        System.out.println("The color of the bird  "+color);
        System.out.println("The Flying or Not of the bird  "+flying);
       }
     

  public static void main(String args[])
  {
    Bird B1=new Bird("Parrot", "Green", true);
    Bird B2=new Bird("Penguin", "Black & White", false);

    B1.Display();
    B2.Display();
    
 }
}
