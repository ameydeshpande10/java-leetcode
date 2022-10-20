package easy;

import java.util.ArrayList;
import java.util.List;

// 1436.
public class DestinationCity {
    public static void main(String[] args) {
        List<List<String>> paths = new ArrayList<List<String>>();
        List<String> a = new ArrayList<>();
        a.add("London");
        a.add("New York");
        paths.add(a);
        a = new ArrayList<>();
        a.add("New York");
        a.add("Lima");
        paths.add(a);
        a = new ArrayList<>();
        a.add("Lima");
        a.add("Sao Paulo");
        paths.add(a);
        a = new ArrayList<>();
        System.out.println(destCity(paths));
    }

    public static String destCity(List<List<String>> paths) {
        List<String> from = new ArrayList<>();
        List<String> to = new ArrayList<>();
        for (List<String> list : paths) {
            from.add(list.get(0));
            to.add(list.get(1));
        }
        to.removeAll(from);
        return to.get(0);

    }
}
