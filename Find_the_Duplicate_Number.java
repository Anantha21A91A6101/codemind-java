import java.util.Scanner;
class Product
{
    public static void main(String args[])
    {
        int n,c=0,i,j;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int [] a=new int[n];
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
            if(c>1)
            {
                System.out.print(a[i]+" ");
            }
            a[i]=-1;
        }
        sc.close();
    }
}