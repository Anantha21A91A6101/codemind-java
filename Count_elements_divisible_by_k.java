import java.util.Scanner;
class Divisible
{
    public static void main(String args[])
    {
        int n,k,c=0,i;
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
            if(a[i]%k==0)
            {
                c=c+1;
            }
        }
        System.out.println(c);
        sc.close();
    }
}