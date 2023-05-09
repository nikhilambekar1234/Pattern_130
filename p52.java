import java.util.Scanner;
class p52
{
       public static void main(String arg[])
       {
                int i,j,n;
                char ch='A';
               Scanner sc=new Scanner(System.in);
               System.out.println("enter num");
               n=sc.nextInt();
               for(i=1;i<=n;i++)
               {
                         for(j=1;j<=n;j++)
                         {
                                System.out.print(ch);
                         }
                         ch++;
                         System.out.println();
               }
       }
}