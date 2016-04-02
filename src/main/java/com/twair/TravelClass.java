package com.twair;

public class TravelClass {
    private ClassType classType;
    private Integer totalSeats;
    private Integer occupiedSeats;

    private double costPerSeat;

    public TravelClass(ClassType classType, Integer totalSeats, double costPerSeat) {
        this.classType = classType;
        this.totalSeats = totalSeats;
        this.occupiedSeats = 0;
        this.costPerSeat = costPerSeat;
    }

    public void book(int numberOfSeats) throws Exception {
        if(canBook(numberOfSeats) == false) {
            throw new Exception("Booking can not be made");
        }
        occupiedSeats += numberOfSeats;
    }

    public boolean canBook(Integer numberOfSetas) {
        if(occupiedSeats + numberOfSetas > totalSeats) {
            return false;
        }
        return true;
    }

    public ClassType getClassType() {
        return classType;
    }

    public double getCostPerSeat() {
        return costPerSeat;
    }

    public void setCostPerSeat(double costPerSeat) {
        this.costPerSeat = costPerSeat;
    }
}
