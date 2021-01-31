import java.util.ArrayList;

public class Box<T extends Fruit> {
    ArrayList<T> fruitBox = new ArrayList<T>();

    public Float getWeight(){
        if (fruitBox.get(0) instanceof Apple)
            return fruitBox.size()*1.0f;
        else if (fruitBox.get(0) instanceof Orange)
            return fruitBox.size()*1.5f;
        return 0f;
    }

    public Box(ArrayList<T> fruitBox) {
        this.fruitBox = fruitBox;
    }
}
