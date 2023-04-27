package ua.cpu.lw5;

import java.util.Objects;

/**
 * This class represents proper and improper fractions and both of them are always simple.
 * */
public class Fraction extends Number {

    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("denominator is zero");
        }
        if (denominator < 0) {
            numerator *= -1;
            denominator *= -1;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this.numerator = 1;
        this.denominator = 2;
    }

    /**
     * If fractions have the same denominator, the method just adds them,
     * but if denominators are different this method finds the least common multiple
     * by another method and then adds both fractions.
     * */
    public final Fraction add(Fraction fraction) {
        if (this.getDenominator() == fraction.getDenominator()) {
            int numeratorsSum = this.getNumerator() + fraction.getNumerator();

            return new Fraction(numeratorsSum, this.getDenominator());
        } else {
            int lcm = lcm(fraction);

            int m1 = lcm / this.getDenominator();
            int m2 = lcm / fraction.getDenominator();

            int newNumerator = (this.getNumerator() * m1) + (fraction.getNumerator() * m2);

            return new Fraction(newNumerator, lcm);
        }
    }

    /**
     * If fractions have the same denominator, the method just subtracts them,
     * but if denominators are different this method finds the least common multiple
     * by another method and then subtracts both fractions.
     * */
    public final Fraction subtract(Fraction fraction) {
        if (this.getDenominator() == fraction.getDenominator()) {
            int numeratorsSum = this.getNumerator() - fraction.getNumerator();

            return new Fraction(numeratorsSum, this.getDenominator());
        } else {
            int lcm = lcm(fraction);

            int m1 = lcm / this.getDenominator();
            int m2 = lcm / fraction.getDenominator();

            int newNumerator = (this.getNumerator() * m1) - (fraction.getNumerator() * m2);

            return new Fraction(newNumerator, lcm);
        }
    }

    /**
     * This method finds the least common multiple and returns it.
     * */
    public int lcm(Fraction fraction2) {
        int number1 = this.getDenominator();
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

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public double getDouble() {
        return (double) numerator / denominator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fraction fraction)) return false;
        if (!super.equals(o)) return false;
        return numerator == fraction.numerator && denominator == fraction.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numerator, denominator);
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}
