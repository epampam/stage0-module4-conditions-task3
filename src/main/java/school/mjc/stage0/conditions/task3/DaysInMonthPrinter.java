package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        int days = month == 2 ? 28 : (month < 1 || month > 12 ? -1 : 31 - ((month - 1) % 7 % 2));
        System.out.println(days < 0 ? "wrong number!" : days);
    }
}
