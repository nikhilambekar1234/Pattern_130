import java.util.Scanner;
class p103
{
       public static void main(String arg[])
       {
                int i,j,k,n;
               Scanner sc=new Scanner(System.in);
               System.out.println("enter num");
               n=sc.nextInt();
               
               for(i=1;i<=n;i++)
               {
                         for(j=1;j<i;j++)
                         {
                                System.out.print(" ");
                         }
                         for(k=1;k<=2*(n-i)+1;k++)
                         {
                                System.out.print("*");
                         }
                         System.out.println();
               }
       }
}