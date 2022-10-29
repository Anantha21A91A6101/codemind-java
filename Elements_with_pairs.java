import java.util.Scanner;
class Count
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
        if(n%2==0)
        {
            for(i=0;i<n;i++)
            {
              System.out.print(a[i]+" ");
            }
        }
        else
        {
            for(i=0;i<n;i++)
            {
                System.out.print(a[i]+" ");
            }
            System.out.print("0");
        }
    }
}