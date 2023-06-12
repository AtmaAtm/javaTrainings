package tests2;

import absoft.tets5;

public class helperfortest5Rectangle implements tets5 {
    public final double NUM1 = 5;
    public final double NUM2 = 7;
    @Override
    public void calculateArea() {
        //Формула для нахождения площади

        double side1 = (NUM1 * NUM2);
        System.out.println("Площадь прямоугольника: " + side1);

    }

    @Override
    public void calculatePerimeter() {
        //Формула для нахождения периметра прямоугольника
        double side2 = (NUM1 + NUM1)*2;
        System.out.println("Периметр прямоугольника: " + side2);

    }

    public static void main(String[] args) {
        helperfortest5Rectangle rectangle = new helperfortest5Rectangle();
        rectangle.calculateArea();
        rectangle.calculatePerimeter();
    }
}
