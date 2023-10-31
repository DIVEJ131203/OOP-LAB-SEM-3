import java.util.Scanner;
class Bank1 {
    int interest = 10;
    //assigning value to show dynamic method dispatch
    Scanner sc = new Scanner(System.in);

    int getRateOfInterest() {
        return interest;
    }
}

class SBI
{
    int interest=8;
    int getRateOfInterest()
    {
        return interest;
    }

}

class ICICI
{
    int interest=9;
    int getRateOfInterest()
    {
        return interest;
    }

}

class AXIS
{
    int interest=7;
    int getRateOfInterest()
    {
        return interest;
    }

}


public class interest {
public static void main(String args[])
{
   ICICI obj1=new ICICI();
   SBI obj2=new SBI();
   Bank1 obj3=new Bank1();
   AXIS obj4=new AXIS();

    System.out.println(obj1.getRateOfInterest());
    System.out.println(obj2.getRateOfInterest());
    System.out.println(obj3.getRateOfInterest());
    System.out.println(obj4.getRateOfInterest());

}
}
