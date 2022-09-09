import java.util.Scanner;
class Escape
{
    public static void main(String args[])
    {
        int n,i,odd=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]%2!=0)
            {
                odd++;
            }
        }
        if(odd<=2)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        sc.close();
        
    }
}