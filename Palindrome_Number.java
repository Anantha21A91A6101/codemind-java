import java.util.Scanner;
class Palindrome
{
    public static void main(String args[])
    {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0)
        {
            int n,k,r,sum=0;
            n=sc.nextInt();
            k=n;
            while(n>0)
            {
                r=n%10;
                sum=sum*10+r;
                n=n/10;
            }
            if(sum==k)
            {
              System.out.print("True"+"
");  
            }
            else
            {
                System.out.print("False"+"
");
            }
            t--;
        }
        sc.close();
    }
}