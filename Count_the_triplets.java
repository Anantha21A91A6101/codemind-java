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
            int n,i,j,k,m,c=0;
            n=sc.nextInt();
            int[] a=new int[n];
            for(i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    if(i!=j)
                    {
                       m=a[i]+a[j];
                       for(k=0;k<n;k++)
                       {
                          if(m==a[k])
                          {
                              c=c+1;
                          }
                       }
                    }
                }
            }
            if(c==0)
            {
                System.out.println("-1");
            }
            else
            {
                System.out.println(c/2);
            }
            t=t-1;
        }
    }
}