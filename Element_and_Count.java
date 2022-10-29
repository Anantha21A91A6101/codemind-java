import java.util.Scanner;
class Count
{
    public static void main(String args[])
    {
        int n,j,i,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            c=1;
            if(a[i]==-1)
            {
                continue;
            }
            for(j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    c++;
                    a[j]=-1;
                }
            }
            System.out.print(a[i]+" "+c+" ");
        }
    }
}