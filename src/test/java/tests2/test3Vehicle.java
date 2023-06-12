package tests2;

// "Создайте абстрактный класс ""Транспортное средство"" (Vehicle) с абстрактным методом ""передвигаться"" (move).
  //      От него унаследуйте классы ""Автомобиль"" (Car), ""Велосипед"" (Bicycle) и ""Мотоцикл"" (Motorcycle).
  //      Каждый подкласс должен реализовать метод ""передвигаться"" в соответствии с особенностями передвижения."

public abstract class test3Vehicle {
    public static void main(String[] args) {
        helperfortest3Car car = new helperfortest3Car();
        car.move();
        helperfortest3Bicycle bicycle = new helperfortest3Bicycle();
        bicycle.move();
        helperfortest3Motorcycle motorcycle = new helperfortest3Motorcycle();
        motorcycle.move();
    }
    public abstract void move();
}
