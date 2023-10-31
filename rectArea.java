  import java.util.Scanner;
public class rectArea
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        double l,b,a,d;
        System.out.println("Enter length and breadth of rectangle");
        l=sc.nextDouble();
        b=sc.nextDouble();
        a=l*b;
        System.out.println(" Area of the rectangle:"+a);
        d=2*(l+b);
        System.out.println(" Circumference of the rectangle:"+d);
    }
}