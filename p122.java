import java.util.Scanner;
class p122
{
       public static void main(String arg[])
       {
                int i,j,k,n,num=1;
                char ch='Z';
               Scanner sc=new Scanner(System.in);
               System.out.println("enter num");
               n=sc.nextInt();
               for(i=1;i<=n;i++)
               {
                         for(j=1;j<=(n-i);j++)
                         {
                                System.out.print(" ");
                         }
                         for(k=1;k<=(2*i)-1;k++)
                         {
                                if(i%2!=0)
                                {
                                       System.out.print(num);
                                       num++;
                                }
                                else
                                {
                                       System.out.print(ch);
                                       ch--;
                                }
                               
                         }
                         System.out.println();
               }
               
       }
}