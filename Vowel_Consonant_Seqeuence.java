import java.util.Scanner;
class Vowel
{
    public static void main(String args[])
    {
        String s;
        int i,k=0,m=0;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        for(i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='a' || c=='i' || c=='e' || c=='o' || c=='u')
            {
                k=k+1;
                if(k==1)
                {
                    System.out.print("V"+"");
                    m=0;
                }
            }
            else
            {
                m=m+1;
                if(m==1)
                {
                    System.out.print("C"+"");
                    k=0;
                }
            }
        }
    }
}