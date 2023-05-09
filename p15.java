import java.util.Scanner;
class p15
{
       public static void main(String arg[])
       {
                int i,j,n;
               Scanner sc=new Scanner(System.in);
               System.out.println("enter num");
               n=sc.nextInt();
               for(i=1;i<=n;i++)
               {
                         for(j=1;j<=i;j++)
                         {
                                if(j==1||i==n||i==j)
                                {
                                         System.out.print(i);
                                }
                                else
                                {
                                         System.out.print(" ");
                                }
                               
                         }
                         System.out.println();
               }
       }
}