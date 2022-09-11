import java.util.Scanner;
class Fahrenheit
{
    public static void main(String args[])
    {
        int c;
        float f;
        Scanner sc=new Scanner(System.in);
        c=sc.nextInt();
        f=(float)(c*1.8+32);
        System.out.format("%.2f",f);
        sc.close();
    }
}