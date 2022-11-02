import java.util.Scanner;
class Palin
{
    public static void main(String args[])
    {
        int n,r,sum=0;;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(sum!=1 && sum!=4)
        {
            sum=0;
            while(n>0)
            {
                r=n%10;
                sum=sum+r*r;
                n=n/10;
            }
            n=sum;
        }
        if(sum==1)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}