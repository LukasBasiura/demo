package examples.junit;

import java.util.*;

/**
 * A class that shows that multiple assertions will be used in the generated
 * test cases.
 */
public class SimpleGenericHandler<T> {

    private T element;

    public SimpleGenericHandler(T element) {
        super();
        this.element = element;
    }

    public static Collection<Integer> getList() {
        List<Integer> list = new ArrayList<Integer>();
        return list;
    }

    public static <K, V> Map<K, V> getMap() {
        Map<K, V> map = new HashMap<K, V>();
        return map;
    }

    public String getString() {
        return "";
    }

    public T getElement() {
        return element;
    }
}
