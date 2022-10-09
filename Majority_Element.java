import java.util.Scanner;
class Maximum
{
    public static void main(String args[])
    {
        int n,c=0,i,j,sum=0,m=0;
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
                if(a[i]==a[j])
                {
                    c++;
                }
            }
            if(c>m)
            {
                m=c;
                sum=a[i];
            }
        }
        System.out.print(sum);
        sc.close();
    }
}