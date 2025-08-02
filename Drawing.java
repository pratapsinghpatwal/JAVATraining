public class Drawing
 {
 void  Draw(float r)
   {
    float a=3.144f*r*r;
    System.out.println("The Area of circle " + a);
   }

  void Draw(float l,float w)
   {
    float a=l*w;
    System.out.println("The Area of Rectangle " + a);
   }

  public static void main(String ags[])
 {
   Drawing circle=new Drawing();
   circle.Draw(10.5f);
   Drawing Rectangle =new Drawing();
   Rectangle.Draw(10.4f,12.5f);


 }  
}
