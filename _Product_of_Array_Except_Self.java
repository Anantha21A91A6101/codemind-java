import java.util.Scanner;
class Product
{
    public static void main(String args[])
    {
        int n,k=1,i,j;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int [] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            k=1;
            for(j=0;j<n;j++)
            {
                if(i!=j)
                {
                    k=k*a[j];
                }
            }
            System.out.print(k+" ");
        }
        sc.close();
    }
}