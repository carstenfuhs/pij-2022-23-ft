public MySimpleMap implements SimpleMap {
    // idea for the member variable:
    // linked list, with a pair of key and name as entries
    //
    // refinement: put the keys in ascending order
    // (entry with small key before entry with large key)
    private MapEntry firstEntry; // MapEntry: with getters and setter

    public MySimpleMap() {
        firstEntry = null;
    }

    public void put(int key, String name) {
        // if key is not known (no entry with key in the list)
        // then add at the corresponding position to keep
        // the entry keys in ascending order

        // if key is already known
        // then replace the name in the entry
    }

    public String get(int key) {
        // similar to put wrt strategy
    }
    public void remove(int key) {
        // find the previous entry and update it (see Ex 1)
    }
    public boolean isEmpty() {
        return firstEntry == null; // recommended
        /*
        if (firstEntry == null) {
            return true;
        } else {
            return false;
        }
        */
    }
}
