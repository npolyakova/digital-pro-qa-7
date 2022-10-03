package car;

public class Car {

    //Создайте атрибуты класса Car — color (цвет), type (тип), year (год).
    private String color;
    private String type;
    private int year;

    //Первый — запуск автомобиля, при его вызове выводится сообщение «Автомобиль заведен».
    public void start() {
        System.out.println("Автомобиль заведен");
    }

    //Второй — отключение автомобиля — выводит сообщение «Автомобиль заглушен».
    public void stop() {
        System.out.println("Автомобиль заглушен");
    }

    //Третий — присвоение автомобилю года выпуска.
    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    //Четвертый метод — присвоение автомобилю типа.
    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    //Пятый — присвоение автомобилю цвета.
    public void setColor(String carColor) {
        color = carColor;
    }

    public String getColor() {
        return color;
    }

    public Car() {

    }

    public Car(String color, String type, int year) {
        this.color = color;
        this.type = type;
        this.year = year;
    }
}
