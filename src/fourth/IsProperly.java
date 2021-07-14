package fourth;

public class IsProperly {

    public static Boolean isProperly(String sequence) {

        int firstCount = 0;
        int lastCount = 0;


        if (sequence.charAt(0) == ')') {

            return false;
        }

        for (int i = 1; i < sequence.length() + 1; i++) {

            if (sequence.charAt(i - 1) == '(') {

                firstCount++;


            }
            if (sequence.charAt(i - 1) == ')') {

                lastCount++;

            }


            if (lastCount > firstCount) {

                return false;
            }


        }

        return firstCount == lastCount;


    }


}
