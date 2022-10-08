import java.util.Scanner;
class Predict
{
    public static void main(String args[])
    {
        int m,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        if(n%2==0 || m%2==0)
        {
            System.out.print("Player 1");
        }
        else
        {
            System.out.print("Player 2");
        }
        sc.close();
    }
}