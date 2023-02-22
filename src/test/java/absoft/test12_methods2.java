package absoft;

/*
Написать 2 метода:
- Первый метод должен принимать как параметр имя пользователя (одно из трех - "Alex", "John", "Stan") и
выводить в консоль текст "Hello [имя]"
- Второй метод должен принимать как параметр имя, которое было введено в первом методе и выводить в
консоль номер места (1, 2 или 3) с соответствующим текстом ("Your seat is [номер места]")
Если имя не "Alex", "John" или "Stan" - вывести в консоль "Sorry, name was not found"
 */

import java.util.Scanner;

public class test12_methods2 {
    static String method(String name) {
        return name;
    }
    public static int method1(int place) {
        return place;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = in.nextLine();
        if (method(name).equals("Alex")) {
            System.out.println("Hello " + name);
            System.out.println("Your place is " + method1(12));
        } else if (method(name).equals("John")){
            System.out.println("Hello " + name);
            System.out.println("Your place is " + method1(21));
        } else if (method(name).equals("Stan")){
            System.out.println("Hello " + name);
            System.out.println("Your place is " + method1(65));
        } else System.out.println("Sorry, name was not found");


    }
}