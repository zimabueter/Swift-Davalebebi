package third;

import java.util.Arrays;

public class NotContains {


    public static int notContains(int[] array) {

        int arrayLength = array.length;
        int minPositive = 0;

        Arrays.sort(array);


        for (int i = 0; i < arrayLength; i++) {

            if (array[i] > 0) {

                minPositive = i;

                break;


            }


        }

        int[] positiveMassive = Arrays.copyOfRange(array, minPositive, arrayLength);


        int[] newMassive = new int[arrayLength - minPositive];
        int newMassiveLength = newMassive.length;

        for (int i = 1; i < newMassiveLength + 1; ++i) {
            newMassive[i - 1] = i;
        }


        if (positiveMassive[0] > 1) {

            return 1;
        }


        for (int i = 0; i < newMassiveLength; i++) {

            if (positiveMassive[i] == newMassive[i]) {

                continue;
            } else {

                return newMassive[i];
            }

        }


        return 0;


    }

}
