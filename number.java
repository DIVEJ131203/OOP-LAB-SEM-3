public class Number {
    private double value;
    public Number(double value) {
        this.value = value;
    }

    public boolean isZero() {
        return value == 0;
    }

    public boolean isPositive() {
        return value > 0;
    }

    public boolean isNegative() {
        return value < 0;
    }


    public boolean isOdd() {
        return (int)value % 2 != 0;
    }


    public boolean isEven() {
        return (int)value % 2 == 0;
    }

    public boolean isPrime() {
        if (value <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

   
    public boolean isArmstrong() {
        int num = (int) value;
        int originalNum = num;
        int sum = 0;
        int numDigits = (int) Math.log10(num) + 1;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numDigits);
            num /= 10;
        }

        return sum == originalNum;
    }

    public static void main(String[] args) {
        Number num = new Number(123);

        System.out.println("Is zero? " + num.isZero());
        System.out.println("Is positive? " + num.isPositive());
        System.out.println("Is negative? " + num.isNegative());
        System.out.println("Is odd? " + num.isOdd());
        System.out.println("Is even? " + num.isEven());
        System.out.println("Is prime? " + num.isPrime());
        System.out.println("Is Armstrong? " + num.isArmstrong());
    }
}