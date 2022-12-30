public class VariablesTheme {
	
	public static void main(String[] args){
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

		System.out.println("2. Расчет стоимости товара со скидкой");

		int pen = 100;
		int book = 200; 
		double discount = 0.11; 

		double discountAmount = (double)(pen + book) * discount; 
		double amountOfDiscountedItems = (double) (pen + book) - discountAmount; 
		System.out.println(discountAmount);
		System.out.println(amountOfDiscountedItems);

		System.out.println("3. Вывод слова JAVA");

		System.out.println("J    a  v     v  a" + "\n" +                                                 
   							"J   a a  v   v  a a" + "\n" +                                               
							"J  J  aaaaa  V V  aaaaa" + "\n" +                                                
 							"JJ  a     a  V  a     a");

		System.out.println("4. Вывод min и max значений целых числовых типов");

		byte b = 127; 
		short s = 32767; 
		int i = 2147483647;
		long l = 9223372036854775807L;

		System.out.println("Первоначальное значение b = " + b + "\n" +
				"Первоначальное значение s = " + s + "\n" +
				"Первоначальное значение i = " + i + "\n" +
				"Первоначальное значение l = " + l);

		b++;
		s++;
		i++;
		l++;
		System.out.println("Значение после инкремента b = " + b + "\n" +
				"Значение после инкремента s = " + s + "\n" +
				"Значение после инкремента i = " + i + "\n" +
				"Значение после инкремента l = " + l);
		b--;
		s--;
		i--;
		l--;
		System.out.println("Значение после декремента b = " + b + "\n" +
				"Значение после декремента s = " + s + "\n" +
				"Значение после декремента i = " + i + "\n" +
				"Значение после декремента l = " + l);

		System.out.println("5. Перестановка значений переменных");

		int firstNumber = 2; 
		int secondNumber = 5;
		int tmp; 

		tmp = firstNumber;
		firstNumber = secondNumber;
		secondNumber = tmp;

		firstNumber = firstNumber + secondNumber - (firstNumber = secondNumber); 

		firstNumber ^= secondNumber;
		secondNumber ^= firstNumber;
		firstNumber ^= secondNumber; 

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

        System.out.println("7. Вывод в консоль ASCII-арт Дюка");
        char c1 = '/';
        char c2 = '\\';
        char c3 = '_';
        char c4 = '(';
        char c5 = ')';

        System.out.println("    " + c1 + c2 + '\n' +
                "   " + c1 + "  " + c2 + '\n' +
                "  " + c1 + c3 + c4 + " " + c5 + c2 + '\n' +
                " " + c1 + "      " + c2 + '\n' +
                c1 + c3 + c3 + c3 + c3 + c1 + c2 + c3 + c3 + c2);
	    
	    System.out.println("8. Вывод количества сотен, десятков и единиц числа");

        int number = 123;

        int hundreds = number / 100;
        int dozens = number / 10 % 10;
        int units = number % 100 % 10;
        int multiplication = hundreds * dozens * units;
        int sum = hundreds + dozens + units;
        System.out.println("Число 123 содержит: " + hundreds + " сотен\n"
                + dozens + " десятков\n"
                + units + " единиц" + '\n' +
                "Сумма его цифр = " + sum + '\n' +
                "Произведение = " + multiplication);

        System.out.println("9. Вывод времени");

        int time = 86399;

        int hours = time / 3600;
        int minutes = time % 3600 / 60;
        int seconds = time % 60 ;
        System.out.println(hours + ":" + minutes + ":" + seconds);
	}
}