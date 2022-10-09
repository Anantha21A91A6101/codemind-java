import java.util.Scanner;
class Unique
{
    public static void main(String args[])
    {
        int n,m=0,sum=0,i;
        float avg;
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
        avg=(float)sum/n;
        for(i=0;i<n;i++)
        {
            if(a[i]<=avg)
            {
                m++;
            }
        }
        System.out.print(m);
        sc.close();
    }
}