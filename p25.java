import java.util.Scanner;
class p25
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
                         num++;
                         if(i%2!=0)
                         {
                              ch++;
                         }
                         System.out.println();
               }
       }
}