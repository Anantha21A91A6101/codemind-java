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
            for(j=i;j<=n;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}