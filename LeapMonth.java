package balex.leapmonth;

public class LeapMonth {
    public static boolean isLeapMonth(int year, int month) {
        boolean isLeapMonth = (year % 4 == 0);
        isLeapMonth = isLeapMonth && (year % 100 != 0);
        isLeapMonth = isLeapMonth || (year % 400 == 0);

        return isLeapMonth && month == 2;
    }

    public static void main(String[] args) {
        int year = 2024;
        int month = 6;

        if (isLeapMonth(year, month)) {
            System.out.println("Month " + month +  " of " + year + " is a leap month.");
        } else {
            System.out.println("Month " + month + " of " + year + " is not a leap month");
        }
    }
}





