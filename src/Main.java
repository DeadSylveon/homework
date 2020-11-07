import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /* 1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0; */
        System.out.println("Задание 1:");
        int[] array = {0, 1, 0, 0, 0 , 1, 0, 1};
        System.out.println("Массив до вызова метода:" + Arrays.toString(array));
        System.out.println("Массив после вызова метода:" + Arrays.toString(changeNumbers(array)) + "\n");

        /* 2 Задать пустой целочисленный массив размером 8.
        Написать метод, который помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22; */
        System.out.println("Задание 2:");
        System.out.println(Arrays.toString(progressionArray()) + "\n");

        /* 3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ].
        Написать метод, принимающий на вход массив и умножающий числа меньше 6 на 2; */
        System.out.println("Задание 3:");
        int[] array2 = {5, 2, 7, 23, 0, 5, -3};
        System.out.println("Массив до вызова метода:" + Arrays.toString(array2));
        System.out.println("Массив после вызова метода:" + Arrays.toString(multiplyArray(array2)) + "\n");

        /* 4 Задать одномерный массив.
        Написать методы поиска в нём минимального и максимального элемента; */
        System.out.println("Задание 4:");
        System.out.println("Массив: " + Arrays.toString(array2));
        System.out.println("Минимальное значение в массиве: " + arrayMin(array2));
        System.out.println("Максимальное значение в массиве: " + arrayMax(array2) + "\n");

        /* 5 * Создать квадратный целочисленный массив (количество строк и столбцов одинаковое),
        заполнить его диагональные элементы единицами, используя цикл(ы); */
        System.out.println("Задание 5:");
        int[][] array3 = squareArray(7, 7);
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[array3.length-1].length; j++) {
                System.out.print(array3[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        /* 6 ** Написать метод, в который передается не пустой одномерный целочисленный массив,
        метод должен вернуть true если в массиве есть место,
        в котором сумма левой и правой части массива равны.
        Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false, checkBalance ([10, || 1, 2, 3, 4]) → true.
        Абстрактная граница показана символами ||, эти символы в массив не входят. */
        System.out.println("Задание 6:");
        int[] array4 = {4, 2, 6, 0, 6, 6};
        System.out.print("Массив " + Arrays.toString(array4) + " ");
        if (isPartsEqual(array4)) System.out.println("подходит под условие задания (метод возвращает значение true).");
        else System.out.println("не подходит под условие задания (метод возвращает значение false).");

        int[] array5 = {1, 2, 6, 0, 1, 6};
        System.out.print("Массив " + Arrays.toString(array5) + " ");
        if (isPartsEqual(array5)) System.out.println("подходит под условие задания (метод возвращает значение true).");
        else System.out.println("не подходит под условие задания (метод возвращает значение false).\n");

        /* 7 *** Написать метод, которому на вход подаётся одномерный массив и число n (может быть положительным, или отрицательным),
        при этом метод должен циклически сместить все элементы массива на n позиций. */
        System.out.println("Задание 7:");
        int[] array6 = new int[]{1, 2, 7, 4, 3, 6, 8, 10};
        int[] array7 = new int[]{1, 2, 7, 4, 3, 6, 8, 10};
        System.out.println("Начальный массив: " + Arrays.toString(array6));
        System.out.println("Массив после вызова метода с n = 4: ");
        System.out.println(Arrays.toString(shiftArray(array6, 4)));
        System.out.println("Массив после вызова метода с n = -4: ");
        System.out.println(Arrays.toString(shiftArray(array7, -4)));
    }

    private static int[] changeNumbers(int[] array){ // метод для задания 1
        int[] returnArray = new int[array.length];
        for (int i = 0; i < returnArray.length; i++) {
            returnArray[i] = array[i] == 1 ? 0 : 1;
        }
        return returnArray;
    }

    private static int[] progressionArray(){ // метод для задания 2
        int[] returnArray = new int[8];
        int content = 1;
        for (int i = 0; i < returnArray.length; i++) {
            returnArray[i] = content;
            content +=3;
        }
        return returnArray;
    }

    private static int[] multiplyArray(int[] array){ // метод для задания 3
        int[] returnArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            returnArray[i] = array[i] < 6 ? array[i] * 2 : array[i];
        }
        return returnArray;
    }

    private static int arrayMin(int[] array){ // метод для задания 4
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) min = array[i];
        }
        return min;
    }

    private static int arrayMax(int[] array){ // метод для задания 4
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }
        return max;
    }

    private static int[][] squareArray(int sizeX, int sizeY){ // метод для задания 5
        int[][] array = new int[sizeX][sizeY];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[array.length-1].length; j++) {
                if (i == j || i + j == array.length - 1)array[i][j] = 1;
            }
        }
        return array;
    }

    private static boolean isPartsEqual(int[] array){ // метод для задания 6
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < array.length; i++) {
            rightSum += array[i];
        }
        for (int i = 0; i < array.length; i++) {
            rightSum -= array[i];
            leftSum += array[i];
            if (rightSum == leftSum) return true;
        }
        return false;
    }

    private static int[] shiftArray(int[] array, int n){ // метод для задания 7
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                for (int j = array.length - 1; j > 0; j--) {
                    array[j] = array[j - 1];
                    if (j == 1) array[0] = 0;
                }
            }
        }
        else if (n < 0){
            for (int i = 0; i < Math.abs(n); i++) {
                for (int j = 0; j < array.length-1; j++) {
                    array[j] = array[j + 1];
                    if (j == array.length - 2) array[array.length - 1] = 0;
                }
            }
        }
        return array;
    }
}
