import java.util.Scanner;
class Sum
{
    public static void main(String args[])
    {
        int n,a,b,c;
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       while(n>0)
       {
          a=sc.nextInt();
          b=sc.nextInt();
          c=a+b;
          System.out.println(c);
          n=n-1;
       }
       sc.close();
    }
}
       