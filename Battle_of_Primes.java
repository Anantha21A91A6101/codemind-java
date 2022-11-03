import java.util.Scanner;
class Prime
{
    static int prime(int n)
    {
        int i;
       if(n<2)
       {
           return 0;
       }
       for(i=2;i<n;i++)
       {
           if(n%i==0)
           {
               return 0;
           }
       }
       return 1;
    }
    public static void main(String args[])
    {
        int a,b,y=0,i;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=1;i<=10000;i++)
        {
            if(prime(i+a+b)==1)
            {
                System.out.print(i);
                y=1;
                break;
            }
        }
    }
}