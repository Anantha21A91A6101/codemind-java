import java.util.Scanner;
class Fib
{
    public static void main(String args[])
    {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0)
        {
            int n,i,j,x,s=0,k;
            n=sc.nextInt();
            int[] a=new int[n];
            for(i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            for(i=0;i<n;i++)
            {
                for(j=i+1;j<n;j++)
                {
                    if(a[i]>a[j])
                    {
                        x=a[i];
                        a[i]=a[j];
                        a[j]=x;
                        s++;
                    }
                }
            }
            if(s==0)
            {
                System.out.println("0");
            }
            else
            {
                k=a[n-1]-a[0];
                System.out.println(k);
            }
            t--;
        }
        sc.close();
    }
}