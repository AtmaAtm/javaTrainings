package absoft;

import java.util.Arrays;
import java.util.Scanner;

public class helper {
    public static String[] name() {
        String[] name = new String[5];
        return name;
    }

    public static double[] price() {
        double[] price2 = new double[5];
        return price2;

    }

    public static int[] qty() {
        int[] qty = new int[5];

        return qty;
    }

    public static void totals() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name: ");
        String [] name = name();
        for (int i = 0; i < name.length; i++){
            name[i] = in.next();
        }


        System.out.println("Enter price: ");
        double price = price().length;
        double[] priceNorm = new double[(int) price];
        for (int i = 0; i < priceNorm.length; i++){
            priceNorm[i] = in.nextInt();
            if (priceNorm[i] == 0){
                throw new IllegalArgumentException("Error. Thank you");
            }
        }

        System.out.println("Enter qty: ");
        int qty = qty().length;
        int [] qtyNorm = new int[qty];
        for (int i = 0; i < qtyNorm.length; i++){
            qtyNorm[i] = in.nextInt();
            if (qtyNorm[i] == 0){
                throw new IllegalArgumentException("Error. Thank you");
            }
        }


        double [] totalFinal = new double[5];

        for (double i = 0; i < totalFinal.length; i++){
            totalFinal[(int) i] = priceNorm[(int) i] * qtyNorm[(int) i];
            System.out.println(name[(int) i] + " | " + totalFinal[(int) i]);

        }
    }
}


