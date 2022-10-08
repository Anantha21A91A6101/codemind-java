import java.util.Scanner;
class Square
{
    public static void main(String args[])
    {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0)
        {
            int a,k,i,c=0;
            a=sc.nextInt();
            for(i=1;i<=a;i++)
            {
                k=i*i;
                if(k==a)
                {
                    c++;
                }
            }
            if(c!=0)
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
            t--;
        }
        sc.close();
    }
}