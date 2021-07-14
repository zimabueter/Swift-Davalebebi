package fifth;

public class CountVariants {
    public static int countVariants(int stairsCount) {


        if (stairsCount == 1 || stairsCount == 0) {
            return 1;
        } else {
            return countVariants(stairsCount - 1) + countVariants(stairsCount - 2);
        }


    }
}
