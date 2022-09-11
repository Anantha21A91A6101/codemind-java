import java.util.Scanner;
class Interest
{
    public static void main(String args[])
    {
        int n,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        i=(n*(n-3)/2);
        System.out.println(i);
        sc.close();
    }
}