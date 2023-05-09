import java.util.Scanner;
class p04
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
                         
                         for(j=1;j<=i;j++)
                         {
                                if(j%2!=0)
                                {
                                       System.out.print(ch);
                                       ch++;
                                }
                                else
                                {
                                       System.out.print("*");
                                }
                               
                         }
                         
                         System.out.println();
               }
       }
}