import java.util.Scanner;
class Count
{
    public static void main(String args[])
    {
        int n,m,k,i,r;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        for(i=n;i<=m;i++)
        {
            k=i;
            while(k>0)
            {
                r=k%10;
                if(r==0 || i%r!=0)
                {
                    break;
                }
                k=k/10;
            }
            if(k==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}