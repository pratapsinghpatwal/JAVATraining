class Student
{
  int Rollno;
  String Name;
  Student(int R, String N)
   {
    this.Rollno=R;
    this.Name=N;
   }
   void Display()
     {
    System.out.println("Rollno   " + Rollno);
   System.out.println("Name   " + Name);
    }

public static void main(String  pratap[])
 {
   Student s=new Student(101,"Muskan");
    s.Display();
 }
}