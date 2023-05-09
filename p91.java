import java.util.Scanner;
class p91
{
       public static void main(String arg[])
       {
                int i,j,n,num=1;
               Scanner sc=new Scanner(System.in);
               System.out.println("enter num");
               n=sc.nextInt();
               for(i=1;i<=n;i++)
               {
                         for(j=1;j<=i;j++)
                         {
                                System.out.print(num);
                                num++;
                         }
                         System.out.println();
               }
               for(i=n-1;i>=1;i--)
               {
                         for(j=1;j<=i;j++)
                         {
                                System.out.print(num);
                                num++;
                         }
                         System.out.println();
               }
       }
}