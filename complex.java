public class Complex {
    private double real;
    private double imaginary;
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public Complex add(int num) {
        return new Complex(this.real + num, this.imaginary);
    }
    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }
    public void display() {
        System.out.println(this.real + " + " + this.imaginary + "i");
    }

    public static void main(String[] args) {
        Complex complex1 = new Complex(3.0, 2.0);
        Complex complex2 = new Complex(1.5, 4.5);
        Complex result1 = complex1.add(5);
        System.out.print("Result 1: ");
        result1.display();
        Complex result2 = complex1.add(complex2);
        System.out.print("Result 2: ");
        result2.display();
    }
}