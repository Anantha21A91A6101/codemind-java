import java.util.Scanner;
class Even
{
    public static void main(String args[])
    {
        int i,j,c=0,m=0;
        Scanner sc=new Scanner(System.in);
        int[] a=new int[3];
        int[] b=new int[3];
        for(i=0;i<3;i++)
        {
           a[i]=sc.nextInt();
        }
        for(j=0;j<3;j++)
        {
            b[j]=sc.nextInt();
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
               if(i==j)
               {
                   if(a[i]>b[j])
                   {
                       c++;
                   }
                   else if(b[j]>a[i])
                   {
                       m++;
                   }
               }
            }
        }
        System.out.print(c+" "+m);
        sc.close();
    }
}
