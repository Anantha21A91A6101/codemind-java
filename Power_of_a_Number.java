import java.util.Scanner;
class Count
{
    public static void main(String args[])
    {
        double a,b,c,k,m;
        Scanner sc=new Scanner(System.in);
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        k=Math.pow(a,b);
        m=k%c;
        System.out.print((int)m);
    }
}