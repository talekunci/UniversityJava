package ua.cpu.lw2;

import static java.lang.Math.pow;

/**
 * The Second task
 * */
public class SecondTask {

/**
 * Main object
 * */
    private static final SecondTask task = new SecondTask();

    /**
     * arithmOperators() does first exercise
     * and logicOperators() does second exercise*/
    public static void main(String[] args) {
        task.arithmOperators();
        task.logicOperators();
    }

    /**
    * Create an object and invoking its method and formatting output
    * */
    private void logicOperators() {
        System.out.println("\tSecond exercise");
        System.out.println("-------------------Start--------------------");
        new LogicOperators().exercise();
        System.out.println("------------------The End-------------------");

    }

    /**
     * Here are invoking of three methods, for each exercises of this part of task.
     * The first - counting an expression into print method arguments.
     * Second one - counting an expression using temp vars ant then printing.
     * And the last - division previous expression's result by modulo on the fixed value '8'.
     * */
    private void arithmOperators() {
        ArithmOperators arithmOperators = new ArithmOperators();

        System.out.println("\tFirst exercise");
        System.out.println("-------------------Start--------------------");
        arithmOperators.firstSolution();
        System.out.println();
        System.out.println(arithmOperators.secondSolution());
        System.out.println();
        System.out.println(arithmOperators.divisionByModulo(arithmOperators.modulo, arithmOperators.calcArithmExp()));
        System.out.println("------------------The End-------------------");
    }

    /**
     * Nested class for first part of the task.
     * */
    static class ArithmOperators {

        /**
         * Variables 'a' and 'b' are for counting an expression.
         * Var 'modulo' is fixed value for the part 'division by modulo'.
         * */
        private final short a = 1000;
        private final short b = 500;
        private final byte modulo = 8;

        /** First part where counting of the arithmetic expression into print() arguments. */
        void firstSolution() {
            System.out.printf("a = %d,%n" +
                            "b = %d,%n" +
                            "result = %f%n",
                    a,
                    b,
                    (pow(a, 3) - a * pow(b, 2)) / (pow((7 * a), 2) + pow(b, 2))
            );
        }

        /** Second part where counting is before print method invoking. */
        String secondSolution() {
            float denominator = (float) (pow(a, 3) - a * pow(b, 2));
            float numerator = (float) (pow((7 * a), 2) + pow(b, 2));
            float value = denominator / numerator;

            return String.format(
                    "a = %d,%n" +
                            "b = %d,%n" +
                            "result = %f",
                    a, b, value
            );
        }

        /** Separate method for counting an expression. In general created for the last part of the task. */
        private float calcArithmExp() {
            float denominator = (float) (pow(a, 3) - a * pow(b, 2));
            float numerator = (float) (pow((7 * a), 2) + pow(b, 2));

            return denominator / numerator;
        }

        /** Here is division by modulo*/
        float divisionByModulo(int modulo, float value) {
            return value % modulo;
        }
    }

    /** The second part of the task.
     * The variables of the class are rather complicated to initialize,
     * so that's happens in a separate initialization block.
     * */
    static class LogicOperators {
        private final int d;
        private final int m;

        {
            d = ~(27 % 16) & 0xf;
            m = 2 & 0xf;
            System.out.printf("d = %d, " +
                    "m = %d%n",
                    d, m
            );
        }

        /** The last exercise and printing the result. */
        void exercise() {
            int a = ~d & m;
            int b = a ^ d >> 2;
            int c = a | d << 4;
            int d = (a < b) ? 6 : 5;

            System.out.printf("a = %d, " +
                    "b = %d, " +
                    "c = %d, " +
                    "d = %d%n",
                    a, b, c, d
            );
        }
    }

}