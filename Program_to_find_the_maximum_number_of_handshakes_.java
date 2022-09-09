import java.util.Scanner;
class Handshakes
{
    public static void main(String args[])
    {
        int n,c;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        c=(n*(n-1)/2);
        System.out.println(c);
        sc.close();
    }
}