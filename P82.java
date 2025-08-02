// Java Program to Find the Biggest of 3 Numbers

import java.util.Scanner;
class P82 {
    static int biggest(int x, int y, int z)
    {
        if (x >= y && x >= z)
            return x;
        else if (y >= x && y >= z)
            return y;
        else
            return z;
    }
    public static void main(String[] args)
    {
        int a, b, c, largest;
        Scanner s=new Scanner(System.in);
        System.out.println ("Enter the values of  a");
        a=s.nextInt();
        System.out.println ("Enter the values of  b");
        b=s.nextInt();
        System.out.println ("Enter the values of  c");
        c=s.nextInt();
        largest = biggest(a, b, c);
        System.out.println(largest + " is the largest number.");
    }
}