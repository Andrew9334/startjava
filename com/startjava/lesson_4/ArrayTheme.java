package com.startjava.lesson_4;

import java.util.Arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");

        int[] intArr = {4, 3, 5, 7, 6, 1, 2};

        for (int i = 0; i < intArr.length; i++) {
            for (int j = i + 1; j < intArr.length; j++) {
                if (intArr[i] < intArr[j]) {
                    int temp = intArr[i];
                    intArr[i] = intArr[j];
                    intArr[j] = temp;
                }
            }
        }

        printIntArray(intArr);

        System.out.println("\n\n2. Вывод произведения элементов массива");

        intArr = new int[10];

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = i;
        }
        int result = 1;
        for (int i = 1; i < intArr.length - 1; i++) {
            result *= intArr[i];
            System.out.print(intArr[i] + (intArr[i] < 8 ? " * " : " = " + result));
        }

        System.out.println("\n\n3. Удаление элементов массива");

        double[] doubleArr = new double[15];
        int numberOfNumbersPerLine = 0;

        System.out.println("Исходный массив ");
        for (int i = 0; i < doubleArr.length; i++) {
            doubleArr[i] = Math.random();
            System.out.printf("%.3f ", doubleArr[i]);
            numberOfNumbersPerLine++;
            if (numberOfNumbersPerLine > 7) {
                numberOfNumbersPerLine = 0;
                System.out.println();
            }
        }

        System.out.println();

        int count = 0;
        int index = 0;
        double avgNumber = 0;
        for (int i = 0; i < doubleArr.length; i++) {
            index = doubleArr.length / 2;
            avgNumber = doubleArr[index];
        }

        System.out.print("\nИзмененный массив ");
        for (int i = 0; i < doubleArr.length; i++) {
            if (doubleArr[i] > avgNumber) {
                doubleArr[i] = 0;
                count++;
            }
            numberOfNumbersPerLine++;
            if (numberOfNumbersPerLine > 7) {
                numberOfNumbersPerLine = 0;
                System.out.println();
            }
            System.out.printf("%.3f ", doubleArr[i]);
        }
        System.out.println();
        System.out.println("\nКоличество обнуленных ячеек " + count);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");

        int letters = 26;
        char[] charArray = new char[26];

        for (int i = 0; i < letters; i++) {
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
        numberOfNumbersPerLine = 0;

        for (int i = 0; i < intArr.length; i++) {
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

        for (int i = 0; i < intArr.length; i++) {
            for (int j = i + 1; j < intArr.length; j++) {
                if (intArr[j] < intArr[i]) {
                    int temp = intArr[j];
                    intArr[j] = intArr[i];
                    intArr[i] = temp;
                }
            }
            if (numberOfNumbersPerLine > 9) {
                numberOfNumbersPerLine = 0;
                System.out.println();
            }
            numberOfNumbersPerLine++;
            System.out.printf("%3d ", intArr[i]);
        }

        System.out.println("\n\n6. Сдвиг элементов массива");

        String[] srcArray = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        int countNotBlank = 0;
        for (int i = 0; i < srcArray.length; i++) {
            if (!srcArray[i].isBlank()) {
                countNotBlank++;
            }
        }

        String[] destArray = new String[countNotBlank];

        int srcPos = 0;
        int destPos = 0;
        int len = 0;

        for (int i = 0; i < srcArray.length; i++) {
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

    private static void printStringArray(String[] stringArray) {
        for (String s : stringArray) {
            System.out.print(s + " ");
        }
    }
}

