public class Human implements Movable {
    private double maxJump;
    private double maxRun;

    public Human(double maxJump, double maxRun) {
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }

    public double getMaxJump() {
        return maxJump;
    }

    public double getMaxRun() {
        return maxRun;
    }


    @Override
    public boolean run(double length) {
        if (length > maxRun){
            System.out.println("Human can't run " + length + " m. The race stops here!");
            return false;
        }
        else {
            System.out.println("Human runs " + length + " m.");
            return true;
        }
    }

    @Override
    public boolean jump(double height) {
        if (height > maxJump){
            System.out.println("Human can't jump " + height + " m. The race stops here!");
            return false;
        }
        else {
            System.out.println("Human jumps " + height + " m.");
            return true;
        }
    }
}
