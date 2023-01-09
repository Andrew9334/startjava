public class CirclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int num = -10;
        int sumOdd = 0;
        int sumEven = 0;

        do {
            if (num % 2 == 0 && num < 0) {
                sumOdd = sumOdd + num * (-1);
            } else if (num % 2 == 0 && num > 0) {
                sumOdd = sumOdd + num;
            } else if (num % 2 != 0 && num < 0) {
                sumEven = sumEven + num * (-1);
            } else if (num % 2 != 0) {
                sumEven = sumEven + num;
            }
            num++;
        } while (-10 <= num & num <= 21);

        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + sumOdd + ", а нечетных = " + sumEven);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");

        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int min = 0;
        int max = 0;

        if (num1 > num2 && num1 > num3) {
            max = num1;
        } else if (num1 < num2 && num1 < num3) {
            min = num1;
        }
        if (num2 > num1 && num2 > num3) {
            max = num2;
        } else if (num2 < num1 && num2 < num3) {
            min = num2;
        }
        if (num3 > num1 && num3 > num1) {
            max = num3;
        } else if (num3 < num1 && num3 < num2) {
            min = num3;
        }

        System.out.println("Интервал между " + '(' + max + ',' + min + ')' + ':');
        for (int i = (max - 1); max > i && i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");

        int num4 = 1234;
        int thousandths = 0;
        int hundreds = 0;
        int dozen = 0;
        int one = 0;
        int sum = 0;
        int count = 0;

        while (count < 1) {
            thousandths = num4 / 1000 % 100;
            hundreds = num4 / 100 % 10;
            dozen = num4 / 10 % 10;
            one = num4 % 10;
            sum = thousandths + hundreds + dozen + one;
            count++;
        }

        System.out.println("Исходное число в обратном порядке - " + one +
                dozen + hundreds + thousandths);
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
                System.out.println('\n');
            }
            if (i == (max1 - 1)) {
                for (int j = 0; j < (5 - count1); j++) {
                    System.out.printf("%4d", 0);
                }
            }
        }

        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность");

        int num6 = 3242592;
        String num7 = String.valueOf(num6);
        char checkNum = '2';
        int count2 = 0;

        for (int i = 0; i < num7.length(); i++) {
            if (num7.charAt(i) == checkNum) {
                count2++;
            }
        }

        if (count1 % 2 == 0) {
            System.out.println("Число " + num6 + " содержит " + count1 +
                    " (четное) количество двоек");
        } else {
            System.out.println("Число " + num6 + " содержит " + count1 +
                    " (нечетное) количество двоек");
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