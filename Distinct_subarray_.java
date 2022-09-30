import java.util.Scanner;
class Subarray
{
    public static void main(String args[])
    {
        int n,k,i,j,c=0,m=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        for(i=n;i<=k;i++)
        {
            c=0;
            for(j=i;j<=k;j++)
            {
                c=c+j;
                if(c%2!=0)
                {
                    m++;
                }
            }
        }
        System.out.print(m);
        sc.close();
    }
}