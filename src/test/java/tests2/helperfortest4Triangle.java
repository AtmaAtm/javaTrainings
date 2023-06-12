package tests2;

public class helperfortest4Triangle extends test4 {

    @Override
    public Object calculateArea() {
        //Площадь треугольника вычисляется по формуле = (width*height)/2
        double width = 4;
        double height = 8;
        double area = (width * height)/2;


        return area;
    }
}
