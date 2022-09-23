import java.util.Scanner;
class Pattern
{
    public static void main(String args[])
    {
        int n,i,j,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=n;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print((char)(64+i)+" ");
            }
            System.out.println();
        }
    }
}