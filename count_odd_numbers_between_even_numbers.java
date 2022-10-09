import java.util.Scanner;
class Even
{
    public static void main(String args[])
    {
        int n,i,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n-2;i++)
        {
            if(a[i+2]%2==0 && a[i]%2==0)
            {
                if(a[i+1]%2!=0)
                {
                    c++;
                }
            }
        }
        System.out.print(c);
        sc.close();
    }
}