import java.util.Scanner;
class Pretty
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            int a,b,c=0,i;
            a=sc.nextInt();
            b=sc.nextInt();
            for(i=a;i<=b;i++)
            {
                if(i%10==2||i%10==3||i%10==9)
                {
                    c=c+1;
                }
            }
            System.out.println(c);
            n=n-1;
        }
        sc.close();
    }
}