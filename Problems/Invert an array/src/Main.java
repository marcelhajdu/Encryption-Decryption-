// do not remove imports
import java.util.*;
import java.util.function.Function;

class ArrayUtils {
    public static <E> E[] invert(E[] array) {
        List<E> list = Arrays.asList(array);
        Collections.reverse(list);
        for(int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}