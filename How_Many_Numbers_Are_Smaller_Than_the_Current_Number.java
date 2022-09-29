import java.util.Scanner;
class Number
{
    public static void main(String args[])
    {
        int n,i,j,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            c=0;
            for(j=0;j<n;j++)
            {
                if(i!=j)
                {
                    if(a[i]>a[j])
                    {
                        c++;
                    }
                }
            }
            System.out.print(c+" ");
        }
        sc.close();
    }
}