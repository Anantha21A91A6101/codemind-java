import java.util.Scanner;
class Fib
{
    public static void main(String args[])
    {
        int n,c=0,i,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<n;i++)
        {
            k=i*i;
            if(k==n)
            {
                c=c+1;
                break;
            }
        }
        if(c==0)
        {
            System.out.print("False");
        }
        else
        {
            System.out.print("True");
        }
        sc.close();
    }
}