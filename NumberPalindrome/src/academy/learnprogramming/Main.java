package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;

        if (number < 0) {
            number = Math.abs(number);
        }

        int num = number;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        return number == reverse;
    }
}
