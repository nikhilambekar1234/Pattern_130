import java.util.Scanner;
class p29
{
       public static void main(String arg[])
       {
                int i,j,n,num=1;
                char ch='A';
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
                         num--;
                         System.out.println();
               }
       }
}