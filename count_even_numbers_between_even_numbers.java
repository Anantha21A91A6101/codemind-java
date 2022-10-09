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
        for(i=1;i<n;i+=2)
        {
            if(a[i]%2==0)
            {
                c++;
            }
        }
        System.out.print(c);
        sc.close();
    }
}