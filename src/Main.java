public class Main {
    public static void main(String[] args) {
        Obstacle[] obstacles = {new Treadmill(46), new Wall(1.1), new Treadmill(49), new Wall(1.8)};
        Movable[] movables = {new Cat(2, 100), new Human(1.4, 90), new Robot(0.5, 70)};

        for (Movable movable: movables) {
            System.out.println("-----------------------------------");
            for (Obstacle obstacle: obstacles) {
                if (obstacle instanceof Treadmill){
                    if (!movable.run(((Treadmill) obstacle).getLength())) break;
                }
                if (obstacle instanceof Wall){
                    if (!movable.jump(((Wall) obstacle).getHeight())) break;
                }

            }
        }
        System.out.println("-----------------------------------");
    }
}
