import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> lista = new ArrayList<>();
        lista.add(new EnglishPerson("John", "Smith", 23));
        lista.add(new EnglishPerson("Lisa", "Cudrow", 22));
        lista.add(new EnglishPerson("Amber", "Amaro", 21));
        lista.add(new EnglishPerson("Harry", "Potter", 21));
        lista.add(new PolishPerson("Grzegorz", "Brzęczysczykiewicz", 19));
        lista.add(new PolishPerson("Michał", "Anioł", 18));
        lista.add(new PolishPerson("Grażyna", "Parapet", 28));
        compareByName(lista);
        System.out.println("---------------");
        compareBySurname(lista);
        System.out.println("---------------");
        compareByAge(lista);
    }
    public static void compareByName (List<Person> lista){
        System.out.println("Sorting list by SURNAME");
        Collections.sort(lista);
        for (Person person : lista) {
            System.out.println(person.toString());
        }
    }
    public static void compareBySurname (List<Person> lista){
        System.out.println("Sorting list by SURNAME");
        Collections.sort(lista, new surnameComparator());
        for (Person person : lista){
            System.out.println(person.toString());
        }
    }
    public static void compareByAge (List<Person> lista){
        System.out.println("Sorting list by AGE");
        Collections.sort(lista, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        });
        for (Person person : lista){
            System.out.println(person.toString());
        }
    }
}
