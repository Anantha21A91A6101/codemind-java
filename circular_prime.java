import java.util.Scanner;
class Fib
{
    public static void main(String args[])
    {
        int n,k,r,sum=0,i,c=0,m=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=n;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        for(i=1;i<=k;i++)
        {
            if(k%i==0)
            {
                c++;
            }
        }
        for(i=1;i<=sum;i++)
        {
            if(sum%i==0)
            {
                m++;
            }
        }
        if(c==2 && m==2)
        {
            System.out.print("circular prime");
        }
        else if(c==2 && m!=2)
        {
            System.out.print("prime but not a circular prime");
        }
        else if(c!=2 && m!=2 )
        {
            System.out.print("not prime");
        }
        sc.close();
    }
}