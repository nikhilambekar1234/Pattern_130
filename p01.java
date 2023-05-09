import java.util.Scanner;
class p01
{
       public static void main(String arg[])
       {
                int i,j,n;
               Scanner sc=new Scanner(System.in);
               System.out.println("enter num");
               n=sc.nextInt();
               for(i=1;i<=n;i++)
               {
                         for(j=1;j<=n;j++)
                         {
                                if(i%2!=0 && j%2!=0)
                               {
                                         System.out.print("1");
                               }
                                else if(i%2!=0 && j%2==0)
                               {
                                         System.out.print("0");
                               }
                               else if(i%2==0 && j%2!=0)
                               {
                                         System.out.print("*");
                               }
                               else if(i%2==0 && j%2==0)
                               {
                                         System.out.print("@");
                               }
                         }
                         System.out.println();
               }
       }
}