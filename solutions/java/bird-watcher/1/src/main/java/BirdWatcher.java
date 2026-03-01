
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay.clone();
    }

    public int getToday() {
        return this.birdsPerDay[this.birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        int today = getToday() +1;
        this.birdsPerDay[this.birdsPerDay.length - 1] = today;

    }

    public boolean hasDayWithoutBirds() {
        for (int j : this.birdsPerDay) {
            if (j == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        for (int j = 0; j < numberOfDays; j++) {
            if (j >= this.birdsPerDay.length) {
                return count;
            }
            count += this.birdsPerDay[j];
        }
        return count;
    }

    public int getBusyDays() {
        int count = 0;
        for (int j: this.birdsPerDay) {
            if (j >=5){
                count++;
            }
        }
        return count;
    }
}
