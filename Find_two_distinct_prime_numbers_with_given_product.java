import java.util.Scanner;
class Prime
{
    static boolean prime(int n)
    {
        int i;
        if(n<2)
        {
            return false;
        }
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        int n,i,j,y=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<n;i++)
        {
            if(prime(i))
            {
                for(j=1;j<i;j++)
                {
                    if(prime(j) && i*j==n)
                    {
                        y=1;
                        System.out.print(j+" "+i);
                        break;
                    }
                }
            }
            if(y==1)
            {
                y=1;
                break;
            }
        }
        if(y==0)
        {
            System.out.print("-1");
        }
    }
}