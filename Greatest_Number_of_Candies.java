import java.util.Scanner;
class Candies
{
    public static void main(String args[])
    {
        int n,i,m,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        k=sc.nextInt();
        m=0;
        for(i=0;i<n;i++)
        {
            if(a[i]+k>=m)
            {
                m=a[i];
                System.out.print("True ");
            }
            else
            {
                System.out.print("False ");
            }
        }
    }
}