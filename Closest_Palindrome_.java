import java.util.Scanner;
class Palin
{
    public static void main(String args[])
    {
        int n,i,j,l,min=0,max=0,sum=0,s=0,p,k,c,d,r;
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
            p=j;
            s=0;
            while(p>0)
            {
                r=p%10;
                s=s*10+r;
                p=p/10;
            }
            if(s==j)
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