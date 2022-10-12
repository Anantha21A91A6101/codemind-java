import java.util.Scanner;
class Asci
{
    public static void main(String args[])
    {
        char c;
        Scanner sc=new Scanner(System.in);
        c=sc.nextLine().charAt(0);
        System.out.print((int)c);
        sc.close();
    }
}