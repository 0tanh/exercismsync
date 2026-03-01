public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double standardCars = 221;
        double successRate = 0;
        if (speed <= 4){
           successRate = 1;
        } else if (speed <= 8) {
           successRate = 0.9;
        } else if (speed == 9) {
           successRate = 0.8;
        } else if (speed == 10) {
           successRate = 0.77;
        }
        double howManyCars = successRate * standardCars;
        return (double) speed * howManyCars;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / 60);
    }
}
