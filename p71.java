import java.util.Scanner;
class p71
{
       public static void main(String arg[])
       {
                int i,j,k,n,num=1,no=1;
                char ch='A',temp;
               Scanner sc=new Scanner(System.in);
               System.out.println("enter num");
               n=sc.nextInt();
               for(i=1;i<=n;i++)
               {
                          for(j=1;j<=(n-i)+1;j++)
                         {
                               if(i==1||j==1||j==(n-i)+1)
                               {
                                     System.out.print("*");
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