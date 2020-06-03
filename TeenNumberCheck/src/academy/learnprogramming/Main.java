package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
    }

    public static boolean hasTeen(int int1, int int2, int int3) {
        return isTeen(int1) || isTeen(int2) || isTeen(int3);
    }

    public static boolean isTeen(int int1) {
        return int1 >= 13 && int1 <= 19;
    }
}
