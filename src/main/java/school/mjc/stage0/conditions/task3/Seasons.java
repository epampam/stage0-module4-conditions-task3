package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        String season = month < 1 || month > 12 ? "wrong number!" :
                month < 3 || month == 12 ? "Winter" :
                        month < 6 ? "Spring" :
                                month < 9 ? "Summer" :
                                        "Autumn";
        System.out.println(season);
    }
}
