import java.util.Scanner;
class Maximum
{
    public static void main(String args[])
    {
        int n,m,i,j,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(j=0;j<n;j++)
        {
            b[j]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            sum=0;
            for(j=0;j<n;j++)
            {
                if(i==j)
                {
                    sum=sum+a[i]+b[j];
                }
            }
            System.out.print(sum+" ");
        }
        sc.close();
    }
}