package com.startjava.lesson_4;

import java.util.Arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");

        int[] intArr = {4, 3, 5, 7, 6, 1, 2};
        int length = intArr.length;
        System.out.println("Исходный массив");
        printIntArray(intArr);

        for (int i = 0; i < length; i++) {
            int temp = intArr[i];
            intArr[i] = intArr[--length];
            intArr[length] = temp;
        }
        System.out.println("\n\nИзмененный массив");
        printIntArray(intArr);

        System.out.println("\n\n2. Вывод произведения элементов массива");

        intArr = new int[10];
        length = intArr.length;
        for (int i = 0; i < length; i++) {
            intArr[i] = i;
        }

        int result = 1;
        for (int i = 1; i < length - 1; i++) {
            result *= intArr[i];
            System.out.print(intArr[i] + (i != length - 2 ? " * " : " = " + result));
        }

        System.out.println("\n" + intArr[0] + " и " + intArr[9]);

        System.out.println("\n3. Удаление элементов массива");

        double[] doubleArr = new double[15];
        length = doubleArr.length;

        for (int i = 0; i < length; i++) {
            doubleArr[i] = Math.random();
        }
        System.out.println("Исходный массив ");
        printDoubleArray(doubleArr);

        int count = 0;
        double middleCellValue = doubleArr[length / 2];

        System.out.println("\nИзмененный массив ");
        for (int i = 0; i < length; i++) {
            if (doubleArr[i] > middleCellValue) {
                doubleArr[i] = 0;
                count++;
            }
        }

        printDoubleArray(doubleArr);
        System.out.println("\nКоличество обнуленных ячеек - " + count);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");

        length = 26;
        char[] alphabet = new char[length];

        for (int i = 0; i < length; i++) {
            alphabet[i] = (char) ('A' + i);
        }

        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                    System.out.print(alphabet[length - 1 - j]);
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");

        intArr = new int[30];
        length = intArr.length;
        for (int i = 0; i < length; i++) {
            double randomNumber = 60 + Math.random() * 40;
            intArr[i] = (int) randomNumber;

            for (int j = 0; j < i; j++) {
                if (i == j) {
                    continue;
                } else if (intArr[j] == intArr[i]) {
                    i--;
                    break;
                }
            }
        }

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (intArr[j] < intArr[i]) {
                    int temp = intArr[j];
                    intArr[j] = intArr[i];
                    intArr[i] = temp;
                }
            }
        }
        printIntArraySample(intArr);

        System.out.println("\n6. Сдвиг элементов массива");

        String[] srcArray = {"    ", "AA", "", "BBB", "CC", "D","    ", "E", "FF", "G", ""};
        int countNotBlank = 0;
        length = srcArray.length;

        printStringArray(srcArray);

        for (String string : srcArray) {
            if (!string.isBlank()) {
                countNotBlank++;
            }
        }

        String[] destArray = new String[countNotBlank];

        int srcPos = 0;
        int destPos = 0;
        length = 0;

        for (int i = 0; i < srcArray.length; i++) {
            if (!srcArray[i].isBlank()) {
                if (length == 0) {
                    srcPos = i;
                }
                length++;
            }
            if (length != 0 && srcArray[i].isBlank() == true) {
                System.arraycopy(srcArray, srcPos, destArray, destPos, length);
                destPos += length;
                length = 0;
            }
        }
        printStringArray(destArray);
    }

    private static void printIntArray(int[] intArray) {
        for (int i : intArray) {
            System.out.print(i + " ");
        }
    }

    private static void printIntArraySample(int[] intArray) {
        int length = intArray.length;
        for (int i = 0; i < intArray.length; i++) {
            if (i == length / 2 - 5 || i == length / 2 + 5) {
                System.out.println();
            }
            System.out.printf("%3d ", intArray[i]);
        }
    }

    private static void printDoubleArray(double[] doubleArray) {
        int length = doubleArray.length;
        for (int i = 0; i < length; i++) {
            System.out.printf("%.3f ", doubleArray[i]);
            if (i == 7) {
                System.out.println();
            }
        }
        System.out.println();
    }

    private static void printStringArray(String[] stringArray) {
        for (String s : stringArray) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}

