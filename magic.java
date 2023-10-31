import java.util.Scanner;
public class magic
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
 
        int sumnp=0,sump=0,rows=0,col=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
              if((i+j)==(m-1))
              {
                  
                  sumnp+=arr[i][j];
              }
            if(i==j)
            sump+=arr[i][j];
            rows+=arr[i][j];
            col+=arr[j][i];
            }
        
        }
System.out.println(sumnp+" "+sump+" "+rows+" "+col);
if((sump==rows)&&(rows==col)&&(col==sumnp))
System.out.println("it is a magic square");
else
System.out.println("not a magic square");
}}
         