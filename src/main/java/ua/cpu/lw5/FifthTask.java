package ua.cpu.lw5;

public class FifthTask {

    public static void main(String[] args) {
        testNumber();
        testFraction();
    }

    private static void testNumber() {
        final int FIRST_VAL = 101;
        final int SECOND_VAL = 54;

        Number number = new Number(FIRST_VAL);
        Number number1 = new Number(SECOND_VAL);

        Number added = number.add(number1);
        if (added.getValue() == (FIRST_VAL + SECOND_VAL)) {
            System.out.println("Number.add() success");
        } else {
            System.out.println("Number.add() failure");
            System.out.println("Result is: " + added.getValue());
            System.out.println("But must be: " + (FIRST_VAL + SECOND_VAL));
        }

        Number subtracted = number.subtract(number1);
        if (subtracted.getValue() == (FIRST_VAL - SECOND_VAL)) {
            System.out.println("Number.subtract() success");
        } else {
            System.out.println("Number.subtract() failure");
            System.out.println("Result is: " + subtracted.getValue());
            System.out.println("But must be: " + (FIRST_VAL - SECOND_VAL));
        }

        Number reverseSubtract = number1.subtract(number);
        if (reverseSubtract.getValue() == (SECOND_VAL - FIRST_VAL)) {
            System.out.println("Reverse Number.subtract() success");
        } else {
            System.out.println("Reverse Number.subtract() failure");
            System.out.println("Result is: " + reverseSubtract.getValue());
            System.out.println("But must be: " + (SECOND_VAL - FIRST_VAL));
        }
    }

    private static void testFraction() {
        final Fraction f1 = new Fraction(10, 12);
        final Fraction f2 = new Fraction(4, 6);
        final int LCM = 12;
        final int added_numerator = 18;
        final int subtracted_numerator = 2;

        Fraction added = f1.add(f2);
        if (added.getNumerator() == added_numerator && added.getDenominator() == LCM) {
            System.out.println("Fraction.add() success");
        } else {
            System.out.println("Fraction.add() failure");
            System.out.printf("Result is: numerator = %d; denominator = %d%n",
                    added.getNumerator(), added.getDenominator()
            );
            System.out.printf("But must be: numerator = %d; denominator = %d%n",
                    added_numerator, LCM
            );
        }

        Fraction subtract1 = f1.subtract(f2);
        if (subtract1.getNumerator() == subtracted_numerator && subtract1.getDenominator() == LCM) {
            System.out.println("Fraction.subtract() success");
        } else {
            System.out.println("Fraction.subtract() failure");
            System.out.printf("Result is: numerator = %d; denominator = %d%n",
                    subtract1.getNumerator(), subtract1.getDenominator()
            );
            System.out.printf("But must be: numerator = %d; denominator = %d%n",
                    subtracted_numerator, LCM
            );
        }

        Fraction subtract2 = f2.subtract(f1);
        if (subtract2.getNumerator() == -subtracted_numerator && subtract2.getDenominator() == LCM) {
            System.out.println("Reverse Fraction.subtract() success");
        } else {
            System.out.println("Reverse Fraction.subtract() failure");
            System.out.printf("Result is: numerator = %d; denominator = %d%n",
                    subtract2.getNumerator(), subtract2.getDenominator()
            );
            System.out.printf("But must be: numerator = %d; denominator = %d%n",
                    -subtracted_numerator, LCM
            );
        }
    }

}
