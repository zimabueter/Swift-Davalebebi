import fifth.CountVariants;
import first.Palindrome;
import fourth.IsProperly;
import second.MinSplit;
import sixth.MyDataStructure;
import third.NotContains;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 8, 99, 4, 0, 3, 1, 2};
        System.out.println(Palindrome.isPalindrome("reverse"));
        System.out.println(MinSplit.minSplit(36));
        System.out.println(NotContains.notContains(arr));
        System.out.println(IsProperly.isProperly(")())()(("));
        System.out.println(CountVariants.countVariants(10));
        MyDataStructure data = new MyDataStructure();
        // we can only add integers
        data.add(1);
        data.add(5);
        data.add(7);
        data.remove(5);
        System.out.println(data);

        // Eighth task is checked inside the package
    }
}
