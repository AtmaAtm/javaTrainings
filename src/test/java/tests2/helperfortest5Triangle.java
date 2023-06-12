package tests2;
import absoft.tets5;

public class helperfortest5Triangle implements tets5 {
    @Override
    public void calculateArea() {
        //Площадь треугольника вычисляется по формуле = (width*height)/2
        double width = 4;
        double height = 8;
        double area = (width * height) / 2;
        System.out.println("Площать треугольника: " + area);

    }

    @Override
    public void calculatePerimeter() {
        int a = 4;
        int b = 8;
        int c = 8;
        int perimeter = a + b + c;
        System.out.println("Периметр треугольника: " + perimeter);

    }

    public static void main(String[] args) {
        helperfortest5Triangle triangle = new helperfortest5Triangle();
        triangle.calculateArea();
        triangle.calculatePerimeter();
    }
}