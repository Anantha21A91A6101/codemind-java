import java.util.Scanner;
class Amicable
{
    public static void main(String args[])
    {
        int n,m,i,sum=0,p=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        for(i=1;i<m;i++)
        {
            if(m%i==0)
            {
                p=p+i;
            }
        }
        if(sum==m&&p==n)
        {
            System.out.println("Amicable");
        }
        else
        {
            System.out.println("Not Amicable");
        }
        sc.close();
    }
}