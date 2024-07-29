import java.util.Comparator;

public class ComparatorClass implements Comparator<Visitor> { //creating a comparator class is done to create custom logic (using 2 instance variables) for object comparison
    @Override
    public int compare(Visitor v1, Visitor v2) {
        // Compare by name
        int nameComparison = v1.getName().compareTo(v2.getName());
        // If names are equal, compare by age
        if (nameComparison == 0) {
            return Integer.compare(v1.getAge(), v2.getAge());
        }
        return nameComparison;
    }
}
