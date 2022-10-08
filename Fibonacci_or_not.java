import java.util.Scanner;
class Fib
{
    public static void main(String args[])
    {
        int n,a,b,c,m=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n==0 || n==1)
        {
            System.out.print("True");
        }
        else
        {
            a=0;
            b=1;
            c=a+b;
            while(n>c)
            {
                a=b;
                b=c;
                c=a+b;
            }
            if(c==n)
            {
                m++;
            }
        }
        if(m==0)
        {
            System.out.print("False");
        }
        else
        {
            System.out.print("True");
        }
        sc.close();
    }
}