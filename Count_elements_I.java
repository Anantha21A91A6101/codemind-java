import java.util.Scanner;
class Count
{
    public static void main(String args[])
    {
        int n,i,j,c=0,m,s=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int[] b=new int[m];
        for(j=0;j<m;j++)
        {
           b[j]=sc.nextInt(); 
        }
        for(i=0;i<n;i++)
        {
              c=0;
              for(j=0;j<m;j++)
              {
                if(a[i]==b[j])
                 {
                     c++;
                     b[j]=-1;
                 }
              }
            if(c!=0)
            {
                s++;
            } 
        }
        System.out.print(s);
        sc.close();
    }
}

