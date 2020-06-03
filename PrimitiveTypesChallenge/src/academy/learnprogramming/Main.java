package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        byte byteVariable = 120;
        short shortVariable = 1200;
        int intVariable = 12000;
        long longVariable = 50000L + (10L * (byteVariable + shortVariable + intVariable));
        System.out.println(longVariable);

        short shortTotal = (short)(1000 + 10 * (byteVariable + shortVariable + intVariable));
        System.out.println(shortTotal);
    }
}
