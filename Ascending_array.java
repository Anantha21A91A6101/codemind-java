import java.util.Scanner;
class Descending
{
    public static void main(String args[])
    {
        int n,i,c=0,k=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(k<a[i])
            {
                k=a[i];
                c++;
            }
        }
        if(c==n)
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");
        }
        sc.close();
    }
}