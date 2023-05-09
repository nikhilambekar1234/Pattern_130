import java.util.Scanner;
class p94
{
       public static void main(String arg[])
       {
                int i,j,n,num=1;
                char ch='A';
               Scanner sc=new Scanner(System.in);
               System.out.println("enter num");
               n=sc.nextInt();
               for(i=1;i<=n;i++)
               {
                          num=1;
                         for(j=1;j<=i;j++)
                         {
                                if(j%2!=0)
                               {
                                       System.out.print(num);
                                          num++;
                               }
                               else
                              {
                                       System.out.print(ch);
                                       ch++;
                              }
                        }
                        System.out.println();
               }
              
               for(i=n-1;i>=1;i--)
               {
                          num=1;
                         for(j=1;j<=i;j++)
                         {
                                 if(j%2!=0)
                               {
                                       System.out.print(num);
                                       num++;
                               }
                               else
                              {
                                       System.out.print(ch);
                                       ch++;
                              }
                        }
                         System.out.println();
              }
       }
}