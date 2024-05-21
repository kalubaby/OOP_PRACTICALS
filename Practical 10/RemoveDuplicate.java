
import java.util.ArrayList;
import java.util.HashSet;

 class RemoveDuplicate {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(1);
        System.out.println("Original List: " + list);
        ArrayList<Integer> newList = removeDuplicates(list);
        System.out.println("List without duplicates: " + newList);
    }

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {

        HashSet<E> set = new HashSet<>(list);

        ArrayList<E> newList = new ArrayList<>(set);

        return newList;
    }
}
