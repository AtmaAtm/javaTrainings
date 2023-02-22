package absoft;

/*
Напишите программу которая попросит пользователя ввести price и qty (перед вводом значений должен быть текст что именно нужно ввести)

Выведите в консоль "Total:" и результат который равен price * qty.
P.S. Price может быть как целым так и дробным числом. (e.g. 20,99)
 */

import java.util.Scanner;

public class test2_SumOfElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your price: ");
        var price = in.nextDouble();
        System.out.print("Please enter your quantity: ");
        int qty = in.nextInt();

        System.out.println("Total: " + price * qty);


    }

}