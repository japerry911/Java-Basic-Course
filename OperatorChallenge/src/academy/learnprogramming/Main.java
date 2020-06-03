package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        double doubleVariable = 20.00d;
        double doubleVariable2 = 80.00d;

        double addedTogetherAndMultiplied = (doubleVariable + doubleVariable2) * 100.00d;
        double remainder1 = addedTogetherAndMultiplied % 40.00d;

        boolean boolVariable1 = remainder1 == 0.00d;

        System.out.println(boolVariable1);

        if (!boolVariable1) {
            System.out.println("Got some remainder");
        } else {
            System.out.println("No remainder");
        }
    }
}
