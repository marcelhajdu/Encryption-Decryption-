import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array = sc.nextLine().split(" ");
        List<String> yourList = List.of(array);
        System.out.println(yourList);
    }

    LinkedList<Integer> list = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();
    List<Integer> list3 = new ArrayList<>();
    Collection<Integer> list4 = new ArrayList<>();
    LinkedList<Integer> list5 = new LinkedList<>(new ArrayList<>());
}