import java.util.Scanner;
class Store
{
    public static void main(String args[])
    {
        int n,j,i,c=0,m=0;
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
                if(a[i]==a[j] && a[i]!=-1)
                {
                    c=c+1;
                }
            }
            if(c%2==0)
            {
                m=m+1;
            }
            a[i]=-1;
        }
        System.out.print(m);
    }
}