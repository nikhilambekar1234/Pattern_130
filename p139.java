import java.util.Scanner;
class p139
{
       public static void main(String arg[])
       {
                int i,j,k,n,num1,num2;
                char ch='A',temp;
               Scanner sc=new Scanner(System.in);
               System.out.println("enter num");
               n=sc.nextInt();
               for(i=1;i<=n;i++)
               {
                          num2=n;
                          num1=i;
                          for(j=1;j<=(n-i)+1;j++)
                         {
                                System.out.print(num1);
                                num1++;
                         }
                         for(k=2;k<i;k++)
                         {
                                System.out.print(" ");
                         }
                          for(k=1;k<i;k++)
                         {
                                System.out.print(" ");
                         }
                          for(j=1;j<=(n-i)+1;j++)
                         {
                                
                                if(j==1&&i==1)
                                {

                                }
                                else
                                {
                                          System.out.print(num2);
                                        
                                }
                                 num2--;
                         }
                         System.out.println();
             }
       }
}