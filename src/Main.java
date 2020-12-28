import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Performing task 1:");
        String[] words = {"cat", "dog", "frog", "dog", "dog", "fox", "cat", "monkey", "dog", "frog", "donkey", "monkey", "cat", "frog",};
        HashMap<String, Integer> wordsMap = new HashMap<>();

        for (String word : words) {
            if (wordsMap.containsKey(word)){
                wordsMap.replace(word, wordsMap.get(word)+1);
            }
            else{
                wordsMap.put(word, 1);
            }
        }

        for(Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            System.out.printf("Word \"%s\" - %d times\n", entry.getKey(), entry.getValue());
        }

        System.out.println();
        System.out.println("Performing task 2:");
        Phonebook.add(new Record("Smith", "3(734)5655"));
        Phonebook.add(new Record("Smith", "+113765509"));
        Phonebook.add(new Record("Ivanov", "33765509"));
        Phonebook.add(new Record("Carlos", "567765509"));
        Phonebook.add(new Record("Ivanov", "+223225509"));
        Phonebook.add(new Record("Jones", "563335509"));
        Phonebook.add(new Record("Martinez", "1(711)65509"));
        Phonebook.add(new Record("White", "933765509"));

        System.out.println("Smith's number(s): ");
        for (Record record : Phonebook.get("Smith")) {
            System.out.println(record.getPhoneNumber());
        }
        System.out.println();

        System.out.println("Ivanov's number(s): ");
        for (Record record : Phonebook.get("Ivanov")) {
            System.out.println(record.getPhoneNumber());
        }
        System.out.println();

        System.out.println("Martinez's number(s): ");
        for (Record record : Phonebook.get("Martinez")) {
            System.out.println(record.getPhoneNumber());
        }
    }
}
