import java.util.Scanner;
class p32
{
       public static void main(String arg[])
       {
                int i,j,n;
               
               Scanner sc=new Scanner(System.in);
               System.out.println("enter num");
               n=sc.nextInt();
               for(i=1;i<=n;i++)
               {
                          char ch='A';
                         for(j=1;j<=i;j++)
                         {
                                System.out.print(ch);
                                ch++;
                         }
                         
                         System.out.println();
               }
       }
}