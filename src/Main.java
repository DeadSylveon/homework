import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        // Создаем 2 объекта классов Cat, Dog*
        Dog dog = new Dog("Джек", "серый", 3, 500, 10, 0.5f);
        Cat cat = new Cat("Пушинка", "черный", 5, 200, 2f);

        // Вызываем их методы
        dog.run(450);
        dog.run(550);
        dog.jump(0.4f);
        dog.jump(0.8f);
        dog.swim(8);
        dog.swim(20);
        System.out.println();
        cat.run(450);
        cat.run(150);
        cat.jump(0.4f);
        cat.jump(3.5f);
        cat.swim(6);
        System.out.println();

        // Создаем объект класса Dog, изменяя значения ограничений
        Dog dog2 = new Dog("Джек", "серый", 3, 700, 15, 1f);

        // Проверяем как изменяется результат работы методов
        dog2.run(450);
        dog2.run(550);
        dog2.jump(0.4f);
        dog2.jump(0.8f);
        dog2.swim(8);
        dog2.swim(20);
    }
}
