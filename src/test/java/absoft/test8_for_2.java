package absoft;
/*
Написать программу в которой пользователь должен ввести целое число (n) в диапазоне от 1 до 20
Вывести в консоль ТОЛЬКО числа от 1 до n (включительно)
Если введенное пользователем число (n) меньше 1 или больше 20 - вывести текст "Ошибка, введите число от 1 до 20"
 */

import java.util.Scanner;

public class test8_for_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Select any number between 1 and 20: ");
        int number = in.nextInt();


        if (number < 1 || number > 20) {
            System.out.println("Error. Select number between 1 and 20");
        } else for (int num = 1; num <= number; num++) {
            System.out.println(num);


        }
    }
}