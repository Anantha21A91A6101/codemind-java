import java.util.Scanner;
class Spy
{
    public static void main(String args[])
    {
        int n,r,sum=0,p=1;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            sum=sum+r;
            p=p*r;
            n=n/10;
        }
        if(sum==p)
        {
            System.out.print("Spy Number");
        }
        else
        {
            System.out.print("Not Spy Number");
        }
        sc.close();
    }
}