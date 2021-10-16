package uz.anvar.darsjadvali.model;

public class WeekDay {

    int id;
    String day, day_name;
    boolean active;

    public WeekDay(int id, String day, String day_name, boolean active) {
        this.id = id;
        this.day = day;
        this.day_name = day_name;
        this.active = active;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDay() {
        return day;
    }

    public String getDayName() {
        return day_name;
    }

    public boolean isActive() {
        return active;
    }
}
