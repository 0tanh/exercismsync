public class JedliksToyCar {
    private int mileage;
    private int battery;
    public JedliksToyCar() {
        this.mileage = 0;
        this.battery = 100;
    }
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", this.mileage );
    }

    public String batteryDisplay() {
        if (this.battery == 0) {
            return "Battery empty";
        }
        return String.format("Battery at %d", this.battery) + "%";
    }

    public void drive() {
        if (this.battery > 0) {
            this.battery -= 1;
            this.mileage += 20;
        }
    }
}
