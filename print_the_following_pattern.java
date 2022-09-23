import java.util.Scanner;
class Pattern
{
    public static void main(String args[])
    {
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=n;i>=1;i--)
        {
            for(j=n;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}