import java.util.Scanner;
class Three
{
    public static boolean prime(int i)
    {
        int j;
        if(i<2)
        {
            return false;
        }
        for(j=2;j<i;j++)
        {
            if(i%j==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        int n,i,j,m=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=2;i*i<=n;i++)
        {
            if(prime(i) && (i*i)<=n)
            {
                m++;
            }
        }
        System.out.print(m);
        sc.close();
    }
}
