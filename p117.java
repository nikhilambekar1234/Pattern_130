import java.util.Scanner;
class p117
{
       public static void main(String arg[])
       {
                int i,j,k,n,num;
                char ch='A';
               Scanner sc=new Scanner(System.in);
               System.out.println("enter num");
               n=sc.nextInt();
               for(i=1;i<=n;i++)
               {
                         
                         for(j=1;j<i;j++)
                         {
                                System.out.print(" ");
                         }
                         for(k=1;k<=(n-i)+1;k++)
                         {
                                if(i==1||k==(n-i)+1)
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