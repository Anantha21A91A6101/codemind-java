import java.util.Scanner;
class Search
{
    public static void main(String args[])
    {
        int n,k,c=0,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        k=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]==k)
            {
               System.out.print(i+" ");
               c=1;
               break;
            }
        }
        if(c==0)
        {
            System.out.print("-1");
        }
        sc.close();
    }
}