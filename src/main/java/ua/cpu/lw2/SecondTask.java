package ua.cpu.lw2;

import static java.lang.Math.pow;

//The Second task 1
public class SecondTask {

    private static final SecondTask task = new SecondTask();

    public static void main(String[] args) {
        task.arithmOperators();
        task.logicOperators();
    }

    private void logicOperators() {
        System.out.println("\tSecond exercise");
        System.out.println("-------------------Start--------------------");
        new LogicOperators().exercise();
        System.out.println("------------------The End-------------------");

    }

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

    //    Перше завдання
    static class ArithmOperators {

        //      Вхідні змінні з фіксованими значеннями
        private final short a = 1000;
        private final short b = 500;
        private final byte modulo = 8;

        //      Без використання проміжних змінних
        void firstSolution() {
            System.out.printf("a = %d,%n" +
                            "b = %d,%n" +
                            "result = %f%n",
                    a,
                    b,
                    (pow(a, 3) - a * pow(b, 2)) / (pow((7 * a), 2) + pow(b, 2))
            );
        }

        //      З використанням проміжних змінних
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

        //        Обчислення арифметичного виразу
        private float calcArithmExp() {
            float denominator = (float) (pow(a, 3) - a * pow(b, 2));
            float numerator = (float) (pow((7 * a), 2) + pow(b, 2));

            return denominator / numerator;
        }

        //        Ділення по модулю
        float divisionByModulo(int modulo, float value) {
            return value % modulo;
        }
    }

    //    Друге завдання
    static class LogicOperators {
        private final int d;
        private final int m;

//        Ініціалізація змінних
        {
            d = ~(27 % 16) & 0xf;
            m = 2 & 0xf;
            System.out.printf("d = %d, " +
                    "m = %d%n",
                    d, m
            );
        }

//        Завдання та вивід результату в консоль
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