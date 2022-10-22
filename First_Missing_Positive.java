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
        for(j=1;j<1000;j++)
        {
            m=0;
            for(i=0;i<n;i++)
            {
                if(a[i]==j)
                {
                    m++;
                }
            }
            if(m==0)
            {
                System.out.println(j);
                break;
            }
        }
        sc.close();
    }
}