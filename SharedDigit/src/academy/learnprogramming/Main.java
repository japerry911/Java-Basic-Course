package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println((hasSharedDigit(9, 99)));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int int1, int int2) {
        if (int1 < 10 || int1 > 99 || int2 < 10 || int2 > 99) {
            return false;
        }

        int loopNumber1 = int1;

        while (loopNumber1 > 0) {
            int loopNumber2 = int2;

            int currentDigit1 = loopNumber1 % 10;

            while (loopNumber2 > 0) {
                int currentDigit2 = loopNumber2 % 10;

                if (currentDigit1 == currentDigit2) {
                    return true;
                }

                loopNumber2 /= 10;
            }

            loopNumber1 /= 10;
        }

        return false;
    }
}
