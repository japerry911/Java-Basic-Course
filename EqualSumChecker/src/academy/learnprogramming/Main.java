package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 1, 1));
        System.out.println(hasEqualSum(1, 1, 2));
        System.out.println(hasEqualSum(1, -1, 0));
    }

    public static boolean hasEqualSum(int param1, int param2, int param3) {
        return param1 + param2 == param3;
    }
}
