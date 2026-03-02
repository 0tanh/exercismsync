class NeedForSpeed {
    int speed;
    int distanceDriven;
    int batteryDrain;
    int battery;
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.distanceDriven = 0;
        this.battery = 100;
    }

    public boolean batteryDrained() {
        return battery < batteryDrain;
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        if (!batteryDrained()) {
            this.battery -= batteryDrain;
            this.distanceDriven += speed;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    int distance;
    RaceTrack(int distance) {
       this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {

        double howManyDrives = (double) distance / car.speed;
        double output = howManyDrives * car.batteryDrain;

        System.out.println(output);
        return howManyDrives * car.batteryDrain <= 100;
    }
}
