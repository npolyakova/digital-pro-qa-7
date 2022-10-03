package demo;

import demo.Cat;

import static demo.Cat.count;
import static demo.Cat.countCats;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.age = 2;
        cat1.hungry = false;
        cat1.setName("Mimi");
        cat1.setName("");

        System.out.println("Имя кошки: " + cat1.getName());
        System.out.println("Возраст: " + cat1.age);
        System.out.println("Кошка голодная? " + cat1.hungry);
        System.out.println();

        cat1.wantToOut();
        System.out.println();

        Cat cat2 = new Cat("Мурзик", 3);
        cat2.age = 5;
        System.out.println("Имя кошки: " + cat2.getName());
        System.out.println("Возраст: " + cat2.age);
        System.out.println("Кошка голодная? " + cat2.hungry);

        System.out.println("\nЧисло кошек: " + count);
    }
}
