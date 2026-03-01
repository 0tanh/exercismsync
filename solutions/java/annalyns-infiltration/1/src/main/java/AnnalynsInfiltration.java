class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || prisonerIsAwake || archerIsAwake;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return !archerIsAwake && prisonerIsAwake;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if (petDogIsPresent && knightIsAwake && !archerIsAwake && !prisonerIsAwake) {
            return true;
        }
        if (prisonerIsAwake && !knightIsAwake && !archerIsAwake) {
            return true;
        }

        if (!archerIsAwake && knightIsAwake && prisonerIsAwake && petDogIsPresent) {
            return true;
        }

        if (petDogIsPresent && !knightIsAwake && !archerIsAwake && !prisonerIsAwake) {
            return true;
        }
        return false;
    }
}
