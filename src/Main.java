import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task #1:");
        System.out.println("Using method to String array:");
        String[] words = {"hello", "what", "how", "so", "many"};
        System.out.println(Arrays.toString(words));
        swapElements(words, 1, 3);
        System.out.println(Arrays.toString(words) + "\n");

        System.out.println("Using the same method to Integer array:");
        Integer[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        swapElements(numbers, 1, 3);
        System.out.println(Arrays.toString(numbers)+"\n");

        System.out.println("Task #2:");
        String[] strings1 = {"hello", "what", "how", "so", "many"};
        System.out.println("Before using the method it is an array:");
        System.out.println(Arrays.toString(strings1));
        ArrayList<String> strings2 = getArrayList(strings1);
        System.out.println("After using the method it is already an ArrayList:");
        System.out.println(strings2.toString() + "\n");

        System.out.println("Big task #3:" );
        ArrayList<Fruit> oranges = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            oranges.add(new Orange());
        }

        ArrayList<Fruit> apples = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            apples.add(new Apple());
        }

        ArrayList<Fruit> otherApples = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            otherApples.add(new Apple());
        }

        try {
            Box<Fruit> OrangesBox = new Box<>(oranges);
            System.out.println("Weight of box with oranges:" + OrangesBox.getWeight());

            Box<Fruit> ApplesBox = new Box<>(apples);
            System.out.println("Weight of box with apples:" + ApplesBox.getWeight());

            System.out.println("Are two boxes equal? -" + OrangesBox.compare(ApplesBox) + "\n");

            System.out.println("Remove one apple");
            ApplesBox.removeFruit(0);
            System.out.println("Weight of box with oranges:" + OrangesBox.getWeight());
            System.out.println("Weight of box with apples:" + ApplesBox.getWeight());
            System.out.println("Are two boxes equal now? -" + OrangesBox.compare(ApplesBox) + "\n");

            Box<Fruit> AnotherOrangesBox = new Box<>(otherApples);
            System.out.println("Weight of box with apples:" + ApplesBox.getWeight());
            System.out.println("Weight of box with other apples:" + AnotherOrangesBox.getWeight());
            System.out.println("Moving apples from ApplesBox to AnotherApplesBox...");
            ApplesBox.moveFruits(AnotherOrangesBox);
            System.out.println("Weight of box with apples:" + ApplesBox.getWeight());
            System.out.println("Weight of box with other apples:" + AnotherOrangesBox.getWeight());
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }


    }

    public static <T> void swapElements(T[] array, int firstElemIndex, int secondElemIndex){
        T storage = array[firstElemIndex];
        array[firstElemIndex] = array[secondElemIndex];
        array[secondElemIndex] = storage;
    }

    public static <T> ArrayList<T> getArrayList(T[] a){
        return new ArrayList<T>(Arrays.asList(a));
    }
}
