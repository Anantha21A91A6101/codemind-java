import java.util.Scanner;
class Seasons
{
    public static void main(String args[])
    {
        double n,i,k,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            k=(double)1/i;
            sum=(double)sum+k;
        }
        System.out.format("%.2f",sum);
        sc.close();
    }
}