import org.w3c.dom.ls.LSOutput;

public class Dog extends Animal{

    public Dog(String name, String color, int age, int runMax, int swimMax, float jumpMax) {
        super(name, color, age);
        this.runMax = runMax;
        this.swimMax = swimMax;
        this.jumpMax = jumpMax;
    }

    @Override
    public void run(int length) {
        if (length > runMax) System.out.println(this.name + " не может пробежать больше " + runMax + " м!");
        else System.out.println(this.name + " пробежал " + length + " м!");
    }

    @Override
    public void swim(int length) {
        if (length > swimMax) System.out.println(this.name + " не может проплыть больше " + swimMax + " м!");
        else System.out.println(this.name + " проплыл " + length + " м!");
    }

    @Override
    public void jump(float height) {
        if (height > jumpMax) System.out.println(this.name + " не может прыгнуть выше " + jumpMax + " м!");
        else System.out.println(this.name + " прыгнул на высоту " + height + " м!");
    }

}
