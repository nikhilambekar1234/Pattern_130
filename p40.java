import java.util.Scanner;
class p40
{
       public static void main(String arg[])
       {
                int i,j,n,num;
                char ch;
               Scanner sc=new Scanner(System.in);
               System.out.println("enter num");
               n=sc.nextInt();
               for(i=1;i<=n;i++)
               {
                         num=i;
                         for(j=1;j<=n;j++)
                         {
                                   System.out.print(num);
                                   num++;
                         }
                         System.out.println();
               }
       }
}