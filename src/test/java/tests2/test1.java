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
            helperfortest1 iphone = new helperfortest1();
            helperfortest1 samsung = new helperfortest1();
            helperfortest1 huawei = new helperfortest1();

            // Set values for each instance using user input
            System.out.println("Enter details for the first phone:");
            setPhoneDetails(iphone);

            System.out.println("Enter details for the second phone:");
            setPhoneDetails(samsung);

            System.out.println("Enter details for the last:");
            setPhoneDetails(huawei);

            // Print all values for each Phone instance

            printPhoneDetails(iphone);


            printPhoneDetails(samsung);


            printPhoneDetails(huawei);
        }

        // Set model, number, and weight for a Phone instance
        public static void setPhoneDetails(helperfortest1 phone) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter model: ");
            String model = scanner.nextLine();

            System.out.print("Enter number: ");
            String number = scanner.nextLine();

            System.out.print("Enter weight: ");
            double weight = scanner.nextDouble();

            phone.setModel(model);
            phone.setNumber(number);
            phone.setWeight(weight);
        }

        // Print all values for a Phone instance
        public static void printPhoneDetails(helperfortest1 phone) {
            System.out.println(phone.getModel() + ": ");
            System.out.println("Model is: " + phone.getModel());
            System.out.println("Number is: " + phone.getNumber());
            System.out.println("Weight is: " + phone.getWeight());

        }
    }
