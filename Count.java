import java.util.Scanner;
class Even
{
    public static void main(String args[])
    {
        int n,i,j,c=0,m=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
           a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                c++;
            }
        }
        for(i=0;i<n;i++)
        {
            if(a[i]%2!=0)
            {
                m++;
            }
        }
        System.out.print(c+" "+m);
        sc.close();
    }
}
