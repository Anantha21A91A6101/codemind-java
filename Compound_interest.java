import java.util.Scanner;
class Maximum
{
    public static void main(String args[])
    {
        double p,t,r,s,k,sum;
        Scanner sc=new Scanner(System.in);
        p=sc.nextDouble();
        r=sc.nextDouble();
        t=sc.nextDouble();
        k=Math.pow((1+r/100),t);
        sum=p*k;
        System.out.format("%.2f",sum);
        sc.close();
    }
}