import java.util.Scanner;
class Car
{
    public static void main(String args[])
    {
        int x1,x2,y1,y2,t;
        float m,n;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0)
        {
            x1=sc.nextInt();
            x2=sc.nextInt();
            y1=sc.nextInt();
            y2=sc.nextInt();
            m=(float)y1/x1;
            n=(float)y2/x2;
            if(m<n)
            {
                System.out.println("-1");
            }
            else if(m>n)
            {
              System.out.println("1");  
            }
            else
            {
                System.out.println("0");
            }
            t=t-1;
        }
    }
}