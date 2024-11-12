package pac;

public class TestDate {
    public static void main(String[] args) {
        java.util.Date[] dates = new java.util.Date[10];

        dates[0] = new java.util.Date();

        System.out.println(dates[0]);
        System.out.println(dates[0].toString());
    }
}