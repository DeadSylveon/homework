import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruitBox;

    public Box(ArrayList<T> fruitBox) {
        for (int i = 0; i < fruitBox.size()-1; i++) {
            if (fruitBox.get(i) instanceof Apple && (fruitBox.get(i+1) instanceof Apple)) continue;
            else if (fruitBox.get(i) instanceof Orange && (fruitBox.get(i+1) instanceof Orange)) continue;
            else throw new IllegalArgumentException("You are able to put only apples or only oranges!");

        }
        this.fruitBox = fruitBox;
    }

    public Float getWeight(){
        if (fruitBox.isEmpty()) return 0f;
        if (fruitBox.get(0) instanceof Apple)
            return fruitBox.size()*1.0f;
        else if (fruitBox.get(0) instanceof Orange)
            return fruitBox.size()*1.5f;
        return 0f;
    }

    public boolean compare(Box<T> box){
        return this.getWeight().equals(box.getWeight());
    }

    public void removeFruit(int index){
        fruitBox.remove(index);
    }

    public void addFruit(T fruit){
        fruitBox.add(fruit);
    }

    public void addFruit(ArrayList<T> fruits){
        fruitBox.addAll(fruits);
    }

    public void moveFruits(Box<T> box){
        box.addFruit(this.getFruitBox());
        if (fruitBox.size() > 0) {
            fruitBox.subList(0, fruitBox.size()).clear();
        }
    }

    public ArrayList<T> getFruitBox() {
        return fruitBox;
    }
}
