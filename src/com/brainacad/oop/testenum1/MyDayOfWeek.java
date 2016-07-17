package com.brainacad.oop.testenum1;

public enum MyDayOfWeek {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;

    public MyDayOfWeek nextDay() {

        if(this == SATURDAY){
            return SUNDAY;
        }

        int dayNumber = this.ordinal();
        MyDayOfWeek[] days = this.values();
        return days[dayNumber + 1];
    }

}
