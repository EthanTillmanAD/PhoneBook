public class Main {
    public static void main(String[] args) {


        PhoneBook phoneBook = new PhoneBook();


        phoneBook.addAll("Ethan", "4439877732", "4436558793");
        phoneBook.addAll("Anai", "4439877732", "2239987432");

        System.out.println(phoneBook.getMap());

        System.out.println(phoneBook.hasEntry("Etha"));

        System.out.println(phoneBook.lookup("Ethan"));

        System.out.println(phoneBook.getAllContactNames());

        System.out.println(phoneBook.reverseLookup("2239987432"));
        //phoneBook.remove("Ethan");
        //System.out.println( phoneBook.getMap());
    }
}
