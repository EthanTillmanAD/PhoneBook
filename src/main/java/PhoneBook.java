import java.util.*;
import static java.util.Map.*;

public class PhoneBook {
    private final Map<String, List<String>> phoneBook;

    public PhoneBook(Map<String, List<String>> map) {
        this.phoneBook = map;
    }

    public PhoneBook() {
        this(new HashMap<>());
    }

    public void add(String name, String phoneNumber) {
        List<String> x = new ArrayList<>();
        x.add(phoneNumber);
        phoneBook.put(name, x);
    }

    public void addAll(String name, String... phoneNumbers) {
        phoneBook.put(name, Arrays.asList(phoneNumbers));

    }

    public void remove(String name) {
        phoneBook.remove(name);
    }

    public Boolean hasEntry(String name) {
        if (phoneBook.containsKey(name)){
            return true;
        }else {

            return false;
        }
    }

    public List<String> lookup(String name) {
        if (phoneBook.containsKey(name)) {
            return phoneBook.get(name);
        }else{
            return null;
        }

    }

    public String reverseLookup(String phoneNumber) {

        for (Entry<String, List<String>> entry : phoneBook.entrySet()){
            if (entry.getValue().contains(phoneNumber)){

                return entry.getKey();

            }
        }

        return "Not in phone book";
    }

    public List<String> getAllContactNames() {

        List<String> names = new ArrayList<>();

        names.add(phoneBook.keySet().toString());

        return names;
    }

    public Map<String, List<String>> getMap() {
        return phoneBook;
    }
}

