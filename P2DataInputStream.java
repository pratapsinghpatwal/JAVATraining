// Java program to read input using DataInputStream class
import java.io.*;

public class P2DataInputStream {
  
    public static void main(String[] args)
        throws IOException
    {
        DataInputStream r = new DataInputStream(System.in);

        // Reading integers
        System.out.print("Enter an integer: ");
        int i = Integer.parseInt(r.readLine());

        // Reading strings
        System.out.print("Enter a string: ");
        String s = r.readLine();
        System.out.println("You entered integer: " + i);
        System.out.println("You entered string: " + s);
    }
}