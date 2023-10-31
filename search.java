import java.util.*;
public class search {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter number of elements");
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i:arr)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("enter number to be searched");
        int ele=in.nextInt();
        for(int i:arr)
        {
            if(i==ele)
            {
                System.out.println("element found at position "+i);
            }
        }
    }
}