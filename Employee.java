public class Employee {
    private String employeeName;
    private String city;
    private double basicSalary;
    private double daPercentage;
    private double hraPercentage;

   
    public Employee(String employeeName, String city, double basicSalary, double daPercentage, double hraPercentage) {
        this.employeeName = employeeName;
        this.city = city;
        this.basicSalary = basicSalary;
        this.daPercentage = daPercentage;
        this.hraPercentage = hraPercentage;
    }
    public double calculateTotalSalary() {
       
        double daAmount = (daPercentage / 100) * basicSalary;
        double hraAmount = (hraPercentage / 100) * basicSalary;
        double totalSalary = basicSalary + daAmount + hraAmount;
        return totalSalary;
    }

    public void display() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("City: " + city);
        System.out.println("Basic Salary: $" + basicSalary);
        System.out.println("Total Salary: $" + calculateTotalSalary());
    }

    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", "New York", 50000.0, 10.0, 20.0);
        employee.display();
    }
}