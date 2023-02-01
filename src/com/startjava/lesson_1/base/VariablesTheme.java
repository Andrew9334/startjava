package com.startjava.lesson_1.base;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод значений переменных на консоль");

        byte numberOfCores = 4;
        short numberOfHardDrives = 2;
        int amountOfComputerMemory = 16384;
        long videoCardMemory = 8192;
        float windowsVersion = 10f;
        double cpuClockSpeed = 4.2;
        char amountOfCacheMemory = 'a';
        boolean isComputer = true;

        System.out.println("Number of cores = " + numberOfCores + "\n" +
                "Number of hard drives = " + numberOfHardDrives + "\n" +
                "Amount of computer memory = " + amountOfComputerMemory + "\n" +
                "Video card memory = " + videoCardMemory + "\n" +
                "Windows version -" + windowsVersion + "\n" +
                "Cpu clock speed = " + cpuClockSpeed + "\n" +
                "Amount of cache memory" + " - " + amountOfCacheMemory + "\n" +
                "Is computer? - " + isComputer);

        System.out.println("\n2. Расчет стоимости товара со скидкой");

        int penCost = 100;
        int bookCost = 200;
        double discount = 0.11;

        double amountOfCost = (double) (penCost + bookCost);
        double discountAmount = amountOfCost * discount;
        double discountCost = amountOfCost - discountAmount;

        System.out.println("Сумма скидки " + discountAmount);
        System.out.println("Общая стоимость товаров со скидкой " + discountCost);

        System.out.println("\n3. Вывод слова JAVA");

        System.out.println("   J    a  v     v  a" + "\n" +
                "   J   a a  v   v  a a" + "\n" +
                "J  J  aaaaa  V V  aaaaa" + "\n" +
                " JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");

        byte maxByte = 127;
        short maxShort = 32767;
        int maxInteger = 2147483647;
        long maxLong = 9223372036854775807L;

        System.out.println("Первоначальное значение maxByte = " + maxByte + "\n" +
                "Первоначальное значение maxShort = " + maxShort + "\n" +
                "Первоначальное значение maxInteger = " + maxInteger + "\n" +
                "Первоначальное значение maxLong = " + maxLong);

        System.out.println("Значение после инкремента maxByte = " + (++maxByte) + "\n" +
                "Значение после инкремента maxShort = " + (++maxShort) + "\n" +
                "Значение после инкремента maxInteger = " + (++maxInteger) + "\n" +
                "Значение после инкремента maxLong = " + (++maxLong));

        System.out.println("Значение после декремента maxByte = " + (--maxByte) + "\n" +
                "Значение после декремента maxShort = " + (--maxShort) + "\n" +
                "Значение после декремента maxInteger = " + (--maxInteger) + "\n" +
                "Значение после декремента maxLong = " + (--maxLong));

        System.out.println("\n5. Перестановка значений переменных");

        int num1 = 2;
        int num2 = 5;
        int tmp = num1;

        System.out.println("Исходные значения переменных: " + '\n' +
                "num1 = " + num1 + '\n' +
                "num2 = " + num2);

        System.out.println("\nПерестановка значений переменных с помощью третьей переменной");
        num1 = num2;
        num2 = tmp;

        System.out.println("Новые значения переменных: " + '\n' +
                "num1 = " + num1 + '\n' +
                "num2 = " + num2);

        System.out.println("\nПерестановка значений переменных с помощью арифметических операций");

        num1 += num2 - (num2 = num1);

        System.out.println("Новые значения переменных: " + '\n' +
                "num1 = " + num1 + '\n' +
                "num2 = " + num2);

        System.out.println("\nПерестановка значений переменных с помощью побитовой операции ^");
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;

        System.out.println("Новые значения переменных: " + '\n' +
                "num1 = " + num1 + '\n' +
                "num2 = " + num2);

        System.out.println("\n6. Вывод символов и их кодов");
        char sharp = '#';
        char ampersand = '&';
        char at = '@';
        char caret = '^';
        char underscore = '_';
        
        System.out.println(sharp + " - " + (int) sharp + '\n' +
                ampersand + " - " + (int) ampersand + '\n' +
                at + " - " + (int) at + '\n' +
                caret + " - " + (int) caret + '\n' +
                underscore + " - " + (int) underscore);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backSlash = '\\';
        char underscore1 = '_';
        char openParenthesis = '(';
        char closeParenthesis = ')';

        System.out.println("    " + slash + backSlash + '\n' +
                "   " + slash + "  " + backSlash + '\n' +
                "  " + slash + underscore + openParenthesis + " " + closeParenthesis + backSlash + '\n' +
                " " + slash + "      " + backSlash + '\n' +
                slash + underscore + underscore + underscore + underscore +
                slash + backSlash + underscore + underscore + backSlash);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");

        int number = 123;

        int hundreds = number / 100;
        int tens = number / 10 % 10;
        int ones = number % 100 % 10;
        int multDigits = hundreds * tens * ones;
        int sumDigits = hundreds + tens + ones;
        
        System.out.println("Число 123 содержит: " + '\n' +
                hundreds + " сотен\n"
                + tens + " десятков\n"
                + ones + " единиц\n" +
                "Сумма его цифр = " + sumDigits + '\n' +
                "Произведение = " + multDigits);

        System.out.println("\n9. Вывод времени");

        int time = 86399;

        int hours = time / 3600;
        int minutes = time % 3600 / 60;
        int seconds = time % 60 ;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}