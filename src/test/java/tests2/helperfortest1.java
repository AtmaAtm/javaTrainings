package tests2;

public class helperfortest1 {
    //"- Создайте класс Phone, который содержит переменные model, number и weight.
    //- Создайте getters и setters для model, number и weight.
    // - Внутри класса main, cоздайте три экземпляра этого класса Phone (iPhone, Samsung, Huawei).
    //  - Используя отдельный метод, введите каждому классу Phone (iPhone, Samsung, Huawei) свои уникальные значения model, number и weight с клавиатуры.
    //   - Используя отдельный метод, выведите все значения по каждому из Phone в формате:
    //   [phone model] :
    //    Model is [phone model]
    //     Number is [phone number]
    //     Weight is [phone weight]"

    public String model;
    public int number;
    public int weight;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
