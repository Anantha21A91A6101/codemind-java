import java.util.Scanner;
class Profile
{
    public static void main(String args[])
    {
        int l,n;
        Scanner sc=new Scanner(System.in);
        l=sc.nextInt();
        n=sc.nextInt();
        while(n>0)
        {
            int w,h;
            w=sc.nextInt();
            h=sc.nextInt();
            if(w<l || h<l)
            {
                System.out.println("UPLOAD ANOTHER");
            }
            else if(w==h)
            {
                System.out.println("ACCEPTED");
            }
            else
            {
                System.out.println("CROP IT");
            }
            n--;
        }
    }
}