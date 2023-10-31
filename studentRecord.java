import java.util.Scanner;
class studentDetail
{
    Scanner sc = new Scanner(System.in);
 String name;
 int id;
 String college_name ;
 studentDetail()
 {
     //constructor
     System.out.println("Enter your COLLEGE NAME");
     college_name=sc.next();
     System.out.println("Enter your college id:");
     id=sc.nextInt();
     System.out.println("Enter your NAME");
     name=sc.next();

 }
 void display_details()
 {
     System.out.println(name);
     System.out.println(id);
     System.out.println(college_name);
 }
}
public class studentRecord
{
    public static void main(String args[])
    {
        studentDetail obj1=new studentDetail();
        studentDetail obj2=new studentDetail();
        obj1.display_details();
        obj2.display_details();
    }
}
