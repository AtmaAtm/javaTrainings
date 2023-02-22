package absoft;

/*
Написать метод, который будет возвращать total (total = price * qty * 0.8)
Price может быть как целым числом так и дробным
Метод должен принимать значения price и qty (значения можете задать самостоятельно)
Вывести в консоль "Your total = " + результат
 */

import java.util.Scanner;

public class test11_methods1 {
    static double method(double price, int qty){
        var total = price * qty * 0.8;
        return  total;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter price: ");
        double price = in.nextDouble();
        System.out.println("Enter qty: ");
        int qty = in.nextInt();
        System.out.println("Your total = " + method(price, qty));
    }

    }

