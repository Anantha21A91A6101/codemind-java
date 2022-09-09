import java.util.Scanner;
class Add
{
    public static void main(String args[])
    {
        int a,b;
        float c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=(float)(a+b)/2;
        System.out.format("%.4f",c);
        sc.close();
    }
}
