package absoft;

import java.util.Scanner;

public class test15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Add any phrase: ");
        String myString = in.nextLine();
        String myString2 = myString.replaceAll(" ","");

        StringBuffer buffer = new StringBuffer(myString2);
        buffer.reverse();
        String data = buffer.toString();
        if(myString2.equalsIgnoreCase(data)){
            System.out.println("Given String is palindrome");
        }else{
            System.out.println("Given String is not palindrome");
        }


    }
}

