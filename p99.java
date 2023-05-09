import java.util.Scanner;
class p99
{
       public static void main(String arg[])
       {
                int i,j,k,n,num=0;
                char ch='A',temp;
               Scanner sc=new Scanner(System.in);
               System.out.println("enter num");
               n=sc.nextInt();
               for(i=1;i<=n;i++)
               {
                         ch+=num;
                         temp=ch;
                         for(j=1;j<=(n-i);j++)
                         {
                                System.out.print(" ");
                         }
                         for(k=1;k<=i;k++)
                         {
                                   System.out.print(temp);
                                   temp--;
                         }
                         num++;
                         System.out.println();
               }
       }
}