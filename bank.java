import java.util.Scanner;
class Account{
    Scanner sc =new Scanner(System.in);
    String name;
    int number;
    String type;
    double balance;
    Account()
    {
        //constructor
        System.out.println("Enter name of customer");
        name=sc.nextLine();
        System.out.print("Your account number is");
        number=computeAccount();
        System.out.println(this.number);
    }
    int computeAccount()
    {
        this.number=123456789;
        for(int i=0;i<this.name.length();i++)
        {
            this.number=this.number+(int)(this.name).charAt(i);
        }
        return number;
    }
    void deposit(int value)
    {
        balance+=value;
        System.out.println(value+ " deposited");
    }
    void withdraw(int value){
        if(balance<value){
            System.out.println("Insufficient Funds!");
            return;
        }
        balance-=value;
    }
    void display(){
        System.out.println("The balance in your account is:"+balance);
    }

};
class Savings extends Account{
    Savings(){
        super();
        System.out.println("The account type selected is Savings");
        this.type="Savings";
        System.out.println("Enter the amount to deposit:");
        deposit(sc.nextInt());
        Interest();
    }
    void Interest(){
        balance+=(0.06*balance);
    }
};

class Current extends Account{
    Current(){
        super();
        System.out.println("The account type selected is Current. MAB is Rs.10000");
        this.type="Current";
        System.out.println("Enter the amount to deposit:");
        deposit(sc.nextInt());
        Service();
    }
    void Service(){
        if(this.balance<10000){
            balance*=0.9;
        }
    }
};
public class bank {
    public static void main(String args[])
    {
        Savings s1=new Savings();
        s1.deposit(10000);
    }
}
