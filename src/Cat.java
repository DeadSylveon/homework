public class Cat extends Animal{

    public Cat(String name, String color, int age, int runMax, float jumpMax) {
        super(name, color, age);
        this.runMax = runMax;
        this.jumpMax = jumpMax;
        this.swimMax = 0;
    }

    @Override
    public void run(int length) {
        if (length > runMax) System.out.println(this.name + " не может пробежать больше " + runMax + " м!");
        else System.out.println(this.name + " пробежал " + length + " м!");
    }

    @Override
    public void swim(int length) {
        System.out.println(this.name + " не умеет плавать!");
    }

    @Override
    public void jump(float height) {
        if (height > jumpMax) System.out.println(this.name + " не может прыгнуть выше " + jumpMax + " м!");
        else System.out.println(this.name + " прыгнул на высоту  " + height + " м!");
    }

}
