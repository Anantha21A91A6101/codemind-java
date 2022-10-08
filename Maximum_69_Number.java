import java.util.Scanner;
class Maximum
{
    public static void main(String args[])
    {
        int n,i=0,c=0,r;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new int[n];
        while(n>0)
        {
            r=n%10;
            a[i]=r;
            i++;
            c++;
            n=n/10;
        }
        for(i=(c-1);i>=0;i--)
        {
            if(a[i]==6)
            {
                a[i]=9;
                break;
            }
        }
        for(i=(c-1);i>=0;i--)
        {
            System.out.print(a[i]);
        }
        sc.close();
    }
}