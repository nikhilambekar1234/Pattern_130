import java.util.Scanner;
class p11
{
       public static void main(String arg[])
       {
                int i,j,n;
                char ch=64;
               Scanner sc=new Scanner(System.in);
               System.out.println("enter num");
               n=sc.nextInt();
               for(i=1;i<=n;i++)
               {
                         for(j=1;j<=n;j++)
                         {
                                if(i==1||i==n||j==1||j==n)
                                {
                                         System.out.print(i);
                                }
                                else
                                {
                                        System.out.print(ch);
                                        
                                }
                         }
                         ch++;
                         System.out.println();
               }
       }
}