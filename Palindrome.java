import java.util.Scanner;
class Fahrenheit
{
    public static void main(String args[])
    {
        int n,k,sum=0,r;
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       k=n;
       while(n!=0)
       {
           r=n%10;
           sum=sum*10+r;
           n=n/10;
       }
       if(sum==k)
       {
           System.out.format("True");
       }
       else
       {
            System.out.format("False");
       }
        sc.close();
    }
}