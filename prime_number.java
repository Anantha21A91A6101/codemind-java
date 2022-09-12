import java.util.Scanner;
class prime
{
    public static void main(String args[])
    {
        int n,c=0,i;
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       for(i=1;i<=n;i++)
       {
          if(n%i==0)
          {
              c=c+1;
          }
       }
       if(c==2)
       {
           System.out.println("prime");
       }
       else
       {
           System.out.println("not a prime");
       }
       sc.close();
    }
}
       