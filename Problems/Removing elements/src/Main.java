import java.util.*;

class SetUtils {

    public static Set<Integer> getSetFromString(String str) {
        String[] sArr = str.split(" ");
        int[] numbers = new int[sArr.length];
        for(int i = 0; i < sArr.length; i++) {
            numbers[i] = Integer.parseInt(sArr[i]);
        }
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i : numbers) {
            set.add(i);
        }
        return set;
    }

    public static void removeAllNumbersGreaterThan10(Set<Integer> set) {
        set.removeIf(s -> s > 10);
    }

}

/* Do not change code below */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        Set<Integer> set = SetUtils.getSetFromString(numbers);
        SetUtils.removeAllNumbersGreaterThan10(set);
        set.forEach(e -> System.out.print(e + " "));
    }
}