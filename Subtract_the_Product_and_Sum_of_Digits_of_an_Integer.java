import java.util.Scanner;
class Square
{
    public static void main(String args[])
    {
        int n,sum=0,p=1,r;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            sum=sum+r;
            p=p*r;
            n=n/10;
        }
        if(sum>p)
        {
            System.out.println(sum-p);
        }
        else
        {
            System.out.println(p-sum);
        }
        sc.close();
    }
}