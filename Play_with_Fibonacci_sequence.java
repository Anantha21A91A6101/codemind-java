import java.util.Scanner;
class Fib
{
    public static void main(String args[])
    {
        int n,a=0,b=1,i,c;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        c=a+b;
        System.out.print(a+" "+b+" ");
        for(i=1;i<(n-1);i++)
        {
            System.out.print(c+" ");
            a=b;
            b=c;
            c=a+b;
        }
    }
}