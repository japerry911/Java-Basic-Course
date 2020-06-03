package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static void printEqual(int int1, int int2, int int3) {
        if (int1 < 0 || int2 < 0 || int3 < 0) {
            System.out.println("Invalid Value");
        } else if (int1 == int2 && int1 == int3) {
            System.out.println("All numbers are equal");
        } else if (int1 != int2 && int1 != int3 && int2 != int3) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
