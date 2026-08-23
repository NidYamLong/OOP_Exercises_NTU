package date_class;

/**
 *  @Author Leonardo Marques - 23/08/2026
*/


import date_class.exceptions.DateExceptions;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public final void setDay(int day) {
        dateValidation(day);
    }

    public final void setMonth(int month) {
        monthValidation(month);
    }

    public final void setYear(int year) {
        yearValidation(year);
    }

    public void setDate(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    @Override
    public String toString() {
        return String.format("%s/%s/%d", validateFormatDayAndMonth(getDay()),
                validateFormatDayAndMonth(getMonth()), getYear()
            );
    }

    // Data Validation

    private void dateValidation(int day) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        } else {
            throw new DateExceptions("Day invalid!!!");
        }
    } 
    
    private void monthValidation(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            throw new DateExceptions("Month invalid!!!");
        }
    }

    private void yearValidation(int year) {
        if (year >= 1900 && year <= 9999) {
            this.year = year;
        } else {
            throw new DateExceptions("Year invalid!!!");
        }
    }

    private String validateFormatDayAndMonth(int dayOrMonth) {
        return (dayOrMonth < 10) ? "0" + Integer.toString(dayOrMonth): Integer.toString(dayOrMonth);
    }
}
