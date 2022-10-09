import java.util.Scanner;
class Maximum
{
    public static void main(String args[])
    {
        int n,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]==0)
            {
                continue;
            }
            else
            {
                System.out.print(a[i]+" ");
            }
        }
        for(i=0;i<n;i++)
        {
            if(a[i]==0)
            {
                System.out.print(a[i]+" ");
            }
        }
        sc.close();
    }
}