import java.util.Scanner;
class Divisible
{
    public static void main(String args[])
    {
        int n,k,sum=0,i;
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
                sum=sum+1;
                System.out.println("True");
                break;
            }
        }
        if(sum==0)
        {
           System.out.println("False");
        }
        sc.close();
    }
}