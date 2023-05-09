import java.util.Scanner;
class p135
{
       public static void main(String arg[])
       {
                int i,j,k,n;
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
                                if(k==1||i==n||k==i)
                                {
                                       System.out.print("*");
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