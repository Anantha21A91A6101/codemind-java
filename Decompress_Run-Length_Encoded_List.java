import java.util.Scanner;
class Run
{
    public static void main(String args[])
    {
        int n,c=1,k,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(i%2==0)
            {
                k=a[i];
                c=1;
                if((i+1)%2!=0)
                {
                    while(c<=k)
                    {
                        System.out.print(a[i+1]+" ");
                        c=c+1;
                    }
                }
            }
        }
    }
}