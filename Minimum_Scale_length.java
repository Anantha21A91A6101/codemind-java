import java.util.Scanner;
class Minimum
{
    public static void main(String args[])
    {
        int n,i,j=1,max;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        max=a[0];
        while(j<n)
        {
            if(a[j]%max==0)
            {
                j++;
            }
            else
            {
                max=a[j]%max;
                i++;
            }
        }
        System.out.print(max);
        sc.close();
    }
}