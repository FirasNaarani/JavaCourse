package Pack7;

public enum DayOfWeek {
    SUNDAY(1),
    MONDAY(2),
    THUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);

    int DayNumber;

    DayOfWeek(int DayNumber) {
        this.DayNumber = DayNumber;
    }
}
