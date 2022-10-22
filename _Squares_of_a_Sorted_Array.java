import java.util.Scanner;
class Prefect
{
    public static void main(String args[])
    {
        int n,i,j=0,c=0,k,t=0,s;
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
            k=a[i]*a[i];
            b[j]=k;
            j++;
            c++;
            k=1;
        }
         for(j=0;j<c;j++)
        {
           for(s=j+1;s<c;s++)
           {
             if(b[j]>b[s])
             {
                t=b[j];
                b[j]=b[s];
                b[s]=t;
             }
            }
        }
        for(j=0;j<c;j++)
        {
            System.out.print(b[j]+" ");
        }
        sc.close();
    }
}