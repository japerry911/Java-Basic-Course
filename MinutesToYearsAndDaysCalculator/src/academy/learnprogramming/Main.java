package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            int minutesInDay = 60 * 24;
            int rawTotalDays = (int)(minutes / minutesInDay);

            int calcYears = rawTotalDays / 365;
            int calcDays = rawTotalDays % 365;

            System.out.println(minutes + " min = " + calcYears + " y and " + calcDays + " d");
        }
    }
}
