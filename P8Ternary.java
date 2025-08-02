// Java Program to Find the Biggest of 3 Numbers Importing generic Classes/Files
class P8Ternary {
    static int biggestOfThree(int x, int y, int z)
    {
        return z > (x > y ? x : y) ? z : ((x > y) ? x : y);
    }
    public static void main(String[] args)
    {
        int a, b, c;
        a = 5;
        b = 10;
        c = 3;
        int largest = biggestOfThree(a, b, c);
        System.out.println(largest    + " is the largest number.");
    }
}