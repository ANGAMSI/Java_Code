import java.util.ArrayList;
import java.util.List;

public class ListIterationExample {
    public static void main(String[] args) {
        List<String> names = null;
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}

