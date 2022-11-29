import java.util.Scanner;
class Ones
{
    public static void main(String args[])
    {
        int n,i,j=0,s=0,m=0,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]==1)
            {
                c=c+1;
            }
            else
            {
                c=0;
            }
            b[j]=c;
            j++;
            m++;
        }
        for(j=0;j<m;j++)
        {
            if(b[j]>=s)
            {
                s=b[j];
            }
        }
        System.out.print(s);
    }
}