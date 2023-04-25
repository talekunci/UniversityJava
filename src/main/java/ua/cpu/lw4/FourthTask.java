package ua.cpu.lw4;

public class FourthTask {

    public static void main(String[] args) {
        Fraction fraction = new Fraction(12,13);
        Fraction fraction1 = new Fraction(8, 9);

        System.out.println("Fraction objects:");
        System.out.println(fraction);
        System.out.println(fraction1);
        System.out.println();

        System.out.println("Operation 'add': " + Fractions.add(fraction, fraction1));
        System.out.println("Operation 'subtract': " + Fractions.subtract(fraction, fraction1));
    }

}
