import java.util.List;

public class BinarySearch {
    
    public static boolean search(List<Integer> list, int wanted) {
        if (list.isEmpty()) {
            return false;
        }
        int middleValue = list.get(list.size()/2);
        if (wanted == middleValue) {
            return true;
        }
        if (wanted < middleValue) {
            // if wanted is in the list at all, it must be in the first half
            List<Integer> shorterList = list.subList(0, list.size()/2);
            return search(shorterList, wanted);
        }
        // wanted > middleValue, so
        // if wanted is in the list at all, it must be in the second half
        List<Integer> shorterList = list.subList(list.size()/2 + 1, list.size());
        return search(shorterList, wanted);
    }
    
    public static void main(String[] args) {
        List<Integer> list = List.of(2, 5, 7, 8, 9, 10);
        int wanted = 30;
        boolean found = search(list, wanted);
        System.out.println(list + " has " + wanted + ": " + found);
    }
}
