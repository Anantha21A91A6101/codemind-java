import java.util.Scanner;
class Count
{
    public static void main(String args[])
    {
        int n,i,j,c=0,sum=0,m;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            m=a[i];
            c=0;
            for(j=1;j<=m;j++)
            {
                if(m%j==0)
                {
                    c++;
                }
            }
            if(c==2)
            {
                sum++;
            }
        }
        System.out.print(sum);
        sc.close();
    }
}
        