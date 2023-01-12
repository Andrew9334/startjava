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
        } while (-10 <= counter & counter <= 21);

        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + sumOdd + ", а нечетных = " + sumEven);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");

        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int min = 0;
        int max = 0;

        if (num1 > num2 && num1 > num3 && num2 > num3) {
            max = num1;
            min = num3;
        } else {
            max = num2;
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
            int digit = num4 % 10;
            reversed = reversed * 10 + digit;
            sum += digit;
            num4 /= 10;
        }

        System.out.println("Исходное число в обратном порядке - " + reversed);
        System.out.println("Сумма цифр числа = " + sum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int num5 = 1;
        int max1 = 24;
        int count1 = 0;
        for (int i = num5; i < max1; i += 2) {
            System.out.printf("%4d", i);
            count1++;
            if (count1 == 5) {
                count1 = 0;
                System.out.print('\n');
            }
            if (i == (max1 - 1)) {
                for (int j = 0; j < (5 - count1); j++) {
                    System.out.printf("%4d", 0);
                }
            }
        }

        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность");
        int num7 = 3242592;
        int count2 = 0;

        while (num7 != 0){
            int digit = num7 % 10;
            if (digit == 2) {
                count2 += 1;
            }
            num7 /= 10;
        }

        num7 = 3242592;
        if (count2 % 2 == 0){
            System.out.println("Число " + num7 + " содержит " + count2 + " (четное) количество двоек");
        } else{
            System.out.println("Число " + num7 + " содержит " + count2 + " (нечетное) количество двоек");
        }

        System.out.println("\n6. Отображение фигур в консоли");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 11; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        int upperLine = 5;
        int bottomLine = upperLine;
        while (bottomLine >= 1) {
            int j = 1;
            while (j <= bottomLine) {
                System.out.print("#");
                j++;
            }
            System.out.println("");
            bottomLine--;
        }

        System.out.println();

        int upperBound = 1;
        int vertexTriangle = 4;
        do {
            if (upperBound < vertexTriangle) {
                System.out.println('$');
            }
            upperBound++;
            if (upperBound < vertexTriangle) {
                System.out.println("$$");
                upperBound++;
            }
            if (upperBound < vertexTriangle) {
                System.out.println("$$$");
                upperBound++;
            }
        } while (upperBound <= vertexTriangle);

        int lowerBound = 1;
        do {
            if (vertexTriangle > lowerBound) {
                System.out.println("$$");
            }
            vertexTriangle--;
            if (vertexTriangle > lowerBound) {
                System.out.println('$');
            }
            vertexTriangle -= 2;
        } while (vertexTriangle >= lowerBound);

        System.out.println();

        System.out.println("\n7. Отображение ASCII-символов");

        System.out.println("Dec Char");
        for (int i = 0; i < 128; i++) {
            if (i < 48 && i % 2 != 0) {
                System.out.printf("%3d %8c \n", i, (char) i);
            }
            if (i > 96 && i < 123 && i % 2 == 0) {
                System.out.printf("%3d %8c \n", i, (char) i);
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");

        int num8 = 1234321;
        int initial = 0;
        int revers = 0;
        int temp = num8;

        while (num8 != 0) {
            initial = num8 % 10;
            revers = revers * 10 + initial;
            num8 /= 10;
        }

        if (temp == revers) {
            System.out.println("Число " + temp + " является палиндромом");
        } else {
            System.out.println("Число " + temp + " не является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым");

        int num9 = 123796;
        int sumFirstHalf = 0;
        int sumSecondHalf = 0;
        int temp2 = num9 / 1000;
        int temp3 = num9 % 1000;

        while (temp2 != 0) {
            sumFirstHalf = (temp2 % 10) + sumFirstHalf;
            temp2 /= 10;
        }

        System.out.println("Сумма цифр sumFirstHalf = " + sumFirstHalf);

        while (temp3 != 0) {
            sumSecondHalf = (temp3 % 10) + sumSecondHalf;
            temp3 /= 10;
        }

        System.out.println("Сумма цифр sumSecondHalf = " + sumSecondHalf);

        if (sumFirstHalf == sumSecondHalf) {
            System.out.println("Число - " + num9 + " является счастливым числом");
        } else {
            System.out.println("Число - " + num9 + " не является счастливым числом");
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