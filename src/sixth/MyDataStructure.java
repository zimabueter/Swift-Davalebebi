package sixth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class MyDataStructure {
    ArrayList<Integer> arr;
    HashMap<Integer, Integer> hash;
    public MyDataStructure() {
        arr = new ArrayList<>();
        hash = new HashMap<>();
    }

    @Override
    public String toString() {
        return "sixth.MyDS{" +
                "arr=" + arr +
                ", hash=" + hash +
                '}';
    }

    public void add(int x) {
        if (hash.get(x) != null)
            return;

        int s = arr.size();
        arr.add(x);

        hash.put(x, s);
    }

    public void remove(int x) {
        Integer index = hash.get(x);
        if (index == null)
            return;

        hash.remove(x);

        // Swap element with last element so that remove from
        // arr[] can be done in O(1) time
        int size = arr.size();
        Integer last = arr.get(size - 1);
        Collections.swap(arr, index, size - 1);

        // Remove last element (This is O(1))
        arr.remove(size - 1);

        hash.put(last, index);
    }


}