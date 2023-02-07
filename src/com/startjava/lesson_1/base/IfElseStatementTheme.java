package com.startjava.lesson_1.base;

import java.text.DecimalFormat;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Перевод псевдокода на язык Java");

        int age = 10;
        String maleGender = "male";
        int height = 175;

        if (age > 20) {
            System.out.println("Возраст больше 20 лет");
        } else {
            System.out.println("Возраст меньше 20 лет");
        }

        if (maleGender != "male") {
            System.out.println("Это женщина");
        } else {
            System.out.println("Это мужчина");
        }

        if (height < 1.80) {
            System.out.println("Ваш рост меньше 1.80 метра");
        } else {
            System.out.println("Ваш рост больше 1.80 метра");
        }

        char firstLetterName = "Maxim".charAt(0);

        if (firstLetterName == 'M') {
            System.out.println("Первая буква вашего имени - М");
        } else if (firstLetterName == 'I') {
            System.out.println("Первая буква вашего имени - I");
        } else {
            System.out.println("Первая буква вашего имени неопознана");
        }

        System.out.println("\n2. Поиск max и min числа");

        int num1 = 2;
        int num2 = 5;

        if (num1 > num2) {
            System.out.println("max = " + num1 + "min = " + num2);
        } else if (num1 == num2) {
            System.out.println("Числа равны");
        } else {
            System.out.println("max = " + num2 + ',' + " min = " + num1);
        }

        System.out.println("\n3. Проверка числа");

        int num3 = 10;

        if (num3 == 0) {
            System.out.println("Число является нулем");
        } else {
            if (num3 % 2 == 0) {
                System.out.println(num3 + " - четное число");
            } else {
                System.out.println(num3 + " - нечетное число");
            }
            if (num3 < 0) {
                System.out.println(num3 + " - нечетное число");
            } else {
                System.out.println(num3 + " - положительное число");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");

        int num4 = 152;
        int num5 = 152;
        int hundredsNum4 = num4 / 100;
        int hundredsNum5 = num5 / 100;
        int tensNum4 = num4 / 10 % 10;
        int tensNum5 = num5 / 10 % 10;
        int onesNum4 = num4 % 10;
        int onesNum5 = num5 % 10;

        System.out.println("Исходные числа: " + num4 + ", " + num5);

        if (hundredsNum4 == hundredsNum5) {
            System.out.println("Одинаковые в них цифры: " + hundredsNum4 + ", " + hundredsNum5 + '\n' +
                    "Номера разрядов - сотни");
        }
        if (tensNum4 == tensNum5) {
            System.out.println("Одинаковые в них цифры: " + tensNum4 + ", " + tensNum5 + '\n' +
                    "Номера разрядов - десятки");
        }
        if (onesNum4 == onesNum5) {
            System.out.println("Одинаковые в них цифры: " + onesNum4 + ", " + onesNum5 + '\n' +
                    "Номера разрядов - единицы");
        }
        if (hundredsNum4 != hundredsNum5 && tensNum4 != tensNum5 && onesNum4 != onesNum5) {
            System.out.println("Равных чисел нет");
        }

        System.out.println("\n5. Определение символа по его коду");

        char searchSymbol = '\u0057';

        if (searchSymbol >= 'a' && searchSymbol <= 'z') {
            System.out.println("маленькая буква - " + searchSymbol);
        } else if (searchSymbol >= 'A' && searchSymbol <= 'Z') {
            System.out.println("большая буква - " + searchSymbol);
        } else if (searchSymbol >= '0' && searchSymbol <= '9') {
            System.out.println("число - " + searchSymbol);
        } else {
            System.out.println(searchSymbol + " - не число и не буква");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");

        int depositAmount = 300000;
        double percent = 0.05;

        if (depositAmount >= 100000 && depositAmount <= 300000) {
            percent = 0.07;
        } else if (depositAmount > 300000) {
            percent = 0.1;
        } 

        percent = depositAmount * percent;
        String percentDouble = new DecimalFormat("#0.0").format(percent);

        System.out.println("Сумма вклада - " + depositAmount + '\n' +
                "Начисленны процент - " + percentDouble + '\n' +
                "Итоговая сумма - " + (depositAmount + percent));

        System.out.println("\n7. Определение оценки по предметам");

        int historyPercent = 59;
        int csPercent = 91;
        double gradleOfHistory = 5;
        double gradleOfProgramming = 5;

        if (historyPercent > 73 && historyPercent <= 91) {
            gradleOfHistory = 4;
        } else if (historyPercent > 60 && historyPercent <= 73) {
            gradleOfHistory = 3;
        } else if (historyPercent <= 60) {
            gradleOfHistory = 2;
        }

        if (csPercent > 73 && csPercent <= 91) {
            gradleOfProgramming = 4;
        } else if (csPercent > 60 && csPercent <= 73) {
            gradleOfProgramming = 3;
        } else if (csPercent <= 60) {
            gradleOfProgramming = 2;
        }

        double avgGrades = (gradleOfHistory + gradleOfProgramming) / 2;
        double avgPercent = (historyPercent +csPercent) / 2;

        System.out.println(gradleOfHistory + "- history" + '\n' +
                    gradleOfProgramming + "- programming" + '\n' +
                    "Средний балл оценок по предметам - " + avgGrades + '\n' +
                    "Средний % по предметам - " + avgPercent);

        System.out.println("\n8. Расчет прибыли за год");

        int rent = 5000;
        int revenue = 13000;
        int costPrice = 9000;
        int annualProfit = (revenue - rent - costPrice) * 12;

        if (annualProfit > 0) {
            System.out.println("Прибыль за год +"  + annualProfit);
        } else {
            System.out.println("Прибыль за год " + annualProfit);
        }

        System.out.println("\n9. Подсчет количества банкнот");

        int requiredAmount = 576;
        int banknote1 = 50;
        int banknote10 = 5;
        int banknote100 = 10;
        int denomination100 = 100;
        int denomination10 = 10;
        int denomination1 = 1;
        int result1 = 0;
        int result10 = 0;
        int result100 = 0;

        int requiredQuantity1 = requiredAmount % 10;
        int requiredQuantity10 = requiredAmount / 10 % 10;
        int requiredQuantity100 = requiredAmount / 100;

        if (requiredQuantity100 == banknote100 && requiredQuantity10 == banknote10 &&
                requiredQuantity1 == banknote1) {
            result1 = requiredQuantity1;
            result10 = requiredQuantity10;
            result100 = requiredQuantity100;

            System.out.println("Выдаваемая сумма - " + requiredAmount + " " + '\n' +
                    "Номинал банкноты - " + denomination100 + ". " +
                    "Необходимое количество банкнот - " + result100 + ". " + '\n' +
                    "Номинал банкноты - " + denomination10 + ". " +
                    "Необходимое количество банкнот - " + result10 + ". " + '\n' +
                    "Номинал банкноты - " + denomination1 + ". " +
                    "Необходимое количество банкнот - " + result1 + '.');
        } else if (requiredQuantity100 < banknote100 && requiredQuantity10 < banknote10 &&
                requiredQuantity1 < banknote1) {
            result1 = requiredQuantity1;
            result10 = requiredQuantity10;
            result100 = requiredQuantity100;

            System.out.println("Выдаваемая сумма - " + requiredAmount + " " + '\n' +
                    "Номинал банкноты - " + denomination100 + ". " +
                    "Необходимое количество банкнот - " + result100 + ". " + '\n' +
                    "Номинал банкноты - " + denomination10 + ". " +
                    "Необходимое количество банкнот - " + result10 + ". " + '\n' +
                    "Номинал банкноты - " + denomination1 + ". " +
                    "Необходимое количество банкнот - " + result1 + '.');
        } else if (requiredQuantity100 > banknote100 && requiredQuantity10 < banknote10 &&
                requiredQuantity1 < banknote1) {
            while (banknote100 != requiredQuantity100) {
                banknote10--;
                banknote100++;
            }
            result1 = requiredQuantity1;
            result10 = requiredQuantity10;
            result100 = requiredQuantity100;

            System.out.println("Выдаваемая сумма - " + requiredAmount + " " + '\n' +
                    "Номинал банкноты - " + denomination100 + ". " +
                    "Необходимое количество банкнот - " + result100 + ". " + '\n' +
                    "Номинал банкноты - " + denomination10 + ". " +
                    "Необходимое количество банкнот - " + result10 + ". " + '\n' +
                    "Номинал банкноты - " + denomination1 + ". " +
                    "Необходимое количество банкнот - " + result1 + '.');
        } else if (requiredQuantity100 <= banknote100 && requiredQuantity10 > banknote10 &&
                requiredQuantity1 < banknote1) {
            while (banknote10 != requiredQuantity10) {
                banknote1--;
                banknote10++;
            }
            result1 = requiredQuantity1;
            result10 = requiredQuantity10;
            result100 = requiredQuantity100;

            System.out.println("Выдаваемая сумма - " + requiredAmount + " " + '\n' +
                    "Номинал банкноты - " + denomination100 + ". " +
                    "Необходимое количество банкнот - " + result100 + ". " + '\n' +
                    "Номинал банкноты - " + denomination10 + ". " +
                    "Необходимое количество банкнот - " + result10 + ". " + '\n' +
                    "Номинал банкноты - " + denomination1 + ". " +
                    "Необходимое количество банкнот - " + result1 + '.');
        } else {
            System.out.println("В банкомате недостаточно средств");
        }
    }    
}