import java.util.Scanner;
class Fib
{
    public static void main(String args[])
    {
        int n,c,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a=0,b=1;
        c=a+b;
        System.out.print(a+" "+b+" ");
        for(i=1;i<(n-1);i++)
        {
            System.out.print(c+" ");
            a=b;
            b=c;
            c=a+b;
        }
        sc.close();
    }
}