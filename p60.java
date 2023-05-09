import java.util.Scanner;
class p60
{
       public static void main(String arg[])
       {
                int i,j,n,k;
               Scanner sc=new Scanner(System.in);
               System.out.println("enter num");
               n=sc.nextInt();
               for(i=1;i<=n;i++)
               {
                         for(j=1;j<=i;j++)
                         {
                                System.out.print("*");
                         }
                         System.out.println();
               }
               for(i=1;i<=n-1;i++)
               {
                         for(j=1;j<=(n-i);j++)
                         {
                                System.out.print("*");
                         }
                         System.out.println();
               }
       }
}