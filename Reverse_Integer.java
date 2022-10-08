import java.util.Scanner;
class Unique
{
    public static void main(String args[])
    {
        int n,r,sum=0,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=n;
        while(n!=0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        System.out.print(sum);
        sc.close();
    }
}