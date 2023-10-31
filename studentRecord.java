import java.util.Scanner;
class Student
{
    double regNo;
    int age;
    String name;
    Student()
    {
        //constructor
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your REGISTRATION NUMBER");
        regNo=sc.nextDouble();
        System.out.println("Enter your NAME");
        name=sc.nextLine();
        System.out.println("Enter your AGE");
        age=sc.nextInt();
    }
}
class UG extends Student
{
    Scanner sc = new Scanner(System.in);
    int Semester;
    double Fees;
    UG()
    {
        System.out.println("Enter the Semester");
        Semester=sc.nextInt();
        System.out.println("Enter the Fees");
        Fees=sc.nextInt();
       }
}
class PG extends Student
{
    Scanner sc = new Scanner(System.in);
    int Semester;
    double Fees;
    PG()
    {
        System.out.println("Enter the Semester");
        Semester=sc.nextInt();
        System.out.println("Enter the Fees");
        Fees=sc.nextInt();
    }
}

public class studentRecord {
    public static void main(String args[])
    {
        PG objpg = new PG();
        UG objug = new UG();

        
    }

}
