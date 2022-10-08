import java.util.Scanner;
class Factorial
{
    public static void main(String args[])
    {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0)
        {
            int a,k=1,i;
            a=sc.nextInt();
            for(i=1;i<=a;i++)
            {
                k=k*i;
            }
            System.out.println(k);
            t--;
        }
        sc.close();
    }
}