import java.util.Scanner;
class Phone
{
    public static void main(String args[])
    {
        long n,r,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextLong();
        while(n>0)
        {
            r=n%10;
            c++;
            n=n/10;
        }
        if(c==10)
        {
            System.out.println("Valid");
        }
        else
        {
            System.out.println("Invalid");
        }
        sc.close();
    }
}