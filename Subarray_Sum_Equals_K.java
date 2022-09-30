import java.util.Scanner;
class Subarray
{
    public static void main(String args[])
    {
        int n,k,i,j,c=0,m=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            c=0;
            for(j=i;j<n;j++)
            {
                c=c+a[j];
                if(c==k)
                {
                    m++;
                }
            }
        }
        System.out.print(m);
        sc.close();
    }
}