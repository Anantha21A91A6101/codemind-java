import java.util.Scanner;
class Search
{
    public static void main(String args[])
    {
        int n,j,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int t=n;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if((i==j)||(i+j)==n-1)
                {
                    System.out.print(t+" ");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
            t--;
        }
        sc.close();
    }
}