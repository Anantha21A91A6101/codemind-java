import java.util.Scanner;
class Slice
{
    public static void main(String args[])
    {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=n;i<=m;i++)
        {
            char c=s.charAt(i);
            System.out.print(c);
        }
    }
}