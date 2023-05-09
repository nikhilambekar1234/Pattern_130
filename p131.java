import java.util.Scanner;
class p131
{
       public static void main(String arg[])
       {
                int i,j,k,n;
               Scanner sc=new Scanner(System.in);
               System.out.println("enter num");
               n=sc.nextInt();
               for(i=1;i<=n;i++)
               {
                         for(j=1;j<=(n-i);j++)
                         {
                                System.out.print(" ");
                         }
                         for(k=1;k<=(2*i)-1;k++)
                         {
                                System.out.print("*");
                         }
                         System.out.println();
               }
                for(i=2;i<=n;i++)
               {
                         for(j=1;j<=(n-i);j++)
                         {
                                System.out.print(" ");
                         }
                         for(k=1;k<=(2*i)-1;k++)
                         {
                                System.out.print("*");
                         }
                         System.out.println();
               }
                for(i=2;i<=n-1;i++)
               {
                         for(j=1;j<=(n-i);j++)
                         {
                                System.out.print(" ");
                         }
                         for(k=1;k<=(2*i)-1;k++)
                         {
                                System.out.print("*");
                         }
                         System.out.println();
               }
               for(i=1;i<=n+1;i++)
               {
                         for(j=1;j<=3;j++)
                         {
                                System.out.print(" ");
                         }
                         for(k=1;k<=1;k++)
                         {
                                
                                System.out.print("*");
                         }
                         System.out.println();
               }
               
       }
}