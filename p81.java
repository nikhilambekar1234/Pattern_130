import java.util.Scanner;
class p81
{
       public static void main(String arg[])
       {
                int i,j,k,n,num=1;
                char ch;
               Scanner sc=new Scanner(System.in);
               System.out.println("enter num");
               n=sc.nextInt();
               for(i=1;i<=n;i++)
               {
                         ch='A';
                         for(j=1;j<=(n-i);j++)
                         {
                                System.out.print(" ");
                         }
                         for(k=1;k<=i;k++)
                         {
                                  if(i%2!=0)
                                  {
                                           System.out.print("* ");
                                  }
                                  else
                                 {
                                          System.out.print(ch+" ");
                                          ch++;
                                 }
                         }
                         System.out.println();
               }
       }
}