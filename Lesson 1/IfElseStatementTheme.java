public class IfElseStatementTheme {
	public static void main(String[] args) {
		System.out.println("1. Перевод псевдокода на язык Java");

        int age = 10;
        String maleGender = "male";
        int growth = 175;
        char firstLetterName;

        if(age > 20) {
            System.out.println("Возраст больше 20 лет");
        } else {
            System.out.println("Возраст меньше 20 лет");
        }

        if(!(maleGender == maleGender)) {
            System.out.println("Это женщина");
        } else {
            System.out.println("Это мужчина");
        }

        if(growth < 1.80) {
            System.out.println("Ваш рост меньше 1.80 метра");
        } else {
            System.out.println("Ваш рост больше 1.80 метра");
        }

        firstLetterName = "Maxim".charAt(0);
        if(firstLetterName == 'M') {
            System.out.println("Первая буква вашего имени - М");
        } else if(firstLetterName == 'I') {
            System.out.println("Первая буква вашего имени - I");
        } else {
            System.out.println("Первая буква вашего имени неопознана");
        }

        System.out.println("2. Поиск max и min числа");

        int firstNumber = 2; 
        int secondNumber = 5; 

        if(firstNumber > secondNumber) {
        	System.out.println("max = " + firstNumber + "min = " + secondNumber);
        } else if(firstNumber == secondNumber){
        	System.out.println("Числа равны");
        } else {
        	System.out.println("max = " + secondNumber + " min = " + firstNumber);
        }

        System.out.println("3. Проверка числа");

        int number = 10; 

        if(number == 0){
        } else {
        	System.out.println(number + " - неравно нулю");
        }
        if(number % 2 == 0) {
        	System.out.println(number + " - четное число");
        } if(number % 2 != 0) {
        	System.out.println(number + " - нечетное число");
        } 
        if(number < 0) {
        	System.out.println(number + " - нечетное число");
        } else if(number > 0) {
        	System.out.println(number + " - положительное число");
        }

        System.out.println("4. Поиск одинаковых цифр в числах");

        int number1 = 154;
        int number2 = 156;

        if((number1 / 100) == (number2 / 100)) {
            System.out.println((number1 / 100) + " = " + (number2 / 100));
            if ((number1 / 10 % 10) == (number2 / 10 % 10)) {
                System.out.println((number1 / 10 % 10) + " = " + (number2 / 10 % 10));
            }
            if ((number1 % 100 % 10) == (number2 % 100 % 10)) {
                System.out.println((number1 % 100 % 10) + " = " + (number1 % 100 % 10));
            }
        } else {
            System.out.println("Равных чисел нет");
        }

       System.out.println("5. Определение символа по его коду");

        char c = '\u0057';

        if(c >= 'a' && c <= 'z') {
            System.out.println("маленькая буква - " + c);
        } else if(c >= 'A' && c <= 'Z'){
            System.out.println("большая буква - " + c);
        } else if(c >= 48 && c <= 57){
       		System.out.println("число - " + c);
        } else {
        	System.out.println(c + " - не число и не буква");
        }

        System.out.println("6. Подсчет суммы вклада и начисленных банком %");

        int depositAmount = 300000;
        int percent = 0;
        System.out.println("Сумма вклада - " + depositAmount);

        if(depositAmount < 100000){
            percent = (int)(depositAmount * 0.05);
            System.out.println("Начисленны процент - " + percent + '\n' +
                    "Итоговая сумма - " + (depositAmount + percent));
        } else if(depositAmount >= 100000 && depositAmount <= 300000) {
            percent = (int) (depositAmount * 0.07);
            System.out.println("Начисленны процент - " + percent + '\n' +
                    "Итоговая сумма - " + (depositAmount + percent));
        } else if(depositAmount > 300000){
            percent = (int) (depositAmount * 0.1);
            System.out.println("Начисленны процент - " + percent + '\n' +
                    "Итоговая сумма - " + (depositAmount + percent));
        }

        System.out.println("7. Определение оценки по предметам");

        int percentGradleOfHistory = 59;
        int percentGradleOfProgramming = 91;
        double gradleOfHistory = 0;
        double gradleOfProgramming = 0;
        int numberOfItems = 2;
        double averageGradesInSubjects;
        double averagePercentageBySubjects;

        if (percentGradleOfHistory > 91) {
            gradleOfHistory = 5;
            System.out.println(gradleOfHistory + " - history");
        } else if (percentGradleOfHistory > 73) {
            gradleOfHistory = 4;
            System.out.println(gradleOfHistory + " - history");
        } else if (percentGradleOfHistory > 60) {
            gradleOfHistory = 3;
            System.out.println(gradleOfHistory + " - history");
        } else if(percentGradleOfHistory <= 60) {
            gradleOfHistory = 2;
            System.out.println(gradleOfHistory + " - history");
        }

        if (percentGradleOfProgramming > 91) {
            gradleOfProgramming = 5;
            System.out.println(gradleOfProgramming + " - programming");
        } else if (percentGradleOfProgramming > 73) {
            gradleOfProgramming = 4;
            System.out.println(gradleOfProgramming + " - programming");
        } else if (percentGradleOfProgramming > 60) {
            gradleOfProgramming = 3;
            System.out.println(gradleOfProgramming + " - programming");
        } else if(percentGradleOfProgramming <= 60) {
            gradleOfProgramming = 2;
            System.out.println(gradleOfProgramming + " - programming");
        }

        averageGradesInSubjects = (gradleOfHistory + gradleOfProgramming) / numberOfItems;
        averagePercentageBySubjects = (percentGradleOfHistory + percentGradleOfProgramming) / numberOfItems;
        System.out.println("Средний балл оценок по предметам - " + averageGradesInSubjects);
        System.out.println("Средний % по предметам - " + averagePercentageBySubjects);

        System.out.println("8. Расчет прибыли за год");

        int rent = 5000;
        int revenue = 13000;
        int costPrice = 9000;
        int annualProfit = (revenue - rent - costPrice) * 12;

        if (annualProfit > 0){
            System.out.println("Прибыль за год " + "+" + annualProfit);
        } else {
            System.out.println("Прибыль за год " + annualProfit);
        }

        System.out.println("9. Подсчет количества банкнот");

        int requiredAmount = 576;
        int oneBanknote = 50;
        int tenBanknote = 5;
        int oneHundredBanknote = 10;
        int result = 0;
        int oneHundredBanknoteDenomination = 100;
        int tenBanknoteDenomination = 10;
        int oneBanknoteDenomination = 1;

        int unitsOfTheRequiredQuantity = requiredAmount % 100 % 10;
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
                if(result > hundredsOfTheRequiredQuantity){
                    System.out.println("Номинал банкноты - " + oneHundredBanknoteDenomination + ". " +
                            "Необходимое количество банкнот - " + (result - (result - hundredsOfTheRequiredQuantity)) + ". " +
                            "Выдаваемая сумма - " + requiredAmount);
                }else if(result == hundredsOfTheRequiredQuantity){
                    System.out.println("Номинал банкноты - " + oneHundredBanknoteDenomination + ". " +
                            "Необходимое количество банкнот - " + result + ". " +
                            "Выдаваемая сумма - " + requiredAmount);
                } else if(result < hundredsOfTheRequiredQuantity){
                    result += oneBanknote;
                    if(result > hundredsOfTheRequiredQuantity){
                        System.out.println("Номинал банкноты - " + oneHundredBanknoteDenomination +". "  +
                                (result - (result - hundredsOfTheRequiredQuantity)) +
                                "Необходимое количество банкнот - " + result + ". " +
                                "Выдаваемая сумма - " + requiredAmount);
                    } else if(result == hundredsOfTheRequiredQuantity){
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
            if(result > tensOfTheRequiredQuantity){
                System.out.println("Номинал банкноты - " + tenBanknoteDenomination + ". " +
                        "Необходимое количество банкнот - " + (result - (result -tensOfTheRequiredQuantity)) + ". " +
                        "Выдаваемая сумма - " + requiredAmount);
            }else if(result == tensOfTheRequiredQuantity){
                System.out.println("Номинал банкноты - " + tenBanknoteDenomination + ". " +
                        "Необходимое количество банкнот - " + result + ". " +
                        "Выдаваемая сумма - " + requiredAmount);
            } else if(result < tensOfTheRequiredQuantity){
                result += oneBanknote;
                if(result > tensOfTheRequiredQuantity){
                    System.out.println("Номинал банкноты - " + tenBanknoteDenomination + ". " +
                            "Необходимое количество банкнот - " + (result - (result - tensOfTheRequiredQuantity)) + ". " +
                            "Выдаваемая сумма - " + requiredAmount);
                } else if(result == tensOfTheRequiredQuantity){
                    System.out.println("Номинал банкноты - " + tenBanknoteDenomination + ". " +
                            "Необходимое количество банкнот - " + result + ". " +
                            "Выдаваемая сумма - " + requiredAmount);
                } else {
                    System.out.println("В банкомате недостаточно денег");
                }
            }
        }

        if (unitsOfTheRequiredQuantity < oneBanknote) {
            int resultUnits = unitsOfTheRequiredQuantity;
            System.out.println("Номинал банкноты - " + oneBanknoteDenomination + ". " +
                    "Необходимое количество банкнот - " + resultUnits + ". " +
                    "Выдаваемая сумма - " + requiredAmount);
        } else if (unitsOfTheRequiredQuantity == oneBanknote) {
            int resultUnits = unitsOfTheRequiredQuantity;
            System.out.println("Номинал банкноты - " + oneBanknoteDenomination + ". " +
                    "Необходимое количество банкнот - " + resultUnits + ". " +
                    "Выдаваемая сумма - " + requiredAmount);
        } else if (unitsOfTheRequiredQuantity > oneBanknote) {
            System.out.println("В банкомате недостаточно денег");
        }
    }    
}