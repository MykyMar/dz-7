package org.example;

public enum SolarSystem {

    MERCURY(0, 2440, null),
    VENUS(50, 6052, MERCURY),
    EARTH(42, 6371, VENUS),
    MARS(78, 3390, EARTH),
    JUPITER(550, 69911, MARS),
    SATURN(650, 58232, JUPITER),
    URANUS(1450, 25362, SATURN),
    NEPTUNE(1620, 24622, URANUS);

    private final int prevDistance;
    private final int radius;
    private final SolarSystem previous;
    private final int distanceFromSun;
    private SolarSystem next;
    private final int sequenceNumber;


    SolarSystem(int prevDistance, int radius, SolarSystem previous) {
        this.prevDistance = prevDistance;
        this.radius = radius;
        this.previous = previous;
        this.sequenceNumber = this.ordinal() + 1;
        if (previous == null) {
            this.distanceFromSun = prevDistance;
        } else {
            this.distanceFromSun = previous.getDistanceFromSun() + prevDistance;
            previous.next = this;
        }
    }


    public SolarSystem getPrevious() {
        return previous;
    }

    public int getRadius() {
        return radius;
    }

    public int getPrevDistance() {
        return prevDistance;
    }

    public int getSequenceNumber() {
        return sequenceNumber;
    }

    public SolarSystem getNext() {
        return next;
    }

    public int getDistanceFromSun() {
        return distanceFromSun;
    }

}





