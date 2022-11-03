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
        int n,i,j,min=0,max=0,s,p;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(prime(n))
        {
            System.out.print("0");
        }
        else
        {
           for(i=(n+1);i>n;i++)
           {
              if(prime(i))
              {
                  max=i;
                  break;
              }
           }
           for(j=(n-1);j>=1;j--)
           {
              if(prime(j))
              {
                 min=j;
                 break;
              } 
            }
            s=n-min;
            p=max-n;
            if(s>p)
            {
               System.out.print(p);
            }
            else
            {
                System.out.print(s);
            }
        }
    }
}
