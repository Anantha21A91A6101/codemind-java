import java.util.Scanner;
class Palin
{
    public static void main(String args[])
    {
        int n,k,l,m,r,sum=0,p=0,min=0,max=0,c,d,i,j;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        l=n;
        for(i=(n-1);i>=1;i--)
        {
            k=i;
            sum=0;
            while(k>0)
            {
                r=k%10;
                sum=sum*10+r;
                k=k/10;
            }
            if(sum==i)
            {
                min=i;
                break;
            }
        }
        for(j=(n+1);j>n;j++)
        {
            m=j;
            p=0;
            while(m>0)
            {
                r=m%10;
                p=p*10+r;
                m=m/10;
            }
            if(p==j)
            {
                max=j;
                break;
            }
        }
        c=l-min;
        d=max-l;
        if(c>d)
        {
            System.out.print(max);
        }
        else if(d>c)
        {
            System.out.print(min);
        }
        else
        {
            System.out.print(min+" "+max);
        }
    }
}