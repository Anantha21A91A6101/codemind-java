import java.util.Scanner;
class Count
{
    public static void main(String args[])
    {
        int n,i,j,c=0,sum=0,m=0;
        float avg;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            c=0;
            for(j=0;j<n;j++)
            {
                if(a[i]==a[j]&&a[i]!=-1)
                {
                    c++;
                }
            }
            if(c==a[i])
            {
                sum=sum+a[i];
                m++;
                a[i]=-1;
            }
        }
        if(m==0)
        {
            System.out.print("-1");
        }
        else
        {
            avg=(float)sum/m;
            System.out.format("%.2f",avg);
        }
        sc.close();
    }
}
        