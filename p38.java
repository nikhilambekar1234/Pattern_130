import java.util.Scanner;
class p38
{
       public static void main(String arg[])
       {
                int i,j,n;
                char ch='A',temp;
               Scanner sc=new Scanner(System.in);
               System.out.println("enter num");
               n=sc.nextInt();
               for(i=1;i<=n;i++)
               {
                         temp=ch;
                         for(j=1;j<=n;j++)
                         {
                                System.out.print(temp);
                                 temp++;
                         }
                         ch++;
                         System.out.println();
               }
       }
}