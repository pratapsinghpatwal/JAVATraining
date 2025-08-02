public class Bhavesh 
{

  int x;
  int y;
   void Hello()
   {
    System.out.println("Hello Bhavesh");
    
   }

  public static void main(String args[])
  {
    Bhavesh B=new Bhavesh();
    B.x=10;
    B.y=30;
    System.out.println( "The value of x is  "+ B.x);
    System.out.println( "The value of y is  "+ B.y);
    B.Hello();    
  }
  }
