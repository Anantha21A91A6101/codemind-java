import java.util.Scanner;
class Maximum
{
    public static void main(String args[])
    {
        int n,i,min=100000;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(min>=a[i])
            {
                min=a[i];
            }
        }
        System.out.print(min);
        sc.close();
    }
}