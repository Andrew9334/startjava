package com.startjava.lesson_1.base;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int counter = -10;
        int sumOdd = 0;
        int sumEven = 0;

        do {
            if (counter % 2 == 0) {
                sumOdd += counter;
            } else if (counter % 2 != 0) {
                sumEven += counter;
            }
            counter++;
        } while (counter <= 21);

        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + sumOdd + ", а нечетных = " + sumEven);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");

        int num1 = 5;
        int num2 = -1;
        int num3 = 10;
        int min = num3;
        int max = num1;

        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        if (num1 < min) {
            min = num1;
        }
        if (num2 < min) {
            min = num2;
        }

        System.out.println("Интервал между " + '(' + max + ',' + min + ')' + ':');
        for (int i = (max - 1); i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");

        int num4 = 1234;
        int reversed = 0;
        int sum = 0;

        while (num4 != 0) {
            reversed = (reversed * 10) + num4 % 10;
            sum += reversed % 10;
            num4 /= 10;
        }

        System.out.println("Исходное число в обратном порядке - " + reversed + '\n' +
                "Сумма цифр числа = " + sum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int startRange = 1;
        int endRange = 24;
        int numberOfNumbersPerLine = 0;

        for (int i = startRange; i < endRange; i += 2) {
            System.out.printf("%4d", i);
            numberOfNumbersPerLine++;
            if (numberOfNumbersPerLine == 5) {
                numberOfNumbersPerLine = 0;
                System.out.println();
            }
        }
        if (numberOfNumbersPerLine > 0) {
            for (int j = startRange; j <= (5 - numberOfNumbersPerLine); j++) {
                System.out.printf("%4d", 0);
            }
        }

        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность");

        int num7 = 3242592;
        int countTwos = 0;
        int copyNum7 = num7;

        while (num7 > 0) {
            if ((num7 % 10) == 2) {
                countTwos++;
            }
            num7 /= 10;
        }

        System.out.print("Число " + copyNum7 + " содержит ");

        if (countTwos % 2 == 0) {
            System.out.print(countTwos + " (четное) количество двоек");
        } else {
            System.out.print(countTwos + " (нечетное) количество двоек");
        }

        System.out.println("\n\n6. Отображение фигур в консоли\n");
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 11; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println();

        int numberOfColumns = 5;
        int numberOfLines = numberOfColumns;

        while (numberOfLines >= 1) {
            int j = 1;
            while (j <= numberOfLines) {
                System.out.print('#');
                j++;
            }
            System.out.println();
            numberOfLines--;
        }

        System.out.println();

        numberOfColumns = 1;
        numberOfLines = 0;
        int apexOfTriangle = 3;

        do {
            int j = numberOfLines;
            do {
                System.out.print('$');
                j++;
            } while (j < numberOfColumns);
            System.out.println();
            numberOfColumns++;
        } while (numberOfColumns <= apexOfTriangle);

        numberOfLines = 1;

        do {
            int j = apexOfTriangle - 1;
            do {
                System.out.print('$');
                j--;
            } while (j > 0);
            System.out.println();
            apexOfTriangle--;
        } while (numberOfLines < apexOfTriangle);

        System.out.println("\n7. Отображение ASCII-символов");

        System.out.printf("%4s %8s \n", "Dec", "Char");
        for (int i = 0; i < 128; i++) {
            if (i < 48 && i % 2 != 0) {
                System.out.printf("%3d %8c \n", i, i);
            }

            if (i > 96 && i < 123 && i % 2 == 0) {
                System.out.printf("%3d %8c \n", i, i);
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");

        int num8 = 1234321;
        int reverse = 0;
        int copyNum8 = num8;

        while (num8 > 0) {
            int digit = num8 % 10;
            reverse = reverse * 10 + digit;
            num8 /= 10;
        }

        if (copyNum8 == reverse) {
            System.out.println("Число " + copyNum8 + " является палиндромом");
        } else {
            System.out.println("Число " + copyNum8 + " не является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым");

        int numberToCheck = 123796;
        int sumLeftHalf = 0;
        int sumRightHalf = 0;
        int leftHalf = numberToCheck / 1000;
        int rightHalf = numberToCheck % 1000;
        System.out.println(leftHalf);
        System.out.println(rightHalf);

        while (leftHalf != 0 && rightHalf != 0) {
            sumLeftHalf = (leftHalf % 10) + sumLeftHalf;
            sumRightHalf = (rightHalf % 10) + sumRightHalf;
            leftHalf /= 10;
            rightHalf /= 10;
        }

        System.out.println("Сумма цифр sumLeftHalf = " + sumLeftHalf);
        System.out.println("Сумма цифр sumRightHalf = " + sumRightHalf);

        if (sumLeftHalf == sumRightHalf) {
            System.out.println("Число - " + numberToCheck + " является счастливым числом");
        } else {
            System.out.println("Число - " + numberToCheck + " не является счастливым числом");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");

        for (int i = 1; i < 10; i++) {
            if (i == 2) {
                System.out.println("   -----------------------------------");
            }
            for (int j = 1; j < 10; j++) {
                if (j == 1 && i == 1) {
                    System.out.print("    ");
                } else {
                    System.out.printf("%4d", i * j);
                }
                if (j == 1 && j < 10) {
                    System.out.print("|");
                }
            }
        System.out.println();
        }
    }
}