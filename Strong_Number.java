import java.util.Scanner;
class Prefect
{
    public static void main(String args[])
    {
        int n,i,sum=0,m,k,r;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=n;
        while(n>0)
        {
            r=n%10;
            k=1;
            for(i=1;i<=r;i++)
            {
               k=k*i; 
            }
            sum=sum+k;
            n=n/10;
        }
        if(sum==m)
        {
            System.out.print("The number "+ m +" is a strong number");
        }
        else
        {
            System.out.print("The number "+ m +" is not a strong number");
        }
    }
}