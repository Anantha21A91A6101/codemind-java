import java.util.Scanner;
class Search
{
    public static void main(String args[])
    {
        int n,j,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int k=n-1;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if((i==j)||j==0 || (i+j)==k)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
            k++;
        }
        sc.close();
    }
}