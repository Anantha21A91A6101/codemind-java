import java.util.Scanner;
class Count
{
    public static void main(String args[])
    {
        int n,i,j,k,r,sum=0,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=n+1;i>n;i++)
        {
            k=i;
            sum=0;
            while(k!=0)
            {
                r=k%10;
                sum=sum*10+r;
                k=k/10;
            }
            if(sum==i)
            {
                c=0;
                for(j=1;j<=i;j++)
                {
                    if(i%j==0)
                    {
                        c++;
                    }
                }
                if(c==2)
                {
                    System.out.print(i);
                    break;
                }
            }
        }
    }
}