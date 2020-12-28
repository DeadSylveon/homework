import java.util.ArrayList;
import java.util.HashMap;

public class Phonebook {
    public static ArrayList<Record> records = new ArrayList<>();

    public static void add(Record record){
        Phonebook.records.add(record);
    }


    public static ArrayList<Record> get(String lastName){
        ArrayList<Record> returnRecords = new ArrayList<>();
        for (Record record : Phonebook.records) {
            if (record.getLastName().equals(lastName)) returnRecords.add(record);
        }
        return returnRecords;
    }


}
