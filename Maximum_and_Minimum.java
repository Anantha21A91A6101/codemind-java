import java.util.Scanner;
class Max
{
    public static void main(String args[])
    {
        int n,i,j,c=0,k=10000,l=0,t=0;
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
            if(c==a[i])
            {
                if(a[i]<k)
                {
                    k=a[i];
                }
                if(a[i]>l)
                {
                    l=a[i];
                }
                t=t+1;
            }
        }
        if(t==0)
        {
            System.out.println("-1");
        }
        else
        {
            System.out.println(k+" "+l);
        }
    }
}