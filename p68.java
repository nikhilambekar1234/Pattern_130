import java.util.Scanner;
class p68
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
                               if(num%2!=0)
                               {
                                     System.out.print(no);
                                     no++;
                                     
                               }
                               else
                               {
                                      System.out.print(ch);
                                      ch++;
                               }
                               num++;
                         }
                        System.out.println();
               }
       }
}