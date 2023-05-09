import java.util.Scanner;
class p132
{
       public static void main(String arg[])
       {
                int i,j,k,n,num=2;
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
                                
                                System.out.print(num%2);
                                num++;
                         }
                         System.out.println();
               }
      }
}