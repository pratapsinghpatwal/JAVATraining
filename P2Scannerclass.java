// Java program to demonstrate working of Scanner Class
import java.util.Scanner;

class P2Scannerclass
 {
    public static void main(String args[])
    {
        // Using Scanner for Getting Input from User
        Scanner s = new Scanner(System.in);
        System.out.println("Entered a string " );
        String s1 = s.nextLine();
        System.out.println("You entered string " + s1);
        System.out.println("Entered a integer " );
        int a = s.nextInt();
        System.out.println("You entered integer " + a);
        System.out.println("Entered a float ");
        float b = s.nextFloat();
        System.out.println("You entered float " + b);
    }
}

