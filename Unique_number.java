import java.util.Scanner;
class Unique
{
    public static void main(String args[])
    {
        int n,r,i=0,c=0,p=0,m=0,j;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new int[n];
        while(n>0)
        {
            r=n%10;
            a[i]=r;
            i++;
            c++;
            n=n/10;
        }
        for(i=0;i<c;i++)
        {
            p=0;
            for(j=0;j<c;j++)
            {
                if(a[i]==a[j])
                {
                    p++;
                }
            }
            if(p==1)
            {
                m++;
            }
        }
        if(m==c)
        {
            System.out.print("Unique Number");
        }
        else
        {
            System.out.print("Not Unique Number");
        }
        sc.close();
    }
}