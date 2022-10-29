import java.util.Scanner;
class Count
{
    public static void main(String args[])
    {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0)
        {
            int n,s,i,j,k,m,l,p,c=0,min=0,max=0,d,h;
            n=sc.nextInt();
            s=n;
            for(i=n;i>=1;i--)
            {
                c=0;
                p=i;
                for(j=1;j<=i;j++)
                {
                    if(i%j==0)
                    {
                        c++;
                    }
                }
                if(c==2)
                {
                    min=p;
                    break;
                }
            }
            for(k=(n+1);k>n;k++)
            {
                c=0;
                l=k;
                for(m=1;m<=k;m++)
                {
                    if(k%m==0)
                    {
                        c++;
                    }
                }
                if(c==2)
                {
                    max=l;
                    break;
                }
            }
            d=s-min;
            h=max-s;
            if(d>h)
            {
                System.out.println(max);
            }
            else
            {
                System.out.println(min);
            }
            t--;
        }
        sc.close();
    }
}