import java.util.Scanner;
class Pattern
{
    public static void main(String args[])
    {
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n+i-1;j++)
            {
                if(j<=n-i)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print(i+"");
                }
            }
            System.out.println();
        }
    }
}