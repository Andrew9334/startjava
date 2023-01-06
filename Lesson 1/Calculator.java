public class Calculator {
    public static void main(String[] args) {
        int num1 = 24;
        int num2 = 14;
        int result = num2 - num1;

        if (result == (num1 + num2)) {
            System.out.println(num1 + "" + "+" + "" + num2 + " = " + result);
        } else if (result == (num2 + num1)) {
            System.out.println(num2 + "" + "+" + "" + num1 + " = " + result);
        } else if (result == (num1 - num2)) {
            System.out.println(num1 + "" + "-" + "" + num2 + " = " + result);
        } else if (result == (num2 - num1)) {
            System.out.println(num2 + "" + "-" + "" + num1 + " = " + result);
        } else if (result == (num1 * num2)) {
            System.out.println(num1 + "" + "*" + "" + num2 + " = " + result);
        } else if (result == (num2 * num1)) {
            System.out.println(num2 + "" + "*" + "" + num1 + " = " + result);
        } else if (result == (num1 / num2)) {
            System.out.println(num1 + "" + "/" + "" + num2 + " = " + result);
        } else if (result == (num2 / num1)) {
            System.out.println(num2 + "" + "/" + "" + num1 + " = " + result);
        } else if (result == (num1 % num2)) {
            System.out.println(num1 + "" + "%" + "" + num2 + " = " + result);
        } else if (result == (num2 % num1)) {
            System.out.println(num2 + "" + "%" + "" + num1 + " = " + result);
        }

        for(int i = 0; i < 1; i++) {
            if(result == (num1 * num1)){
                System.out.println(num1 + "" + "*" + "" + num1 + " = " + result);
            } else if(result == (num2 * num2)) {
                System.out.println(num2 + "" + "*" + "" + num2 + " = " + result);
            }
        }
    }
}