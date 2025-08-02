// User function Template for Java
import java.util.Scanner;
class Solution 
{
    public static String compareNM(int n, int m) 
    {
        // code here
        if(n<m)
            return("lesser");
        else if (n==m)
            return("equal");
         else
            return("greater"); 
    
        
    }
    public static void main(String args[])
    {
        int n,m;
        Scanner sc=new Scanner(System.in);
        System.out.println("input n");
        n=sc.nextInt();
        System.out.println("input m");
        m=sc.nextInt();
        String r=Solution.compareNM(n,m);    
        System.out.println(r);
        
    }