import java.util.Scanner;
class Sort
{
    public static void main(String arg[])
    {
       int n,i,m,c=0;
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       m=sc.nextInt();
       int[] a=new int[n];
       for(i=0;i<n;i++)
       {
           a[i]=sc.nextInt();
       }
       for(i=0;i<n;i++)
       {
           if(a[i]%m!=0)
           {
               c++;
           }
       }
       System.out.print(c);
       sc.close();
    }
}