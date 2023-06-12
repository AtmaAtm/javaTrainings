package tests2;
//"Создайте класс ""Фигура"" (Shape) с методом который выводит текст ""Это фигура""
  //      От него унаследуйте классы ""Круг"" (Circle), ""Прямоугольник"" (Rectangle) и ""Треугольник"" (Triangle).
  //      Каждый класс должен переопределить метод используемый в Shape для вывода имени соответствующей фигуры.
   //     В результате выведите на экран 3 названия фигуры:
   //     ""Это круг""
   //     ""Это прямоуголькик""
   //     ""Это треугольник"""
public class test2Shapes {

    public void methodForShape() {
        System.out.println("This is Shape");
    }

    public static void main(String[] args) {
        helperfortest2Circle value = new helperfortest2Circle();
        value.methodForShape();
        helperfortest2Rectangle value2 = new helperfortest2Rectangle();
        value2.methodForShape();
        helperfortest2Triangle value3 = new helperfortest2Triangle();
        value3.methodForShape();
    }
}
