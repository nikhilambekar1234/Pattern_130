import java.util.Scanner;
class p130
{
       public static void main(String arg[])
       {
                int i,j,k,n,num;
                char ch='A';
               Scanner sc=new Scanner(System.in);
               System.out.println("enter num");
               n=sc.nextInt();
               for(i=1;i<=n-1;i++)
               {
                         for(j=1;j<=(n-i);j++)
                         {
                                System.out.print(" ");
                         }
                         for(k=1;k<=(2*i)-1;k++)
                         {
                               
                             System.out.print(ch);
                         }
                          ch++;
                         System.out.println();
               }
               for(i=1;i<=n;i++)
               {
                         num=1;
                         for(j=1;j<i;j++)
                         {
                                System.out.print(" ");
                         }
                         for(k=1;k<=2*(n-i)+1;k++)
                         {
                                System.out.print(num);
                                       num++;
                         }
                         System.out.println();
               }
       }
}