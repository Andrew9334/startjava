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

        System.out.println("2. Вывод чисел в интервале (min и max) в порядке убывания");

        int num1 = 20;
        int num2 = 5;
        int num3 = -1;
        int min = 0;
        int middle = 0;
        int max = 0;

        for (int i = 0; i < 3; i++) {
            if (num1 > num2 && num1 > num3) {
                max = num1;
            } else if (num1 < num2 && num1 < num3) {
                min = num1;
            } else if (num1 < num2 && num1 > num3) {
                middle = num1;
            }
            if (num2 > num1 && num2 > num3) {
                max = num2;
            } else if (num2 < num1 && num2 < num3) {
                min = num2;
            } else if (num2 < num1 && num2 > num3) {
                middle = num2;
            }
            if (num3 > num1 && num3 > num1) {
                max = num3;
            } else if (num3 < num1 && num3 < num2) {
                min = num3;
            } else if (num3 < num1 && num3 > num2) {
                middle = num3;
            }

        }
        System.out.println(min + " " + middle + " " + max);

        System.out.println("3. Вывод реверсивного числа и суммы его цифр");

        int num4 = 1234;
        int thousandths;
        int hundreds;
        int dozen;
        int one;
        int sum = 0;
        int count = 0;

        while (count < 1) {
            thousandths = num4 / 1000 % 100;
            hundreds = num4 / 100 % 10;
            dozen = num4 / 10 % 10;
            one = num4 % 10;
            sum = thousandths + hundreds + dozen + one;
            System.out.println("Исходное число в обратном порядке - " + one +
                    dozen + hundreds + thousandths);
            System.out.println("Сумма цифр числа -" + sum);
            count++;
        }

        System.out.println("4. Вывод чисел на консоль в несколько строк");
        int num5 = 1;
        int divider = (num5 + 3) % 5;
        for (int i = num5; i < 24; i += 2) {
            System.out.printf("%4d", i);
            if (i % 5 == divider) {
                System.out.println('\n');
            }
        }
        System.out.println();

        System.out.println("5. Проверка количества двоек на четность/нечетность");

        int num6 = 3242592;
        String number = String.valueOf(num6);
        char c = '2';
        int count1 = 0;

        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == c) {
                count1++;
            }
        }

        if (count1 % 2 == 0) {
            System.out.println("Число " + num6 + " содержит " + count1 +
                    " (четное) количество двоек");
        } else {
            System.out.println("Число " + num6 + " содержит " + count1 +
                    " (нечетное) количество двоек");
        }

        System.out.println("6. Отображение фигур в консоли");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 11; j++) {
                System.out.print("*");
            }
            System.out.println();
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

        System.out.println("7. Отображение ASCII-символов");

        System.out.println("Dec Char ");
        for (int i = 0; i < 128; i++) {
            if (i < 48 && i % 2 != 0) {
                System.out.println(i + " " + (char) i);
            }

            if (i > 96 && i < 123 && i % 2 == 0) {
                System.out.println(i + " " + (char) i);
            }
        }

        System.out.println("8. Проверка, является ли число палиндромом");

        int num7 = 1234321;
        int initial = 0;
        int revers = 0;
        int temp = num7;

        while (num7 != 0){
            initial = num7 % 10;
            revers = revers * 10 + initial;
            num7 /= 10;
            }

        if (temp == revers){
            System.out.println("Число " + temp + " является палиндромом");
        } else {
            System.out.println("Число " + temp + " не является палиндромом");
        }

        System.out.println("9. Определение, является ли число счастливым");

        int num8 = 123796;
        int sumFirstHalf = 0;
        int sumSecondHalf = 0;
        int temp2 = num8 / 1000;
        int temp3 = num8 % 1000;
        System.out.println(temp2);
        System.out.println(temp3);

        while (temp2 != 0){
            sumFirstHalf = (temp2 % 10) + sumFirstHalf;
            temp2 /= 10;
        }

        System.out.println("Сумма цифр sumFirstHalf = " + sumFirstHalf);

        while (temp3 != 0){
            sumSecondHalf = (temp3 % 10) + sumSecondHalf;
            temp3 /= 10;
        }

        System.out.println("Сумма цифр sumSecondHalf = " + sumSecondHalf);

        if(sumFirstHalf == sumSecondHalf){
            System.out.println("Число - " + num8 + " является счастливым числом");
        } else {
            System.out.println("Число - " + num8 + " не является счастливым числом");
        }

        System.out.println("10. Вывод таблицы умножения Пифагора");

        for(int i = 1; i < 10; i++){
            for (int j = 1; j < 10; j++){
                System.out.print(i * j + " ");
            }
            System.out.println();
        }



//        int i = 2;
//        while (i < 10) {
//            System.out.print(i + " | ");
//            int j = 2;
//            while (j < 10){
//                int mul = i * j;
//                if(mul < 10){
//                    System.out.print(mul + "  ");
//                } else {
//                    System.out.print(mul + " ");
//                }
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
//
    }
}