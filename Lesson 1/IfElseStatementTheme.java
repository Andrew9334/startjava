public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");

        int age = 10;
        String maleGender = "male";
        int height = 175;

        if (age > 20) {
            System.out.println("Возраст больше 20 лет");
        } else {
            System.out.println("Возраст меньше 20 лет");
        }

        if (!(maleGender == "male")) {
            System.out.println("Это женщина");
        } else {
            System.out.println("Это мужчина");
        }

        if (height < 1.80) {
            System.out.println("Ваш рост меньше 1.80 метра");
        } else {
            System.out.println("Ваш рост больше 1.80 метра");
        }

        char firstLetterName = firstLetterName = "Maxim".charAt(0);

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

        int number = 10; 

        if (number == 0) {
            System.out.println("Число является нулем");
        } else {
            if (number % 2 == 0) {
                System.out.println(number + " - четное число");
            } else {
                System.out.println(number + " - нечетное число");
            }
            if (number < 0) {
                System.out.println(number + " - нечетное число");
            } else {
                System.out.println(number + " - положительное число");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");

        int number1 = 152;
        int number2 = 152;
        int hundredsNumber1 = number1 / 100;
        int hundredsNumber2 = number2 / 100;
        int tensNumber1 = number1 / 10 % 10;
        int tensNumber2 = number2 / 10 % 10;
        int onesNumber1 = number1 % 100 % 10;
        int onesNumber2 = number2 % 100 % 10;

        System.out.println("Исходные числа: " + number1 + ", " + number2);

        if (hundredsNumber1 == hundredsNumber2) {
            System.out.println("Одинаковые в них цифры: " + 
                    hundredsNumber1 + ", " + hundredsNumber2 + '\n' +
                    "Номера разрядов - сотни");
        }
        if (tensNumber1 == tensNumber2) {
            System.out.println("Одинаковые в них цифры: " + 
                    tensNumber1 + ", " + tensNumber2 + '\n' +
                    "Номера разрядов - десятки");
        }
        if (onesNumber1 == onesNumber2) {
            System.out.println("Одинаковые в них цифры: " + 
                    onesNumber1 + ", " + onesNumber2 + '\n' +
                    "Номера разрядов - единицы");
        }
        if (hundredsNumber1 != hundredsNumber2 && tensNumber1 != tensNumber2 && onesNumber1 != onesNumber2) {
        System.out.println("Равных чисел нет");
        }

        System.out.println("\n5. Определение символа по его коду");

        char searchSymbol = '\u0057';

        if (searchSymbol >= 'a' && searchSymbol <= 'z') {
            System.out.println("маленькая буква - " + searchSymbol);
        } else if (searchSymbol >= 'A' && searchSymbol <= 'Z') {
            System.out.println("большая буква - " + searchSymbol);
        } else if (searchSymbol >= 0 && searchSymbol <= 9) {
            System.out.println("число - " + searchSymbol);
        } else {
            System.out.println(searchSymbol + " - не число и не буква");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");

        int depositAmount = 300000;
        double percent = 0.05;

        if (depositAmount >= 100000 && depositAmount <= 300000) {
            percent = (int) (depositAmount * 0.07);
        } else if (depositAmount > 300000) {
            percent = (int) (depositAmount * 0.1);
        } else {
            percent = depositAmount * percent;
        }

        System.out.println("Сумма вклада - " + depositAmount + '\n' +
                "Начисленны процент - " + (int) percent + '\n' +
                "Итоговая сумма - " + (depositAmount + (int) percent));

        System.out.println("\n7. Определение оценки по предметам");
        
        int historyPercent = 59;
        int csPercent = 91;
        double gradleOfHistory = 5;
        double gradleOfProgramming = 5;
        double avgGrades;
        double avgPercent;

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

        avgGrades =(gradleOfHistory + gradleOfProgramming) / 2;
        avgPercent =(historyPercent +csPercent) / 2;

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
            System.out.println("Прибыль за год +" +  annualProfit);
        } else {
            System.out.println("Прибыль за год " + annualProfit);
        }

        System.out.println("\n9. Подсчет количества банкнот");

        int requiredAmount = 576;
        int oneBanknote = 50;
        int tenBanknote = 5;
        int oneHundredBanknote = 10;
        int result = 0;
        int oneHundredBanknoteDenomination = 100;
        int tenBanknoteDenomination = 10;
        int oneBanknoteDenomination = 1;

        int onesOfTheRequiredQuantity = requiredAmount % 100 % 10;
        int tensOfTheRequiredQuantity = requiredAmount / 10 % 10;
        int hundredsOfTheRequiredQuantity = requiredAmount / 100;

        if (hundredsOfTheRequiredQuantity < oneHundredBanknote) {
            int resultHundreds = hundredsOfTheRequiredQuantity;
            System.out.println("Номинал банкноты - " + oneHundredBanknoteDenomination + ". "
                    + "Необходимое количество банкнот - " + resultHundreds + ". " +
                    "Выдаваемая сумма - " + requiredAmount);
        } else if (hundredsOfTheRequiredQuantity == oneHundredBanknote) {
            int resultHundreds = hundredsOfTheRequiredQuantity;
            System.out.println("Номинал банкноты - " + oneHundredBanknoteDenomination + ". " +
                    "Необходимое количество банкнот - " + resultHundreds + ". " +
                    "Выдаваемая сумма - " + requiredAmount);
        } else if (hundredsOfTheRequiredQuantity > oneHundredBanknote) {
            result = oneHundredBanknote + tenBanknote;
                if (result > hundredsOfTheRequiredQuantity) {
                    System.out.println("Номинал банкноты - " + oneHundredBanknoteDenomination + ". " +
                            "Необходимое количество банкнот - " + (result - (result - hundredsOfTheRequiredQuantity)) + ". " +
                            "Выдаваемая сумма - " + requiredAmount);
                } else if (result == hundredsOfTheRequiredQuantity) {
                    System.out.println("Номинал банкноты - " + oneHundredBanknoteDenomination + ". " +
                            "Необходимое количество банкнот - " + result + ". " +
                            "Выдаваемая сумма - " + requiredAmount);
                } else if (result < hundredsOfTheRequiredQuantity) {
                    result += oneBanknote;
                    if (result > hundredsOfTheRequiredQuantity) {
                        System.out.println("Номинал банкноты - " + oneHundredBanknoteDenomination +". "  +
                                (result - (result - hundredsOfTheRequiredQuantity)) +
                                "Необходимое количество банкнот - " + result + ". " +
                                "Выдаваемая сумма - " + requiredAmount);
                    } else if(result == hundredsOfTheRequiredQuantity) {
                        System.out.println("Номинал банкноты - " + oneHundredBanknoteDenomination + ". " +
                                "Необходимое количество банкнот - " + result + ". " +
                                "Выдаваемая сумма - " + requiredAmount);
                    } else {
                        System.out.println("В банкомате недостаточно денег");
                    }
                }
        }

        if (tensOfTheRequiredQuantity < tenBanknote) {
            int resultTens = tensOfTheRequiredQuantity;
            System.out.println("Номинал банкноты - " + tenBanknoteDenomination + ". " +
                    "Необходимое количество банкнот - " + resultTens + ". " +
                    "Выдаваемая сумма - " + requiredAmount);
        } else if (tensOfTheRequiredQuantity == tenBanknote) {
            int resultTens = hundredsOfTheRequiredQuantity;
            System.out.println("Номинал банкноты - " + tenBanknoteDenomination + ". " +
                    "Необходимое количество банкнот - " + resultTens + ". " +
                    "Выдаваемая сумма - " + requiredAmount);
        } else if (tensOfTheRequiredQuantity > tenBanknote) {
            result = tenBanknote + oneBanknote;
            if (result > tensOfTheRequiredQuantity) {
                System.out.println("Номинал банкноты - " + tenBanknoteDenomination + ". " +
                        "Необходимое количество банкнот - " + (result - (result -tensOfTheRequiredQuantity)) + ". " +
                        "Выдаваемая сумма - " + requiredAmount);
            } else if(result == tensOfTheRequiredQuantity) {
                System.out.println("Номинал банкноты - " + tenBanknoteDenomination + ". " +
                        "Необходимое количество банкнот - " + result + ". " +
                        "Выдаваемая сумма - " + requiredAmount);
            } else if (result < tensOfTheRequiredQuantity) {
                result += oneBanknote;
                if (result > tensOfTheRequiredQuantity) {
                    System.out.println("Номинал банкноты - " + tenBanknoteDenomination + ". " +
                            "Необходимое количество банкнот - " + (result - (result - tensOfTheRequiredQuantity)) + ". " +
                            "Выдаваемая сумма - " + requiredAmount);
                } else if (result == tensOfTheRequiredQuantity) {
                    System.out.println("Номинал банкноты - " + tenBanknoteDenomination + ". " +
                            "Необходимое количество банкнот - " + result + ". " +
                            "Выдаваемая сумма - " + requiredAmount);
                } else {
                    System.out.println("В банкомате недостаточно денег");
                }
            }
        }

        if (onesOfTheRequiredQuantity < oneBanknote) {
            int resultOnes = onesOfTheRequiredQuantity;
            System.out.println("Номинал банкноты - " + oneBanknoteDenomination + ". " +
                    "Необходимое количество банкнот - " + resultOnes + ". " +
                    "Выдаваемая сумма - " + requiredAmount);
        } else if (onesOfTheRequiredQuantity == oneBanknote) {
            int resultOnes = onesOfTheRequiredQuantity;
            System.out.println("Номинал банкноты - " + oneBanknoteDenomination + ". " +
                    "Необходимое количество банкнот - " + resultOnes + ". " +
                    "Выдаваемая сумма - " + requiredAmount);
        } else if (onesOfTheRequiredQuantity > oneBanknote) {
            System.out.println("В банкомате недостаточно денег");
        }
    }    
}