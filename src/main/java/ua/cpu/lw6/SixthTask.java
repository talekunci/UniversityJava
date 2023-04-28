package ua.cpu.lw6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SixthTask {

    /**
     * second() invoke three times to show three different results described in the task condition.
     * */
    public static void main(String[] args) throws IOException {
        first();
        for (int i = 1; i <= 3; i++) {
            second();
        }
    }

    /*test text:
В Java есть примитивные типы данных (хранятся в стеке) и ссылочные типы (хранятся в куче). Примитивы – это всегда единичные числа, просто в разных вариациях.
    */
    private static void first() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        if (line == null) return;
        line = line.replaceAll("[.!?\\-()]", "");

        for (String s : line.split(" ")) {
            String lowerCase = s.toLowerCase();
            int count = lowerCase.length() - lowerCase.replaceAll("и", "").length();

            if (count >= 2) System.out.println(s);
        }
    }

    private static void second() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        if (line == null) return;

        int length = line.length();
        char[] chars = new char[length];
        line.getChars(0, length, chars, 0);

        int bracketCount = 0;
        for (int i = 0; i < length; i++) {
            if (chars[i] == '(') {
                if (bracketCount < 0) break;
                bracketCount--;
            } else if (chars[i] == ')') {
                bracketCount++;
                if (i == 0 || bracketCount > 0) {
                    System.out.println("Position: " + i);
                    System.out.println("There is no open bracket but there is already a closed bracket.");
                    return;
                }
            }
        }

        System.out.println(bracketCount);
    }

}
