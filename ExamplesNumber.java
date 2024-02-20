interface Number {
    int numerator();
    int denominator();
    Number add(Number other);
    Number multiply(Number other);
    Number getMax(Number other);
    String toString();
    double toDouble();
}

class WholeInteger implements Number {
    private int n;

    public WholeInteger(int n) {
        this.n = n;
    }

    public int numerator() {
        return n;
    }

    public int denominator() {
        return 1;
    }

    public Number add(Number other) {
        int newNumerator = this.numerator() * other.denominator() + other.numerator() * this.denominator();
        int newDenominator = this.denominator() * other.denominator();
        return newNumerator % newDenominator == 0 ? new WholeInteger(newNumerator / newDenominator) : new Fraction(newNumerator, newDenominator);
    }

    public Number multiply(Number other) {
        int newNumerator = this.numerator() * other.numerator();
        int newDenominator = this.denominator() * other.denominator();
        return newNumerator % newDenominator == 0 ? new WholeInteger(newNumerator / newDenominator) : new Fraction(newNumerator, newDenominator);
    }

    public Number getMax(Number other) {
        return this.toDouble() >= other.toDouble() ? this : other;
    }

    public String toString() {
        return String.valueOf(n);
    }

    public double toDouble() {
        return (double) n;
    }
}

class Fraction implements Number {
    private int n;
    private int d;

    public Fraction(int n, int d) {
        this.n = n;
        this.d = d;
    }

    public int numerator() {
        return n;
    }

    public int denominator() {
        return d;
    }

    public Number add(Number other) {
        int newNumerator = this.numerator() * other.denominator() + other.numerator() * this.denominator();
        int newDenominator = this.denominator() * other.denominator();
        return newNumerator % newDenominator == 0 ? new WholeInteger(newNumerator / newDenominator) : new Fraction(newNumerator, newDenominator);
    }

    public Number multiply(Number other) {
        int newNumerator = this.numerator() * other.numerator();
        int newDenominator = this.denominator() * other.denominator();
        return newNumerator % newDenominator == 0 ? new WholeInteger(newNumerator / newDenominator) : new Fraction(newNumerator, newDenominator);
    }

    public Number getMax(Number other) {
        return this.toDouble() >= other.toDouble() ? this : other;
    }

    public String toString() {
        return n + "/" + d;
    }

    public double toDouble() {
        return (double) n / d;
    }
}

public class ExamplesNumber {
    public static void main(String[] args) {
        // The result of 0.1 + 0.2 + 0.3 using built-in double arithmetic in Java
        double result1 = 0.1 + 0.2 + 0.3;
        // The result of 0.1 + (0.2 + 0.3) using built-in double arithmetic in Java
        double result2 = 0.1 + (0.2 + 0.3);

        // The result of (1) using your exact fractions, showing the result via toString()
        Number fraction1 = new Fraction(1, 10).add(new Fraction(2, 10)).add(new Fraction(3, 10));
        // The result of (2) using your exact fractions, showing the result via toString()
        Number fraction2 = new Fraction(1, 10).add(new Fraction(2, 10).add(new Fraction(3, 10)));

        System.out.println("The result of 0.1 + 0.2 + 0.3 using built-in double arithmetic in Java: " + result1);
        System.out.println("The result of 0.1 + (0.2 + 0.3) using built-in double arithmetic in Java: " + result2);
        System.out.println("The result of (1) using your exact fractions, showing the result via toString(): " + fraction1.toString());
        System.out.println("The result of (2) using your exact fractions, showing the result via toString(): " + fraction2.toString());
    }
}
