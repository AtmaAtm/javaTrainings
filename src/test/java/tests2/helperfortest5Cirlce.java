package tests2;

import absoft.tets5;

public class helperfortest5Cirlce implements tets5 {
     public final double RADIUS = 5;
    @Override
    public void calculateArea() {
        //Площадь круга вычисляется по формуле = PI*radius*radius
        double area = Math.PI * (RADIUS * RADIUS);
        System.out.println("Площадь круга: " + area);

    }

    @Override
    public void calculatePerimeter() {
        double circumference= Math.PI * 2* RADIUS;
        System.out.println("Периметр круга: " + circumference);

    }

    public static void main(String[] args) {

        helperfortest5Cirlce cirlce = new helperfortest5Cirlce();
        cirlce.calculateArea();
        cirlce.calculatePerimeter();


    }
}
