package absoft;

/*
Создать массив array из 5 имен ("John", "Dan", "Ashe", "Carl", "Bill")
Отсортируйте массив по алфавиту
Добавьте в конец новый елемент массива - "Stan"
Выведите в стобик все елементы массива (каждое имя должно быть с новой строки)
 */


import java.util.Arrays;

public class test10_array2 {
    public static void main(String[] args) {
        String[] names = {"John", "Dan", "Ashe", "Carl", "Bill"};
        System.out.println("First condition of array: " + '\n' + Arrays.toString(names) + '\n');
        Arrays.sort(names);

        int namesLenght = names.length;
        String newName = "Stan";

        String[] newName1 = new String[namesLenght + 1];
        for (int i = 0; i < names.length; i++){
            newName1[i] = names[i];
        } newName1[newName1.length - 1] = newName;
        names = newName1;
            System.out.println("Final version with new item: " + '\n' + names[0] + '\n' + names[1] + '\n' + names[2] + '\n' + names[3] + '\n' + names[4] + '\n' + names[5]);

    }
}
