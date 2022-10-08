import java.util.Scanner;
class Maximum
{
    public static void main(String args[])
    {
        int n,r,c=0,m=0,e=0,o=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            c++;
            if(r%2==0)
            {
                e++;
            }
            else if(r%2!=0)
            {
                o++;
            }
            else
            {
                m++;
            }
            n=n/10;
        }
        if(c==e)
        {
            System.out.print("Even");
        }
        else if(c==o)
        {
            System.out.print("Odd");
        }
        else
        {
            System.out.print("Mixed");
        }
        sc.close();
    }
}