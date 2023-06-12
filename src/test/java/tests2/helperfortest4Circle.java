package tests2;

public class helperfortest4Circle extends test4{
    @Override
    public Object calculateArea() {

            double radius = 5;
            //Площадь круга вычисляется по формуле = PI*radius*radius
            double area = Math.PI * (radius * radius);

        return area;
    }


    }

