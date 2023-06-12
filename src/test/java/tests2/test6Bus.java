package tests2;
/* "Создайте класс ""Автобус"" (Bus) с вложенным классом ""Двигатель"" (Engine).
        Класс ""Двигатель"" должен иметь метод ""завести"" (Start) который выводит в консоль текст ""Двигатель автобуса заведен"".
        Класс ""Автобус"" должен использовать вложенный класс для создания и управления двигателем."
        
 */

public class test6Bus {
    public static void main(String[] args) {
        test6Bus bus = new test6Bus();
        test6Bus.Engine engine = bus.new Engine();

        engine.start();
        bus.problemOnTheRoad();
        bus.fixTheProblem();

    }
    private void problemOnTheRoad(){
        System.out.println("Двигатель горит!!");
    }
    private void fixTheProblem (){
        System.out.println("Срочная остановка автобуса");
    }

    private class Engine {
        private void start(){
            System.out.println("Двигатель автобуса заведен");
        }
    }
}
