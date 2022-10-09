import java.util.Scanner;
class Unique
{
    public static void main(String args[])
    {
        int n,m,i,sum=0,r=0,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        for(i=n;i<=m;i++)
        {
            k=i;
            sum=0;
            while(k!=0)
            {
                r=k%10;
                sum=sum*10+r;
                k=k/10;
            }
            if(sum==i)
            {
                System.out.print(sum+" ");
            }
        }
        sc.close();
    }
}