package geekbrains.java_level_one.ovchinnikov.lesson_one;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Arrays;

public class HW2 {

    //1 задание
    private static void change(int[] array) {
        // создаем массив со значениями
        // Инициализируем цикл для прохождения по массиву
        for (int i = 0; i < array.length; i++)
            if (array[i] == 0) array[i] =1;  // мое решение
                else
                    array[i] = 0;

           // вариант 2 через тернарный оператор -  array[i] = (array[i] == 1) ? 0 : 1;
            // вариант 3 бинарная алгебра- array[i] ^= 1;  // 1^1 = 0; 0^1 =1; -

    }
        // 2 задание
    private static void fillIn(int[] array) {
        for (int i = 0; i < array.length; i++)
            array[i] = i * 3;
    }

    // 3 задание
        private static void doubleing(int[] array){
            for (int i = 0; i < array.length; i++)
                if (array[i] < 6)
                    array[i] *= 2;
        }
        // задание 4
    private static void crossFill(int[][] array){
        int strght; // переменная начинает с левого верхнего угла и на каждой итерации сдвигается на шаг вправо
        int bckwd; // переменная начинает с правого верхнего угла и на каждой итерации сдвигается на шаг влево

        for (strght = 0,
                bckwd = array.length - 1;
        strght < array.length;

            strght++,
        bckwd --) {
    array[strght][bckwd] = 1;
    array[strght][strght] = 1;
        }

    }
    private static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++)
            min = (array[i] < min) ? array[i] : min;
        return min;
    }

        // 5 задание
        private static int findMax(int[] array) {
            int max = array[0];
            for (int i = 0; i < array.length; i++)
                max = (array[i] > max) ? array[i] : max; // тернарный  оператор
            //вариант 2 if(array[i] > max) max = array[i];
            return max;

        }
        /*
    private static float power(float base, float significative) {
        float res = 1.0f;
        for (int i  = 0; i < significative; i ++) {
            res*= base;
        }
        return res;
    } */

    // задание 6
    private static boolean checkBalance(int [] array) {
        int right = 0, left = 0;
        for (int i = 0; i < array.length - 1; i++) {
            left += array[i];
            for (int j = 0; j < array.length - 1; j++)
                right +=array[i];
            if (left == right) return true;
            right = 0;
        }
        return false;
    }

    //задание 7
    private static void shifter(int[] array, int value){
        boolean direction;
        if (value < 0) {
            direction = true;
            value =- value;
        } else {
            direction = false;
        }
        int lastIndex = array.length - 1;
        for (int i = 0; i < value; i++) {
            int temp = (direction) ? array[0] : array[lastIndex];
                for (int j = 0; j < lastIndex; j++) {
                    if (direction)
                        array[i] = array[j + 1];
                    else
                        array[lastIndex - 1] = array[lastIndex - j - 1];
                }
                if (direction)
                    array[lastIndex] = temp;
                else
                    array[0] = temp;
        }
    }


    public static void main(String[] args) {

        /*1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0; */
        System.out.println("Задание 15");
        int[] numbers = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("массив до:\t" + Arrays.toString(numbers));
        change(numbers); // метод принимает массив и преобразует
        System.out.println("Массив после:\t" + Arrays.toString(numbers));


         /* 2. Задать пустой целочисленный массив размером 8.
    С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21; */
        System.out.println(" ");
        System.out.println("Задание 2");
        numbers = new int[8];
        fillIn(numbers);
        System.out.println(Arrays.toString(numbers));


    /* 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    пройти по нему циклом, и числа меньшие 6 умножить на 2; */
        System.out.println(" ");
        System.out.println("Задание 3");
       int[]mas = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
       doubleing(mas);
        System.out.println(Arrays.toString(mas));


    /* 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     и с помощью цикла(-ов) заполнить его диагональные элементы единицами; */
        System.out.println(" ");
        System.out.println("Задание 4");

        int[][] diagonals = new int[4][4];  //пустой
        crossFill(diagonals);
        System.out.println(Arrays.toString(diagonals));


        /* 5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы */
        System.out.println(" ");
        System.out.println("Задание 5");
        System.out.println("Max: " + findMax(mas));
        System.out.println("Min: " + findMin(mas));


    /* 6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
     метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части массива равны.
     Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false,
      checkBalance ([10, || 10]) → true, граница показана символами ||, эти символы в массив не входят. */
        System.out.println(" ");
        System.out.println("Задание 6");
        int[] pow = {2, 1, 1, 2, 1};



    /* 7. **** Написать метод, которому на вход подается одномерный массив и число n
    (может быть положительным, или отрицательным), при этом метод должен сместить все элементымассива на n позиций.
     Для усложнения задачи нельзя пользоваться вспомогательными массивами.*/

        System.out.println(" ");
        System.out.println("Задание 7");
        int[] shiftArray = {0,1,2,3,4,5,6,7,8,9};
        shifter(shiftArray,-13);
        System.out.println("-13" + Arrays.toString(shiftArray));
        shifter(shiftArray, 16);
        System.out.println("+16" + Arrays.toString(shiftArray));
    }
}

