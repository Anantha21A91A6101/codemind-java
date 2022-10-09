import java.util.Scanner;
class Fib
{
    public static void main(String args[])
    {
        int n,v=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n!=1)
        {
            if(n%2==0)
            {
                n=n/2;
            }
            else if(n%3==0)
            {
                n=n/3;
            }
            else if(n%5==0)
            {
                n=n/5;
            }
            else
            {
                System.out.print("Not Ugly Number");
                v++;
                break;
            }
        }
        if(v==0)
          {
            System.out.print("Ugly Number");
          }
        sc.close();
    }
}