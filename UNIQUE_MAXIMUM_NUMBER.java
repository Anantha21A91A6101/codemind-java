import java.util.Scanner;
class Maximum
{
    public static void main(String args[])
    {
        int n,i,j,max=0,c=0,m=0;
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
            if(c==1)
            {
                if(a[i]>max)
                {
                    max=a[i];
                    m++;
                }
            }
        }
        if(m==0)
        {
            System.out.print("-1");
        }
        else
        {
            System.out.print(max);
        }
        sc.close();
    }
}