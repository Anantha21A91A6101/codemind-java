import java.util.Scanner;
class Prime
{
    public static void main(String args[])
    {
        int n,m,i,j,c=0,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        for(i=n;i<=m;i++)
        {
            c=0;
            k=i;
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    c=c+1;
                }
            }
            if(c==2)
            {
                System.out.println(k);
            }
        }
        sc.close();
    }
}