import java.util.Scanner;
class minimum
{
    public static void main(String args[])
    {
        int n,i,c=0,sum=0,d,b;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        d=sc.nextInt();
        b=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]>=d && a[i]<=b)
            {
                    sum=sum+a[i];
            }
        }
        System.out.print(sum);
        sc.close();
    }
}