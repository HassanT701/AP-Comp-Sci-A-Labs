
/**
 * Write a description of class cars here.
 *
 * @author (Hassan Talha)
 * @version (1/16/23)
 */
public class cars {
    private String make;
    private String model;
    private int year;
    private double distance;
    private int hours;
    private int minutes;
    public cars(String make, String model, int year, double distance, int hours, int minutes) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.distance = distance;
        this.hours = hours;
        this.minutes = minutes;
    }
    public cars() {
        this.make = "";
        this.model = "";
        this.year = 0;
        this.distance = 0;
        this.hours = 0;
        this.minutes = 0;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setDistance(double distance) {
        this.distance = distance;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public double getDistance() {
        return distance;
    }
    public int getHours() {
        return hours;
    }
    public int getMinutes() {
        return minutes;
    }
    public double calculateAverageSpeed() {
        double totalMinutes = hours * 60 + minutes;
        return distance / (totalMinutes / 60);
    }
    public String toString() {
        return "The " + year + " " + make + " " + model + " traveled " + distance + " miles in " + hours + " hours and " + minutes + " minutes for an average of " + calculateAverageSpeed() + " MPH.";
    }
}

