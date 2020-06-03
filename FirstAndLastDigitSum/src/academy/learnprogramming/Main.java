package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int firstDigit = 0;
        int lastDigit = 0;
        int loopNumber = number;

        while (loopNumber > 0) {
            if (loopNumber == number) {
                firstDigit = loopNumber % 10;
            }

            if (loopNumber / 10 <= 0) {
                lastDigit = loopNumber % 10;
                break;
            }

            loopNumber /= 10;
        }

        return firstDigit + lastDigit;
    }
}
