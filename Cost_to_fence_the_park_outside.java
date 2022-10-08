import java.util.Scanner;
class Park
{
    public static void main(String args[])
    {
        int l,b,w,c,a;
        Scanner sc=new Scanner(System.in);
        l=sc.nextInt();
        b=sc.nextInt();
        w=sc.nextInt();
        c=sc.nextInt();
        a=((l+2*w)*(b+2*w)-l*b);
        System.out.print(a*c);
        sc.close();
    }
}