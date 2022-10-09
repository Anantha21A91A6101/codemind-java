import java.util.Scanner;
class Unique
{
    public static void main(String args[])
    {
        int n,m=0,c=0,i,j;
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
                if(i!=j)
                {
                    if(a[i]==a[j] && a[i]!=-1)
                    {
                        c++;
                    }
                }
            }
            if(c==0)
            {
                if(a[i]%2==0)
                {
                    m=m+a[i];
                }
            }
            a[i]=-1;
        }
        System.out.print(m);
        sc.close();
    }
}