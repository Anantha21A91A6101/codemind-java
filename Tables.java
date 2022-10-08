import java.util.Scanner;
class Table
{
    public static void main(String args[])
    {
        int n,m,i=1;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        while(i<=m)
        {
            System.out.println(n+" x "+i+" = "+(i*n));
            i=i+2;
        }
        sc.close();
    }
}