public class Calculator {
    public static void main(String[] args) {
        int num1 = 24;
        int num2 = 14;
        String sign = "^";
        int result = 0;

        if (sign == "+") {
            result = num1 + num2;
        } else if (sign == "-") {
            result = num1 - num2;
        } else if (sign == "*") {
            result = num1 * num2;
        } else if (sign == "/") {
            result = num1 / num2;
        } else {
            result = num1 % num2;
        }

        for(int i = 0; i < 1; i++) {
            if(sign == "^") {
                result = num1 * num1;
            }
        }
        
        System.out.println(num1 + " " + sign + ' ' + num1 + " " + " = " + result);
    }
}