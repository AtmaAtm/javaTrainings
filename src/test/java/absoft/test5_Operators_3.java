package absoft;
/*
Написать программу в которой пользователь будет вводить число (от 1 до 7)
и выводить соответствующий числу день недели (e.g. 1 - понедельник, 2 - вторник и т.д.)
Если число не в диапазоне от 1 до 7 - вывести текст "Ошибка, введите число от 1 до 7"
Используйте конструкцию if-else-if
 */

import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.in;

public class test5_Operators_3 {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter any number in range between 1 and 7: ");
        Scanner in = new Scanner(System.in);

        int dayOfWeek = in.nextInt();

        if (dayOfWeek == 1){
        System.out.println("It's Monday my friend");
    } else if (dayOfWeek == 2) {
        System.out.println("It's Tuesday my friend");
    } else if (dayOfWeek == 3) {
        System.out.println("It's Wednesday my friend");
    } else if (dayOfWeek == 4) {
        System.out.println("It's Thursday my friend");
    } else if (dayOfWeek == 5) {
        System.out.println("It's Friday my friend");
    } else if (dayOfWeek == 6) {
        System.out.println("It's Saturday my friend");
    } else if (dayOfWeek == 7) {
        System.out.println("It's Sunday my friend");
    } else System.out.println("Error. Please enter any number in range between 1 and 7");

    }

    }
