import java.util.Scanner;
class Spy
{
    public static void main(String args[])
    {
        int n,r,sum=0,k,p;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        p=n;
        k=n*n;
        while(k!=0)
        {
            r=k%10;
            sum=sum+r;
            k=k/10;
        }
        if(p==sum)
        {
            System.out.print("Neon Number");
        }
        else
        {
            System.out.print("Not Neon Number");
        }
        sc.close();
    }
}