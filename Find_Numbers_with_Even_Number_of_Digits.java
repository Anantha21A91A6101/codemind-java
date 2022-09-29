import java.util.Scanner;
class Even
{
    public static void main(String args[])
    {
        int n,i,m=0,c=0,r,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            c=0;
            k=a[i];
            while(k>0)
            {
                r=k%10;
                c++;
                k=k/10;
            }
            if(c%2==0)
            {
                m++;
            }
        }
        System.out.print(m);
        sc.close();
    }
}