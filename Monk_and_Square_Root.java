import java.util.Scanner;
class Monk
{
    public static void main(String args[])
    {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0)
        {
            long m,n,i,y=-1;
            n=sc.nextLong();
            m=sc.nextLong();
            for(i=0;i<m;i++)
            {
                if(i*i%m==n)
                {
                    y=i;
                    break;
                }
            }
            System.out.println(y);
            t=t-1;
        }
        sc.close();
    }
}