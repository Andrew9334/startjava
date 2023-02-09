package com.startjava.lesson_4;

import java.util.Arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");

        int[] intArr = {4, 3, 5, 7, 6, 1, 2};
        int length = intArr.length;
        for (int i = 0; i < length / 2; i++) {
            int temp = intArr[i];
            intArr[i] = intArr[length - i - 1];
            intArr[length - i - 1] = temp;
        }

        printIntArray(intArr);

        System.out.println("\n\n2. Вывод произведения элементов массива");

        intArr = new int[10];
        length = intArr.length;
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = i;
        }
        int result = 1;
        for (int i = 1; i < intArr.length - 1; i++) {
            result *= intArr[i];
            System.out.print(intArr[i] + (i != length - 2 ? " * " : " = " + result));
        }

        System.out.println("\n\n3. Удаление элементов массива");

        double[] doubleArr = new double[15];
        length = doubleArr.length;
        System.out.println("Исходный массив ");
        for (int i = 0; i < length; i++) {
            doubleArr[i] = Math.random();
        }

        printDoubleArray(doubleArr);

        System.out.println();

        int count = 0;
        int index = length / 2;
        double avgNumber = doubleArr[index];

        System.out.println("\nИзмененный массив ");
        for (int i = 0; i < length; i++) {
            if (doubleArr[i] > avgNumber) {
                doubleArr[i] = 0;
                count++;
            }
        }

        printDoubleArray(doubleArr);

        System.out.println("\n\nКоличество обнуленных ячеек " + count);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");

        length = 26;
        char[] charArray = new char[length];

        for (int i = 0; i < length; i++) {
            charArray[i] = (char) (90 - i);
            for (int j = 0; j < 26; j++) {
                if (j <= i) {
                    System.out.print(charArray[j]);
                } else {
                    break;
                }
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");

        intArr = new int[30];
        length = intArr.length;

        for (int i = 0; i < length; i++) {
            double array = 60 + Math.random() * 40;
            intArr[i] = (int) array;

            for (int j = 0; j < i; j++) {
                if (i == j) {
                    continue;
                } else if (intArr[i] == intArr[j]) {
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

        System.out.println("\n\n6. Сдвиг элементов массива");

        String[] srcArray = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        length = srcArray.length;
        int countNotBlank = 0;
        for (int i = 0; i < length; i++) {
            if (!srcArray[i].isBlank()) {
                countNotBlank++;
            }
        }

        String[] destArray = new String[countNotBlank];

        int srcPos = 0;
        int destPos = 0;
        int len = 0;

        for (int i = 0; i < length; i++) {
            if (srcArray[i].isBlank()) {
                System.arraycopy(srcArray, srcPos, destArray, destPos, len);
                srcPos = i + 1;
                destPos += len;
                len = 0;
            } else {
                len++;
            }
        }
        System.out.println("Исходный массив");
        printStringArray(srcArray);
        System.out.println("\nИзмененный массив");
        printStringArray(destArray);
    }

    private static void printIntArray(int[] intArray) {
        for (int i : intArray) {
            System.out.print(i + " ");
        }
    }

    private static void printIntArraySample(int[] intArray) {
        int length = intArray.length;
        for (int i = 0; i < length; i++) {
            if (i == (length / 2 - 5) || i == length / 2 + 5) {
                System.out.println();
            }
            System.out.printf("%3d ", intArray[i]);
        }
    }

    private static void printDoubleArray(double[] doubleArray) {
        int length = doubleArray.length;
        for (int i = 0; i < length; i++) {
            System.out.printf("%.3f ", doubleArray[i]);
            if (i == length / 2) {
                System.out.println();
            }
        }
    }

    private static void printStringArray(String[] stringArray) {
        for (String s : stringArray) {
            System.out.print(s + " ");
        }
    }
}

