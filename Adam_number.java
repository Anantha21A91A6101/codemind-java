import java.util.Scanner;
class Fib
{
    public static void main(String args[])
    {
        int n,m,sum=0,p=0,k,r;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=n*n;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        m=sum*sum;
        while(m>0)
        {
            r=m%10;
            p=p*10+r;
            m=m/10;
        }
        if(p==k)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
        sc.close();
    }
}