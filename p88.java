import java.util.Scanner;
class p88
{
       public static void main(String arg[])
       {
                int i,j,k,n,num=1;
                char ch='A',temp;
               Scanner sc=new Scanner(System.in);
               System.out.println("enter num");
               n=sc.nextInt();
               for(i=1;i<=n;i++)
               {
                         for(j=1;j<=(n-i);j++)
                         {
                                System.out.print(" ");
                         }
                         for(k=1;k<=i;k++)
                         {
                                   System.out.print(i);
                         }
                         System.out.println();
               }
       }
}