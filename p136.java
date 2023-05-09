import java.util.Scanner;
class p136
{
       public static void main(String arg[])
       {
                int i,j,k,n;
                char ch='A',temp;
               Scanner sc=new Scanner(System.in);
               System.out.println("enter num");
               n=sc.nextInt();
               for(i=1;i<=n;i++)
               {
                          for(j=1;j<=(n-i)+1;j++)
                         {
                                System.out.print("*");
                         }
                         for(k=1;k<i;k++)
                         {
                                System.out.print(" ");
                         }
                          for(k=1;k<i;k++)
                         {
                                System.out.print(" ");
                         }
                          for(j=1;j<=(n-i)+1;j++)
                         {
                                System.out.print("*");
                         }
                         System.out.println();
             }
       }
}