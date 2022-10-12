import java.util.Scanner;
import java.lang.Math;
class Seasons
{
    public static void main(String args[])
    {
        int n,m,s=0,c=0,i,j;
        double k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        if(n==1)
        {
            n=2;
        }
        for(i=n;i<=m;i++)
        {
            c=0;
            k=Math.sqrt(i);
            for(j=2;j<=k;j++)
            {
                if(i%j==0)
                {
                    c++;
                }
            }
            if(c==0)
            {
                s++;
            }
        }
        System.out.print(s);
    }
}