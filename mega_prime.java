import java.util.Scanner;
class Fib
{
    public static void main(String args[])
    {
        int n,i,c=0,r,m=0,sum=0,s=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==2)
         {
            while(n>0)
            {
               r=n%10;
               m=0;
               for(i=1;i<=r;i++)
               {
                   if(r%i==0)
                   {
                       m++;
                   }
               }
               if(m==2)
               {
                   s++;
               }
               sum++;
               n=n/10;
            }
         }
         if(c==2 && sum==s)
         {
             System.out.print("Mega Prime");
         }
         else
         {
             System.out.print("Not Mega Prime");
         }
         sc.close();
    }
}