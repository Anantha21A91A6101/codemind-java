import java.util.Scanner;
class Proic
{
    public static void main(String args[])
    {
        int n,k,i,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=2;i<n;i++)
        {
          k=i*(i+1);
          if(k==n)
          {
              System.out.print("YES");
              c=c+1;
              break;
          }
        }
        if(c==0)
        {
            System.out.print("NO");
        }
        sc.close();
    }
}