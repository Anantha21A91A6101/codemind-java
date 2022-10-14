import java.util.Scanner;
class Palindromes
{
    public static boolean palin(int k)
    {
        int sum=0,r;
        int p=k;
        while(k>0)
        {
            r=k%10;
            sum=sum*10+r;
            k=k/10;
        }
        if(sum==p)
        {
            return true;
        }
        else
        {
            return false;
            
        }
    }
    public static void main(String args[])
    {
        int n,i,c=0,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            k=a[i];
            if(palin(k))
            {
                c++;
            }
        }
        System.out.print(c);
    }
}