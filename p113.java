import java.util.Scanner;
class p113
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
                         num=1;
                         for(j=1;j<i;j++)
                         {
                                System.out.print(" ");
                         }
                         for(k=1;k<=(n-i)+1;k++)
                         {
                                if(i%2!=0)
                               {
                                      System.out.print(num);
                                      num++;
                               }
                               else
                               {
                                      System.out.print(ch);
                               }
                                
                         }
                         if(i%2==0)
                        {
                                ch++;
                         }
                         System.out.println();
               }
      }
}