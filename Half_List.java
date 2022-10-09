import java.util.Scanner;
class Even
{
    public static void main(String args[])
    {
        int i,n,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
           a[i]=sc.nextInt();
        }
        k=n/2;
        for(i=(n-1);i>=k;i--)
        {
            System.out.print(a[i]+" ");
        }
        for(i=0;i<k;i++)
        {
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
}
