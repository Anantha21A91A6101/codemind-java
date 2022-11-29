import java.util.Scanner;
import java.lang.Math;
class Hello
{
    public static int PRG(int n)
    {
        int l,r,k;
        l=(int)Math.pow(2,(int)(Math.log(n)/Math.log(2)));
        r=l*2;
        l=n-l;
        r=r-n;
        k=Math.min(l,r);
        return k;
    }
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.print(PRG(n));
    }
}