package absoft;
/*
Написать программу в которой пользователь будет вводить число (от 1 до 7)
и выводить соответствующий числу день недели (e.g. 1 - понедельник, 2 - вторник и т.д.)
Если число не в диапазоне от 1 до 7 - вывести текст "Ошибка, введите число от 1 до 7"
Используйте конструкцию switch - case
 */

import java.util.Scanner;

public class test4_Operators_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number in range between 1 and 7: ");
        String dayOfWeek = in.nextLine();

        switch (dayOfWeek){
            case "1" -> System.out.println("It's Monday my friend");
            case "2" -> System.out.println("It's Tuesday my friend");
            case "3" -> System.out.println("It's Wednesday my friend");
            case "4" -> System.out.println("It's Thursday my friend");
            case "5" -> System.out.println("It's Friday my friend");
            case "6" -> System.out.println("It's Saturday my friend");
            case "7" -> System.out.println("It's Sunday my friend");
            default -> System.out.println("Error. Please enter any number in range between 1 and 7");
        }
    }

}
