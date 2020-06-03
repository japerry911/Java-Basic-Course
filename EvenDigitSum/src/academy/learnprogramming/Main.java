package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int returnSum = 0;
        int loopNumber = number;

        while (loopNumber > 0) {
            int currentDigit = loopNumber % 10;

            if (currentDigit % 2 == 0) {
                returnSum += currentDigit;
            }

            loopNumber /= 10;
        }

        return returnSum;
    }
}
