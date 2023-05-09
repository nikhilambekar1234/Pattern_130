import java.util.Scanner;
class p56
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
                         for(j=1;j<=i;j++)
                         {
                                if(i%2!=0)
                                {
                                          System.out.print(ch);
                                         
                                }
                                else
                                {
                                         System.out.print(num);
                                }
                         }
                      //ch++;
                         if(i%2==0)
                         {
                              num+=2;
                         }
                         else
                         {
                               ch+=2;
                         }
                         System.out.println();
               }
       }
}