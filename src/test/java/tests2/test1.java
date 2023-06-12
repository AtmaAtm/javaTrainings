package tests2;
//"- Создайте класс Phone, который содержит переменные model, number и weight.
        //- Создайте getters и setters для model, number и weight.
       // - Внутри класса main, cоздайте три экземпляра этого класса Phone (iPhone, Samsung, Huawei).
      //  - Используя отдельный метод, введите каждому классу Phone (iPhone, Samsung, Huawei) свои уникальные значения model, number и weight с клавиатуры.
     //   - Используя отдельный метод, выведите все значения по каждому из Phone в формате:
     //   [phone model] :
    //    Model is [phone model]
   //     Number is [phone number]
   //     Weight is [phone weight]"

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        helperfortest1 iPhone = new helperfortest1();
        helperfortest1 Samsung = new helperfortest1();
        helperfortest1 Huawei = new helperfortest1();

        System.out.println("Add phone: ");

        iPhone.setModel(in.nextLine());
        iPhone.setNumber(in.nextInt());
        iPhone.setWeight(in.nextInt());

        System.out.println("Add another phone: ");

        Samsung.setModel(in.next());
        Samsung.setNumber(in.nextInt());
        Samsung.setWeight(in.nextInt());

        System.out.println("Add the last phone: ");

        Huawei.setModel(in.next());
        Huawei.setNumber(in.nextInt());
        Huawei.setWeight(in.nextInt());


        System.out.println(iPhone.getModel() + ": ");
        System.out.println("Model is: " + iPhone.getModel());
        System.out.println("Number is: " + iPhone.getNumber());
        System.out.println("Weight is: " + iPhone.getWeight() + " gr");

        System.out.println(Samsung.getModel() + ": ");
        System.out.println("Model is: " + Samsung.getModel());
        System.out.println("Number is: " + Samsung.getNumber());
        System.out.println("Weight is: " + Samsung.getWeight() + " gr");

        System.out.println(Huawei.getModel() + ": ");
        System.out.println("Model is: " + Huawei.getModel());
        System.out.println("Number is: " + Huawei.getNumber());
        System.out.println("Weight is: " + Huawei.getWeight() + " gr");



    }
}