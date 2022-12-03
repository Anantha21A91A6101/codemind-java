import java.util.Scanner;
class Fre
{
    public static void main(String args[])
    {
        int n,i,j,k=0,c=0,m=0;
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
                    c=c+1;
                }
            }
            if(c>m)
            {
                m=c;
                k=a[i];
            }
            else if(c==m)
            {
                if(k>a[i])
                {
                    k=a[i];
                }
            }
        }
        System.out.println(k);
    }
}