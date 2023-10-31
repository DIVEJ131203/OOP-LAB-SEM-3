import java.util.Scanner;
interface market
{
    void sales();
}
class Hardware implements market

{     int monthly[]=new int[3];
    Scanner Scan=new Scanner(System.in);
    String category;
    String manufacturer;
    Hardware()
    {

        //constructor
        System.out.println("Enter the Category of hardware:");
        category=Scan.next();
        System.out.println("Enter the manufacturer");
        manufacturer=Scan.next();
        System.out.println("Enter the units sold for 3 months");
                for(int i=0;i<3;i++)
                {
                    monthly[i]= Scan.nextInt();
                }


    }

    @Override
     public void sales() {
        int total=0;
        for(int j=0;j<3;j++) {
            total += monthly[j];

        }
        System.out.println("Total Sales:"+total);
    }
}
class Software implements market

{     int monthly[]=new int[3];
    Scanner Scan=new Scanner(System.in);
    String category;
    String manufacturer;
    Software()
    {

        //constructor
        System.out.println("Enter the Category of software:");
        category=Scan.next();
        System.out.println("Enter the manufacturer");
        manufacturer=Scan.next();
        System.out.println("Enter the units sold for 3 months");
        for(int i=0;i<3;i++)
        {
            monthly[i]= Scan.nextInt();
        }


    }

    @Override
    public void sales() {
        int total=0;
        for(int j=0;j<3;j++) {
            total += monthly[j];

        }
        System.out.println("Total Sales:"+total);
    }
}
public class company
{
    public static void main(String args[])
    {
        market m= new Hardware();
        m.sales();
        market m1= new Software();
        m1.sales();

    }
}
