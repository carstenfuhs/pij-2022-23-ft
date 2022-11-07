import java.util.*;
public class Ex1 {
    public static void main(String[] args) {
        Ex1 ex1 = new Ex1();
        // take the number as a command-line argument so that
        // we do not need to re-compile to try different values
        ex1.launch( Integer.parseInt(args[0]) );
    }
    public void launch(int userInput) {
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        intList.add(6);
        try {// 1,2,3,4,5,6
            //Object o = null;
            //int x = o.hashCode();
            intList.remove(0); // 2,3,4,5,6
            System.out.println(intList.get(userInput)); // 2
            intList.remove(0); // 3,4,5,6
            System.out.println(intList.get(userInput)); // 3
            intList.remove(0); // 4,5,6
            System.out.println(intList.get(userInput)); // 4
            intList.remove(0); // 5,6
            System.out.println(intList.get(userInput)); // 5
            intList.remove(0); // 6
            System.out.println(intList.get(userInput)); // 6
            intList.remove(0); // empty list!
            System.out.println(intList.get(userInput)); // Exception!
            intList.remove(0);
            System.out.println(intList.get(userInput));
        } catch (IndexOutOfBoundsException e) { // in the real world: do not catch this!
            e.printStackTrace();
        } /*catch (NullPointerException e) {
            System.out.println("Null Pointer!");
            e.printStackTrace();
        }*/
    }
    // for input 0: lines 11-31 and then 34-35 are run
    // for input 2: lines 11-27 and then 34-35 are run
}
