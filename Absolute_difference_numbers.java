import java.util.Scanner;
import java.lang.Math;
class Diff
{
    public static void main(String args[])
    {
        int n,m,sum=0,c=0,r,p=0,h=0,e=0,i=0,o=0,w;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        int k=n;
        while(n>0)
        {
            r=n%10;
            c++;
            sum=sum*10+r;
            if(c==m)
            {
                break;
            }
            n=n/10;
        }
        while(sum>0)
        {
            r=sum%10;
            p=p*10+r;
            sum=sum/10;
        }
        while(k>0)
        {
            r=k%10;
            e=e*10+r;
            k=k/10;
        }
        while(e>0)
        {
            r=e%10;
            o++;
            i=i*10+r;
            if(o==m)
            {
                break;
            }
            e=e/10;
        }
        if(i>p)
        {
            w=i-p;
        }
        else
        {
            w=p-i;
        }
        System.out.print(w);
    }
}