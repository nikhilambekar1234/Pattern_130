import java.util.Scanner;
class p09
{
       public static void main(String arg[])
       {
                int i,j,n,num=1;
                char ch;
               Scanner sc=new Scanner(System.in);
               System.out.println("enter num");
               n=sc.nextInt();
               for(i=1;i<=n;i++)
               {
                         ch='A';
                         for(j=1;j<=n;j++)
                         {
                                if(i==1||i==n||j==1||j==n)
                                {
                                        System.out.print(ch);
                                        
                                }
                                else
                                {
                                       System.out.print(num);
                                       num++;
                                }
                                ch++;
                         }
                         System.out.println();
               }
       }
}