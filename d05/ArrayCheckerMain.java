public class ArrayCheckerMain {

    public static void main(String[] args) {
        ArrayChecker checker = new ArrayChecker();
        int[] myArray = new int[4];
        myArray[0] = 3;
        myArray[1] = 2;
        myArray[2] = 2;
        myArray[3] = 3;
        int[] myArray2 = { 2,3,4,3,5 };
        if (! checker.isSymmetrical(myArray2)) {
            int[] result = checker.reverse(myArray2);
            for (int i = 0; i < result.length; i++) {
                System.out.println(result[i]);
            }
        }
    }
}
