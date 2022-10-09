import java.util.Scanner;
class Maximum
{
    public static void main(String args[])
    {
        int n,m,i,j,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        int[][] a=new int[n][m];
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(j=0;j<m;j++)
        {
            sum=0;
            for(i=0;i<n;i++)
            {
                if(a[i][j]>sum)
                {
                    sum=a[i][j];
                }
            }
            System.out.println(sum);
        }
        sc.close();
    }
}