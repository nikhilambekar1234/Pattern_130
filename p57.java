import java.util.Scanner;
class p57
{
       public static void main(String arg[])
       {
                int i,j,n,num=1,no=1;
                char ch='A';
               Scanner sc=new Scanner(System.in);
               System.out.println("enter num");
               n=sc.nextInt();
               for(i=1;i<=n;i++)
               {
                         for(j=1;j<=i;j++)
                         {
                                if(no%2!=0)
                                {
                                          System.out.print(ch);
                                          ch++;
                                }
                                else
                                {
                                          System.out.print(num);
                                          num++;
                                }
                                no++;
                         }
                         System.out.println();
               }
       }
}