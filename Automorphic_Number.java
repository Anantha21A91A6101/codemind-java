import java.util.Scanner;
import java.lang.Math;
class Automorphic
{
    public static void main(String args[])
    {
        int n,l,k,r;
        double m,h,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        l=n;
        k=n*n;
        while(n>0)
        {
            r=n%10;
            c++;
            n=n/10;
        }
        m=Math.pow(10,c);
        h=k%m;
        if(h==l)
        {
            System.out.println("Automorphic Number");
        }
        else
        {
            System.out.println("Not an Automorphic Number");
        }
    }
}