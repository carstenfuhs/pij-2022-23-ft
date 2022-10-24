public class ArrayChecker {
  
    public boolean isSymmetrical(int[] a) {
        // [7,8,8,7] -> true
        // [5,6,9,6,5] -> true
        // [5,6,1,1,7,5] -> false

        // visit all entries of a, once only (no need to
        // compare the same pair twice)
        for (int i = 0; i < a.length / 2; i++) {
            // one mismatch is enough
            if (a[i] != a[a.length-1-i]) {
                return false;
            }
        }
        // we made it through the whole loop
        // without returning false
        return true;
    }

    public int[] reverse(int[] a) {
        int[] result = new int[a.length];
        //for (int i = 0; i < a.length; i++) {
        //  result[a.length - 1 - i] = a[i];
        //}
        for (int i = a.length - 1; i >= 0; i--) {
            result[a.length - 1 - i] = a[i];
        }
        //for (int i = 0; i < a.length / 2; i++) {
        //   result[a.length - 1 - i] = a[i]; 
        //}
        return result;
    }
}
