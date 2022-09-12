import java.util.Scanner;
class Abundant
{
    public static void main(String args[])
    {
        int n,k,sum=0,i;
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       k=n;
       for(i=1;i<n;i++)
       {
           if(n%i==0)
           {
               sum=sum+i;
           }
       }
       if(sum>k)
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