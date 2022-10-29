import java.util.Scanner;
class Count
{
    static int count(int n)
    {
        if(n<0)
        {
            return 0;
        }
        else if(n==0)
        {
            return 1;
        }
        return count(n-1)+count(n-2)+count(n-3);
    }
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.print(count(n));
    }
}