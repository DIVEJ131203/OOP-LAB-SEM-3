import java.util.Scanner;
public class principal
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
 
        int sumnp=0,sump=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
              if((i+j)==(m-1))
              {
                  System.out.println(arr[i][j]+" ");
                  sumnp+=arr[i][j];
              }
if(i==j)
sump+=arr[i][j];
            }
        }
        System.out.println(sumnp+" "+sump);
    }
}