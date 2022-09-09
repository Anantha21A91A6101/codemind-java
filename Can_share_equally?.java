import java.util.Scanner;
class Robber
{
    public static void main(String args[])
    {
        int a,b,z;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        z=a+b*2;
        if(a==0&&b%2==0)
        {
            System.out.println("YES");
        }
        else if(a==0&&b%2!=0)
        {
            System.out.println("NO");
        }
        else if(z%2==0)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        sc.close();
    }
}