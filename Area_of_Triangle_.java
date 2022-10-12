import java.util.Scanner;
import java.lang.Math;
class Triangle
{
    public static void main(String args[])
    {
        double a,b,c,s,k;
        Scanner sc=new Scanner(System.in);
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        s=(a+b+c)/2;
        k=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.format("%.2f",k);
    }
}