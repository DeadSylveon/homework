public abstract class Animal {
    String name;
    String color;
    int age;
    int runMax;
    int swimMax;
    float jumpMax;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public abstract void run(int length);

    public abstract void swim(int length);

    public abstract void jump(float height);
}
