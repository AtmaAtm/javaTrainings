package absoft;

/*
Создать массив array из 10 целых чисел
C помощью цикла записать в массив числа от 1 до 10
Вывести в консоль все записанные в него числа в следующем виде - [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 */

import java.lang.reflect.Array;
import java.util.Arrays;

public class test9_array {
    public static void main(String[] args) {
        int[] number = new int[10];
        for (int i = 0; i < number.length; i++){
            number[i] = i; }
            System.out.println(Arrays.toString(number) + 1);




    }
}
