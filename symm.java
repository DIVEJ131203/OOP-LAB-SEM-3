import java.util.*;
public class symm
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("enter dimensions of array");
        int m=in.nextInt();
        int n=in.nextInt();
        int arr[][]=new int[m][n];
        System.out.println("enter m*n elements");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=in.nextInt();
            }
        }
for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
              
              
                  System.out.print(arr[i][j]+" ");
                  
              
            }
System.out.println();
        }
int b[][]=new int[m][n];
for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
              
              
                  b[i][j]=arr[j][i];
                  
              
            }
}
int c=0;
for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
              
              
                  if(arr[i][j]==b[i][j])
c++;
                  
              
            }
}
if(c==(m*n))
System.out.println("it is symmetric");
else
System.out.println("it is not symmetric");
}}
