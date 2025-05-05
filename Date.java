//then date class#

package Testing;

public class Date {
    private int day;
    private int month;
    private int year;

    //constructors method#
    public Date() {
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    //setters and getters method#
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    //to string method.
    @Override
    public String toString() {
        return "("+day+"-"+ month+"-"+ year+")";
    }

}
