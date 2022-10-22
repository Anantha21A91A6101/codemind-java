import java.util.Scanner;
class Prefect
{
    public static void main(String args[])
    {
        int n,i,j,m=0,k=0,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            k=a[i];
            for(j=1;j<=k;j++)
            {
                m=j*j;
                if(m==k)
                {
                    sum=sum+k;
                }
            }
        }
        System.out.print(sum);
        sc.close();
    }
}