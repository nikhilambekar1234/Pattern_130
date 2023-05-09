import java.util.Scanner;
class p89
{
       public static void main(String arg[])
       {
                int i,j,n,num;
               Scanner sc=new Scanner(System.in);
               System.out.println("enter num");
               n=sc.nextInt();
               for(i=1;i<=n;i++)
               {
                         for(j=1;j<=i;j++)
                         {
                                System.out.print(i);
                         }
                         System.out.println();
               }
               for(i=n-1;i>=1;i--)
               {
                         for(j=1;j<=i;j++)
                         {
                                System.out.print(i);
                         }
                         System.out.println();
               }
       }
}