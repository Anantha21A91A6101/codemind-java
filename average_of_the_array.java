import java.util.Scanner;
class Maximum
{
    public static void main(String args[])
    {
        int n,i,sum=0;
        double avg;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            sum=sum+a[i];
        }
        avg=(double)sum/n;
        System.out.format("%.2f",avg);
        sc.close();
    }
}