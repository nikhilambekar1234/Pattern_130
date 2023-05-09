import java.util.Scanner;
class p97
{
       public static void main(String arg[])
       {
                int i,j,n,num;
                char ch='A';
               Scanner sc=new Scanner(System.in);
               System.out.println("enter num");
               n=sc.nextInt();
               for(i=1;i<=n-1;i++)
               {
                         for(j=1;j<=i;j++)
                         {
                                System.out.print(ch);
                         }
                         ch++;
                         System.out.println();
               }
               for(i=n;i>=1;i--)
               {
                         for(j=1;j<=i;j++)
                         {
                                System.out.print(j);
                         }
                         System.out.println();
               }
       }
}