import java.util.Scanner;
class Disk
{
    public static void main(String args[])
    {
        int a,b,c,k,p;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        k=a*b*c*512;
        p=k+k;
        System.out.print(p);
        sc.close();
    }
}