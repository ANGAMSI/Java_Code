import java.util.ArrayList;
import java.util.List;

public class ListIterationExample {
    /**
     * The main entry point for the ListIterationExample application.
     *
     * <p>
     * This method attempts to create a list of names, add three names ("Alice", "Bob", "Charlie")
     * to the list, and then iterate over the list to print each name to the console.
     * However, the list is initialized to <code>null</code>, which will cause a {@link NullPointerException}
     * when attempting to add elements.
     * </p>
     *
     * @param args Command line arguments (not used)
     * @throws NullPointerException when attempting to add an element to a null list
     */
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

