package com.twair;

/**
 * Created by Srinath on 2/4/2016.
 */
public class ResultFlight {
    Flight flight;
    ClassType classType;
    int numberOfSeats;
    double totalCost;

    public ResultFlight(Flight flight, ClassType classType,int numberOfSeats) {
        this.flight = flight;
        this.numberOfSeats = numberOfSeats;
        this.classType = classType;
    }

    public double calculateCost() {
        return numberOfSeats * flight.getTravelClassForAClassType(classType).getCostPerSeat();
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public ClassType getClassType() {
        return classType;
    }

    public void setClassType(ClassType classType) {
        this.classType = classType;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
}
