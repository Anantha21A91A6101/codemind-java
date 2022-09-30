import java.util.Scanner;
class Number
{
    public static void main(String args[])
    {
        int i,sum=0;
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(i=0;i<s.length();i++)
        {
            char k=s.charAt(i);
            if(Character.isDigit(k))
            {
                sum=sum+(k-'0');
            }
        }
        System.out.print(sum);
    }
}