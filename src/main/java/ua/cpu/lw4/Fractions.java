package ua.cpu.lw4;

/**
 * This class contains only static methods for operations on objects of Fraction.class
 * */
public class Fractions {

    private Fractions() {
    }

    /**
     * If fractions have the same denominator, the method just adds them,
     * but if denominators are different this method finds the least common multiple
     * by another method and then adds both fractions.
     * */
    public static Fraction add(Fraction f1, Fraction f2) {
        if (f1.getDenominator() == f2.getDenominator()) {
            int numeratorsSum = f1.getNumerator() + f2.getNumerator();

            return new Fraction(numeratorsSum, f1.getDenominator());
        } else {
            int lcm = lcm(f1, f2);

            int m1 = lcm / f1.getDenominator();
            int m2 = lcm / f2.getDenominator();

            int newNumerator = (f1.getNumerator() * m1) + (f2.getNumerator() * m2);

            return new Fraction(newNumerator, lcm);
        }
    }

    /**
     * If fractions have the same denominator, the method just subtracts them,
     * but if denominators are different this method finds the least common multiple
     * by another method and then subtracts both fractions.
     * */
    public static Fraction subtract(Fraction f1, Fraction f2) {
        if (f1.getDenominator() == f2.getDenominator()) {
            int numeratorsSum = f1.getNumerator() - f2.getNumerator();

            return new Fraction(numeratorsSum, f1.getDenominator());
        } else {
            int lcm = lcm(f1, f2);

            int m1 = lcm / f1.getDenominator();
            int m2 = lcm / f2.getDenominator();

            int newNumerator = (f1.getNumerator() * m1) - (f2.getNumerator() * m2);

            return new Fraction(newNumerator, lcm);
        }
    }

    /**
     * This method finds the least common multiple and returns it.
    * */
    public static int lcm(Fraction fraction1, Fraction fraction2) {
        int number1 = fraction1.getDenominator();
        int number2 = fraction2.getDenominator();

        if (number1 == 0 || number2 == 0) {
            return 0;
        }

        int absNumber1 = Math.abs(number1);
        int absNumber2 = Math.abs(number2);

        int absHigherNumber = Math.max(absNumber1, absNumber2);
        int absLowerNumber = Math.min(absNumber1, absNumber2);

        int lcm = absHigherNumber;
        while (lcm % absLowerNumber != 0) {
            lcm += absHigherNumber;
        }

        return lcm;
    }

}
