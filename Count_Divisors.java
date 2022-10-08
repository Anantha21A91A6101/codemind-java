import java.util.Scanner;
class Maximum
{
    public static void main(String args[])
    {
        int a,b,c,i,m=0;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        for(i=a;i<=b;i++)
        {
            if(i%c==0)
            {
                m++;
            }
        }
        System.out.print(m);
        sc.close();
    }
}