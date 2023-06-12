package tests2;

// "Создайте класс ""Фигура"" (Shape) с методом который считает площадь ""calculateArea()"".
   //      От него унаследуйте классы ""Круг"" (Circle), ""Прямоугольник"" (Rectangle) и ""Треугольник"" (Triangle).
   //     Каждый класс должен реализовать метод по расчету площади в соответствии с правилами для своей фигуры.
   //     Создайте массив объектов типа ""Фигура"" (Shape) и выведите площадь каждой фигуры на экран используя метод из класса Shape"
public class test4 {

    public Object calculateArea() {

        return null;
    }


    public static void main(String[] args) {
        Object[] shapes = new Object[3];

        test4 test4 = new helperfortest4Circle();
        shapes[0] = test4.calculateArea();

        test4 test41 = new helperfortest4Rectangle();
        shapes[1] = test41.calculateArea();

        test4 test42 = new helperfortest4Triangle();
        shapes[2] = test42.calculateArea();

        for (Object p : shapes){
            System.out.println(p);
        }



    }


}