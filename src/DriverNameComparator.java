import java.util.Comparator;

public class DriverNameComparator implements Comparator<Driver> {    // this class is to be able to compare names (later on to sort by name)
    @Override
    public int compare(Driver o1, Driver o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
