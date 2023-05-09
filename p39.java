import java.util.Scanner;
class p39
{
       public static void main(String arg[])
       {
                int i,j,k,n;
                char ch;
               Scanner sc=new Scanner(System.in);
               System.out.println("enter num");
               n=sc.nextInt();
               for(i=1;i<=n;i++)
               {
                          ch='A';
                         for(j=1;j<=i;j++)
                         {
                                System.out.print(ch);
                                ch++;
                                
                         }
                          for(k=1;k<=(n-i);k++)
                         {
                                System.out.print("*");
                               
                         }
                         System.out.println();
               }
       }
}