import java.util.Scanner;
class Sub
{
    public static void main(String args[])
    {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0)
        {
            int n,m,i,j,sum=0,k=0,l=0,c=0;
            n=sc.nextInt();
            m=sc.nextInt();
            int[] a=new int[n];
            for(i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            for(i=0;i<n;i++)
            {
                sum=0;
                for(j=i;j<n;j++)
                {
                    sum=sum+a[j];
                    if(sum==m)
                    {
                        k=i+1;
                        l=j+1;
                        c=1;
                        break;
                    }
                }
                if(c==1)
                {
                    break;
                }
            }
            if(c==0)
            {
                System.out.println("-1");
            }
            else
            {
                System.out.println(k+" "+l);
            }
            t=t-1;
        }
    }
}