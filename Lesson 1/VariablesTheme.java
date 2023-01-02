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
                "Amount of cache memory" + amountOfCacheMemory + "\n" +
                "Is computer? - " + isComputer);

        System.out.println();
        System.out.println("2. Расчет стоимости товара со скидкой");

        int penCost = 100;
        int bookCost = 200;
        double discount = 0.11;

        double amountOfCost = (double) (penCost + bookCost);
        double discountAmount = amountOfCost * discount;
        double amountOfDiscountedItems = amountOfCost - discountAmount;
        System.out.println("Сумма скидки " + discountAmount);
        System.out.println("Общая стоимость товаров со скидкой " + amountOfDiscountedItems);

        System.out.println();
        System.out.println("3. Вывод слова JAVA");

        System.out.println("   J    a  v     v  a" + "\n" +
                "   J   a a  v   v  a a" + "\n" +
                "J  J  aaaaa  V V  aaaaa" + "\n" +
                " JJ  a     a  V  a     a");

        System.out.println();
        System.out.println("4. Вывод min и max значений целых числовых типов");

        byte numberOfByte = 127;
        short numberOfShort = 32767;
        int numberOfInteger = 2147483647;
        long numberOfLong = 9223372036854775807L;

        System.out.println("Первоначальное значение numberOfByte = " + numberOfByte + "\n" +
                "Первоначальное значение numberOfShort = " + numberOfShort + "\n" +
                "Первоначальное значение numberOfInteger = " + numberOfInteger + "\n" +
                "Первоначальное значение numberOfLong = " + numberOfLong);

        System.out.println("Значение после инкремента numberOfByte = " + (numberOfByte += 1) + "\n" +
                "Значение после инкремента numberOfShort = " + (numberOfShort += 1) + "\n" +
                "Значение после инкремента numberOfInteger = " + (numberOfInteger += 1) + "\n" +
                "Значение после инкремента numberOfLong = " + (numberOfLong += 1));

        System.out.println("Значение после декремента numberOfByte = " + (numberOfByte -= 1) + "\n" +
                "Значение после декремента numberOfShort = " + (numberOfShort -= 1) + "\n" +
                "Значение после декремента numberOfInteger = " + (numberOfInteger -= 1) + "\n" +
                "Значение после декремента numberOfLong = " + (numberOfLong -= 1));

        System.out.println();
        System.out.println("5. Перестановка значений переменных");

        int firstNumber = 2;
        int secondNumber = 5;
        int tmp = firstNumber;

        System.out.println("Исходные значения переменных: " + '\n' +
                "firstNumber = " + firstNumber + '\n' +
                "secondNumber = " + secondNumber);

        System.out.println();
        System.out.println("Перестановка значений переменных с помощью третьей переменной");
        firstNumber = secondNumber;
        secondNumber = tmp;

        System.out.println("Новые значения переменных: " + '\n' +
                "firstNumber = " + firstNumber + '\n' +
                "secondNumber = " + secondNumber);

        System.out.println();
        System.out.println("Перестановка значений переменных с помощью арифметических операций");
        firstNumber = firstNumber + secondNumber - (firstNumber = secondNumber);

        System.out.println("Новые значения переменных: " + '\n' +
                "firstNumber = " + firstNumber + '\n' +
                "secondNumber = " + secondNumber);

        System.out.println();
        System.out.println("Перестановка значений переменных с помощью побитовой операции ^");

        firstNumber ^= secondNumber;
        firstNumber ^= secondNumber;
        secondNumber ^= firstNumber;
        secondNumber ^= firstNumber;

        System.out.println("Новые значения переменных: " + '\n' +
                "firstNumber = " + firstNumber + '\n' +
                "secondNumber = " + secondNumber);

        System.out.println();
        System.out.println("6. Вывод символов и их кодов");
        char c35 = '#';
        char c38 = '&';
        char c64 = '@';
        char c94 = '^';
        char c95 = '_';
        System.out.println("35 - " + c35 + '\n' +
                "38 - " + c38 + '\n' +
                "64 - " + c64 + '\n' +
                "94 - " + c94 + '\n' +
                "95 - " + c95);

        System.out.println();
        System.out.println("7. Вывод в консоль ASCII-арт Дюка");
        char forwardSlash = '/';
        char doubleBackSlash = '\\';
        char underscore = '_';
        char openParenthesis = '(';
        char closeParenthesis = ')';

        System.out.println("    " + forwardSlash + doubleBackSlash + '\n' +
                "   " + forwardSlash + "  " + doubleBackSlash + '\n' +
                "  " + forwardSlash + underscore + openParenthesis + " " + closeParenthesis + doubleBackSlash + '\n' +
                " " + forwardSlash + "      " + doubleBackSlash + '\n' +
                forwardSlash + underscore + underscore + underscore + underscore + forwardSlash + doubleBackSlash + underscore + underscore + doubleBackSlash);

        System.out.println();
        System.out.println("8. Вывод количества сотен, десятков и единиц числа");

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

        System.out.println();
        System.out.println("9. Вывод времени");

        int time = 86399;

        int hours = time / 3600;
        int minutes = time % 3600 / 60;
        int seconds = time % 60 ;
        System.out.println(hours + ":" + minutes + ":" + seconds);
        }
}