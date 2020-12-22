public class MyArrayDataException extends NumberFormatException{
    private int x;
    private int y;

    public MyArrayDataException(String s, int x, int y) {
        super(s);
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
