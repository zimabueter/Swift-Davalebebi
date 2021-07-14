package second;

public class MinSplit {


    public static int minSplit(int amount) {
        int temp;
        int a = amount / 50;


        temp = amount % 50;

        int b = temp / 20;

        temp = temp % 20;

        int c = temp / 10;

        temp = temp % 10;

        int d = temp / 5;


        return a + b + c + d;


    }

}
