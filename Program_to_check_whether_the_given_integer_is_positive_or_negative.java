import java.util.Scanner;
class Positive
{
    public static void main(String args[])
    {
        double n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n>0)
        {
            System.out.println("Positive Number");
        }
        else
        {
           System.out.println("Negative Number");
        }
        sc.close();
    }
}