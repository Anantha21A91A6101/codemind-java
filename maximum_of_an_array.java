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
        int max=a[0];
        for(i=1;i<n;i++)
        {
            if(max<=a[i])
            {
                max=a[i];
            }
        }
        System.out.print(max);
        sc.close();
    }
}