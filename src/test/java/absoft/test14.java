package absoft;

import java.util.Scanner;

public class test14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Select first number: ");
        int num = in.nextInt();
        System.out.print("Select second number: ");
        int num2 = in.nextInt();

        for (int i = num; i <= num2; i++) {
            System.out.println(i);
        }

    }
}
