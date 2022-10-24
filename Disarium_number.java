import java.util.Scanner;
import java.lang.Math;
class Dis
{
    public static void main(String args[])
    {
        int n,r,sum=0,c=0;
        double k,p=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int s=n;
        while (n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        while(sum>0)
        {
            r=sum%10;
            c=c+1;
            k=Math.pow(r,c);
            p=p+k;
            sum=sum/10;
        }
        if(p==s)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
        sc.close();
    }
}