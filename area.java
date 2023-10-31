import java.util.Scanner;

interface calc
{
    void area();
}
class rectangle
{
    Scanner scan=new Scanner(System.in);
    int legnth,breadth;
    rectangle()
    {
        System.out.println("Enter the legnth and breadth ");
        legnth=scan.nextInt();
        breadth=scan.nextInt();
    }
    public int area(int area)
    {
        return 2*legnth*breadth;
    }
    class circle
    {
        Scanner scan=new Scanner(System.in);
        double radius;
        circle()
        {
            System.out.println("Enter the radius");
            radius=scan.nextInt();
        }
        public int area(double area)
        {
            return 3.14*radius*radius;
        }

}
public class area {
        public static void main(String args[])
        {
            calc obj1=new rectangle();
            calc obj2=new circle();
            obj1.area();

            System.out.println(area);
            obj2.area();
            System.out.println(area);

        }
}
}
